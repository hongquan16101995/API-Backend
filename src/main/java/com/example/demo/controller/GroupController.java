package com.example.demo.controller;

import com.example.demo.models.Groups;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping
    public ResponseEntity<Iterable<Groups>> getAll(){
        Iterable<Groups> groups = groupService.findAll();
        return new ResponseEntity<>(groups, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Groups> createGroups(@RequestBody Groups groups){
        groupService.updateGroup(groups);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Groups> updateGroups(@RequestBody Groups groups){
        groupService.updateGroup(groups);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Groups> deleteGroups(@PathVariable("id") Long id){
        groupService.deleteGroup(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

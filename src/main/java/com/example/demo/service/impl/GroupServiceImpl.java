package com.example.demo.service.impl;

import com.example.demo.models.Groups;
import com.example.demo.repository.GroupRepository;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Iterable<Groups> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Groups findOne(Long id) {
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public void updateGroup(Groups groups) {
        groupRepository.save(groups);
    }
}

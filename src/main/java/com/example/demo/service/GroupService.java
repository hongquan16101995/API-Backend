package com.example.demo.service;

import com.example.demo.models.Groups;

public interface GroupService {
    Iterable<Groups> findAll();

    Groups findOne(Long id);

    void deleteGroup(Long id);

    void updateGroup(Groups groups);
}

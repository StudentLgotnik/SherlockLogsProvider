package com.mkaza.sherlock.service;

import com.mkaza.sherlock.database.UserRepository;
import com.mkaza.sherlock.database.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    UserRepository repository = new UserRepository();

    public List<User> findByName(String name) {
        return repository.getAll().stream().filter(u -> u.getName().equals(name)).collect(Collectors.toList());
    }

    public User getById(long id) {
        return repository.getById(id);
    }

    public User getByName(String name) {
        return repository.getAll().stream().filter(u -> u.getName().equals(name)).findFirst().orElse(null);
    }

    public User getBySurname(String surname) {
        return repository.getAll().stream().filter(u -> u.getName().equals(surname)).findFirst().orElse(null);
    }
}

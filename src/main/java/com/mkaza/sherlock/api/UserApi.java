package com.mkaza.sherlock.api;

import com.mkaza.sherlock.database.entity.User;
import com.mkaza.sherlock.service.UserService;

import java.util.List;

public class UserApi {

    UserService service = new UserService();

    public List<User> findUserByName(String name) {
        return service.findByName(name);
    }

    public User getUserById(long id) {
        return service.getById(id);
    }

    public User getUserByName(String name) {
        return service.getByName(name);
    }

    public User getUserBySurname(String surname) {
        return service.getBySurname(surname);
    }
}

package com.mkaza.sherlock.service;

import com.mkaza.sherlock.database.entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class UserServiceTest {

    UserService userService = new UserService();

    @Test
    public void findByNameTest() {

        List<User> users = userService.findByName("Maksym");

        Assert.assertFalse(users.isEmpty());
    }

    @Test
    public void getByNameTest() {

        User user = userService.getByName("Maksym");

        Assert.assertNotNull(user);
    }

    @Test
    public void getBySurenameTest() {

        User user = userService.getBySurname("Kazarin");

        Assert.assertNotNull(user);
    }

    @Test
    public void getByIdTest() {

        User user = userService.getById(1);

        Assert.assertNotNull(user);
    }
}

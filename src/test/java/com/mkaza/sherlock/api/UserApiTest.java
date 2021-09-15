package com.mkaza.sherlock.api;

import com.mkaza.sherlock.database.entity.User;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class UserApiTest {

    @Test
    public void findUserByNameTest() {
        UserApi api = new UserApi();
        String username = "UserApiTest";

        List<User> users = api.findUserByName(username);

        Assert.assertFalse(String.format("Users by name %s not found", username), users.isEmpty());
    }

    @Test
    public void getUserByIdTest() {
        UserApi api = new UserApi();
        Long userId = 1L;

        User user = api.getUserById(userId);

        Assert.assertNotNull(String.format("User by id %s not found", userId), user);
        Assert.assertEquals(String.format("User has wrong id: %s", userId), user.getId(), userId);
    }

    @Test
    public void getUserByNameTest() {
        UserApi api = new UserApi();
        String username = "UserApiTest";

        User user = api.getUserByName(username);

        Assert.assertNotNull(String.format("User by name %s not found", username), user);
        Assert.assertEquals(String.format("User has wrong name: %s", username), user.getName(), username);
    }

    @Test
    public void getUserBySurnameTest() {
        UserApi api = new UserApi();
        String userSurname = "UserApiTest";

        User user = api.getUserBySurname(userSurname);

        Assert.assertNotNull(String.format("Users by id %s not found", userSurname), user);
        Assert.assertEquals(String.format("User has wrong surname: %s", userSurname), user.getSurname(), userSurname);
    }
}

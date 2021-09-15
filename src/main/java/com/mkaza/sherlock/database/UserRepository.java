package com.mkaza.sherlock.database;

import com.mkaza.sherlock.database.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public User getById(long id) {
        return getAll().stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public List<User> getAll() {
        List<User> products = new ArrayList<User>();
        try {
            PreparedStatement preparedStatement = DatabaseConnectionUtil.getConnection()
                    .prepareStatement("select * from user");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                User product = new User();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setSurname(resultSet.getString("surename"));
                products.add(product);
            }
        } catch (Exception e) {
            products = null;
        }
        return products;
    }
}

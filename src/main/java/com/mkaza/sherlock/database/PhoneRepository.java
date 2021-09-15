package com.mkaza.sherlock.database;

import com.mkaza.sherlock.database.entity.Phone;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {

    public Phone getById(long id) {
        return getAll().stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public List<Phone> getAll() {
        List<Phone> products = new ArrayList<Phone>();
        try {
            PreparedStatement preparedStatement = DatabaseConnectionUtil.getConnection()
                    .prepareStatement("select * from phone");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Phone product = new Phone();
                product.setId(resultSet.getLong("id"));
                product.setPhone(resultSet.getString("phone"));
                product.setCountry(resultSet.getString("country"));
                products.add(product);
            }
        } catch (Exception e) {
            products = null;
        }
        return products;
    }
}

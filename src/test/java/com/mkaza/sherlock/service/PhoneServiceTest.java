package com.mkaza.sherlock.service;

import com.mkaza.sherlock.database.entity.Phone;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PhoneServiceTest {

    PhoneService phoneService = new PhoneService();

    @Test
    public void findByCountryTest() {

        List<Phone> phones = phoneService.findByCountry("Maksym");

        Assert.assertFalse(phones.isEmpty());
    }

    @Test
    public void getByPhoneTest() {

        Phone phone = phoneService.getByPhone("0123456789");

        Assert.assertNotNull(phone);
    }

    @Test
    public void getByIdTest() {

        Phone phone = phoneService.getById(1);

        Assert.assertNotNull(phone);
    }
}

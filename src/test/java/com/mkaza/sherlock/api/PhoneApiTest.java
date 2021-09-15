package com.mkaza.sherlock.api;

import com.mkaza.sherlock.database.entity.Phone;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PhoneApiTest {

    @Test
    public void findPhoneByCountryTest() {
        PhoneApi api = new PhoneApi();
        String phoneCountry = "PhoneApiTestCountry";

        List<Phone> Phones = api.findPhoneByName(phoneCountry);

        Assert.assertFalse(String.format("Phones by country %s not found", phoneCountry), Phones.isEmpty());
    }

    @Test
    public void getPhoneByIdTest() {
        PhoneApi api = new PhoneApi();
        Long PhoneId = 1L;

        Phone Phone = api.getPhoneById(PhoneId);

        Assert.assertNotNull(String.format("Phone by id %s not found", PhoneId), Phone);
        Assert.assertEquals(String.format("Phone has wrong id: %s", PhoneId), Phone.getId(), PhoneId);
    }

    @Test
    public void getPhoneByNumberTest() {
        PhoneApi api = new PhoneApi();
        String phoneNumber = "PhoneApiTestNumber";

        Phone Phone = api.getPhoneByName(phoneNumber);

        Assert.assertNotNull(String.format("Phone by name %s not found", phoneNumber), Phone);
        Assert.assertEquals(String.format("Phone has wrong name: %s", phoneNumber), Phone.getPhone(), phoneNumber);
    }

}

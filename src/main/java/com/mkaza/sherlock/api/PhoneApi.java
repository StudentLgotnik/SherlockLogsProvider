package com.mkaza.sherlock.api;

import com.mkaza.sherlock.database.entity.Phone;
import com.mkaza.sherlock.service.PhoneService;

import java.util.List;

public class PhoneApi {

    PhoneService service = new PhoneService();

    public List<Phone> findPhoneByName(String name) {
        return service.findByCountry(name);
    }

    public Phone getPhoneById(long id) {
        return service.getById(id);
    }

    public Phone getPhoneByName(String name) {
        return service.getByPhone(name);
    }

}

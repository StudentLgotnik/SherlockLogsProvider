package com.mkaza.sherlock.service;

import com.mkaza.sherlock.database.PhoneRepository;
import com.mkaza.sherlock.database.PhoneRepository;
import com.mkaza.sherlock.database.entity.Phone;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneService {

    PhoneRepository repository = new PhoneRepository();

    public List<Phone> findByCountry(String country) {
        return repository.getAll().stream().filter(p -> p.getCountry().equals(country)).collect(Collectors.toList());
    }

    public Phone getById(long id) {
        return repository.getById(id);
    }

    public Phone getByPhone(String phone) {
        return repository.getAll().stream().filter(p -> p.getPhone().equals(phone)).findFirst().orElse(null);
    }
    
}

package com.example.hibernate_example.service;

import com.example.hibernate_example.model.City;
import com.example.hibernate_example.model.Country;

import java.util.List;

public interface CityService {
    City save(City City);

    List<City> getAll();

    City get(long id);

    City update(City City, long id);

    void delete(long id);
}

package com.example.demo.service;


import com.example.demo.dto.CountryDto;

import java.util.List;

public interface CountryService {
    List getAll();
    void addCountry(CountryDto countryDto);
}

package com.example.demo.controller;

import com.example.demo.dto.CountryDto;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Coun")
public class CountryApi {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(countryService.getAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> addCountry(@RequestBody CountryDto countryDto){
        countryService.addCountry(countryDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

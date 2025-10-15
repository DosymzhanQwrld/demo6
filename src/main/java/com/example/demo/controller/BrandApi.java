package com.example.demo.controller;

import com.example.demo.dto.BrandDto;
import com.example.demo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Bra")
public class BrandApi {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(brandService.getAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> addBrand(@RequestBody BrandDto brandDto){
        brandService.addBrand(brandDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

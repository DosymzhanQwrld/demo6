package com.example.demo.service;


import com.example.demo.dto.BrandDto;

import java.util.List;

public interface BrandService {
    List getAll();
    void addBrand(BrandDto brandDto);
}

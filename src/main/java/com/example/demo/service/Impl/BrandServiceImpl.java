package com.example.demo.service.Impl;

import com.example.demo.dto.BrandDto;
import com.example.demo.mapper.BrandMapper;
import com.example.demo.repository.BrandRepository;
import com.example.demo.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    @Override
    public List getAll() {
        return brandMapper.toDtoList(brandRepository.findAll());
    }

    @Override
    public void addBrand(BrandDto brandDto) {
        brandRepository.save(brandMapper.toEntity(brandDto));
    }
}

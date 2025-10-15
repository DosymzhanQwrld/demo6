package com.example.demo.service.Impl;

import com.example.demo.dto.CountryDto;
import com.example.demo.mapper.CountryMapper;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;
    @Override
    public List getAll() {
        return countryMapper.toDtoList(countryRepository.findAll());
    }

    @Override
    public void addCountry(CountryDto countryDto) {
        countryRepository.save(countryMapper.toEntity(countryDto));
    }
}

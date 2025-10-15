package com.example.demo.mapper;

import com.example.demo.dto.BrandDto;
import com.example.demo.dto.CountryDto;
import com.example.demo.model.Brand;
import com.example.demo.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    @Mapping(source = "name", target = "nameDto")
    @Mapping(source = "code", target = "codeDto")
    CountryDto toDto(Country country);
    @Mapping(source = "nameDto", target = "name")
    @Mapping(source = "codeDto", target = "code")
    Country toEntity(CountryDto countryDto);
    List<CountryDto> toDtoList(List<Country> countries);
}

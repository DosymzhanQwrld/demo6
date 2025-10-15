package com.example.demo.mapper;

import com.example.demo.dto.PhoneDto;
import com.example.demo.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, BrandMapper.class})
public interface PhoneMapper {
    @Mapping(source = "name", target = "nameDto")
    @Mapping(source = "description", target = "descriptionDto")
    @Mapping(source = "price", target = "priceDto")
    PhoneDto toDto(Phone phone);
    @Mapping(source = "nameDto", target = "name")
    @Mapping(source = "descriptionDto", target = "description")
    @Mapping(source = "priceDto", target = "price")
    Phone toEntity(PhoneDto phoneDto);
    List<PhoneDto> toDtoList(List<Phone> phones);
}

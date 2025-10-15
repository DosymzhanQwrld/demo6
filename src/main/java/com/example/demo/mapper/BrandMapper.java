package com.example.demo.mapper;

import com.example.demo.dto.BrandDto;
import com.example.demo.dto.PhoneDto;
import com.example.demo.model.Brand;
import com.example.demo.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BrandMapper {
    @Mapping(source = "name", target = "nameDto")
    BrandDto toDto(Brand brand);
    @Mapping(source = "nameDto", target = "name")
    Brand toEntity(BrandDto brandDto);
    List<BrandDto> toDtoList(List<Brand> brandes);
}

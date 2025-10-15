package com.example.demo.service.Impl;

import com.example.demo.dto.PhoneDto;
import com.example.demo.mapper.PhoneMapper;
import com.example.demo.model.Phone;
import com.example.demo.repository.PhoneRepository;
import com.example.demo.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicePhoneImpl implements PhoneService {
    private final PhoneRepository phoneRepository;
    private final PhoneMapper phoneMapper;
    @Override
    public List getAll() {
        return phoneMapper.toDtoList(phoneRepository.findAll());
    }

    @Override
    public PhoneDto getById(Long id) {
        return phoneMapper.toDto(phoneRepository.findById(id).orElse(null));
    }

    @Override
    public void addPhone(PhoneDto phoneDto) {
        phoneRepository.save(phoneMapper.toEntity(phoneDto));
    }

    @Override
    public void updPhone(Long id, PhoneDto phoneDto) {
        Phone phone = phoneRepository.findById(id).orElse(null);
        Phone phoneEntity = phoneMapper.toEntity(phoneDto);
        phone.setName(phoneDto.getNameDto());
        phone.setDescription(phoneDto.getDescriptionDto());
        phone.setPrice(phoneDto.getPriceDto());

        phone.setBrand(phoneEntity.getBrand());
        phone.setCountries(phoneEntity.getCountries());

        phoneRepository.save(phone);

    }

    @Override
    public boolean delPhone(Long id) {
        if (!phoneRepository.existsById(id)){
            return false;
        }
        phoneRepository.deleteById(id);
        return true;
    }
}

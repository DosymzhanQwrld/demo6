package com.example.demo.service;

import com.example.demo.dto.PhoneDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PhoneService {
    List getAll();
    PhoneDto getById(Long id);
    void addPhone(PhoneDto phoneDto);
    void updPhone(Long id, PhoneDto phoneDto);
    boolean delPhone(Long id);
}

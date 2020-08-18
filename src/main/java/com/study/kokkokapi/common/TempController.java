package com.study.kokkokapi.common;

import com.study.kokkokapi.persistence.entity.AreaEntity;
import com.study.kokkokapi.persistence.repository.AreaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TempController {
    private final AreaRepository areaRepository;

    public TempController(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @GetMapping("/areas")
    public List<AreaEntity> getAllAreas() {
        return areaRepository.findFirst();
    }
}
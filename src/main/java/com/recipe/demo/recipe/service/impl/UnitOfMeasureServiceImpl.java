package com.recipe.demo.recipe.service.impl;

import com.recipe.demo.recipe.domain.UnitOfMeasure;
import com.recipe.demo.recipe.repositories.UnitOfMeasureRepository;
import com.recipe.demo.recipe.service.UnitOfMeasureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Override
    public UnitOfMeasure getUnitOfMeasureByDescription(String description) {
        Optional<UnitOfMeasure> unitOfMeasureOpt = unitOfMeasureRepository.findByDescription(description);
        return unitOfMeasureOpt.orElseThrow();
    }
}

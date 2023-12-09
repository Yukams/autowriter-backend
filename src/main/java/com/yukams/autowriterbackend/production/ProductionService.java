package com.yukams.autowriterbackend.production;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionService {
    public ProductionRepository productionRepository;

    public ProductionService() {}

    @Autowired
    public ProductionService(ProductionRepository productionRepository) {
        this.productionRepository = productionRepository;
    }

    public void setRequestRepository(ProductionRepository productionRepository) {
        this.productionRepository = productionRepository;
    }

    public ProductionRepository getRequestRepository() {
        return this.productionRepository;
    }

    public Production findById(long id) {
        return this.productionRepository.findById(id).orElse(null);
    }

    public List<Production> findAll() {
        return productionRepository.findAll();
    }
}

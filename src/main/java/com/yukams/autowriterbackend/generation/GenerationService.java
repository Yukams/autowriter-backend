package com.yukams.autowriterbackend.generation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenerationService {
    public GenerationRepository generationRepository;

    public GenerationService() {}

    @Autowired
    public GenerationService(GenerationRepository generationRepository) {
        this.generationRepository = generationRepository;
    }

    public void setRequestRepository(GenerationRepository generationRepository) {
        this.generationRepository = generationRepository;
    }

    public GenerationRepository getRequestRepository() {
        return this.generationRepository;
    }

    public Generation findById(Long id) {
        return this.generationRepository.findById(id).orElse(null);
    }

    public List<Generation> findAll() {
        return generationRepository.findAll();
    }

    public void save(Generation generation) {
        generationRepository.save(generation);
    }
}

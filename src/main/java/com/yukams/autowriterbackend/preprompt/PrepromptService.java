package com.yukams.autowriterbackend.preprompt;

import com.yukams.autowriterbackend.production.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrepromptService {
    public PrepromptRepository prepromptRepository;

    public PrepromptService() {}

    @Autowired
    public PrepromptService(PrepromptRepository prepromptRepository) {
        this.prepromptRepository = prepromptRepository;
    }

    public void setRequestRepository(PrepromptRepository prepromptRepository) {
        this.prepromptRepository = prepromptRepository;
    }

    public PrepromptRepository getRequestRepository() {
        return this.prepromptRepository;
    }

    public Preprompt findById(Long id) {
        return this.prepromptRepository.findById(id).orElse(null);
    }

    public List<Preprompt> findAll() {
        return prepromptRepository.findAll();
    }

    public void save(Preprompt preprompt) {
        prepromptRepository.save(preprompt);
    }
}

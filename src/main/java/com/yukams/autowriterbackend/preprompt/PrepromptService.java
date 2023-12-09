package com.yukams.autowriterbackend.preprompt;

import com.yukams.autowriterbackend.production.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Preprompt findById(long id) {
        return this.prepromptRepository.findById(id).orElse(null);
    }

    public List<Preprompt> findAll() {
        return prepromptRepository.findAll();
    }
}

package com.yukams.autowriterbackend.generation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/generation")
public class GenerationController {
    @Autowired
    private GenerationService generationService;

    @GetMapping("/{id}")
    public Generation getById(@PathVariable Long id) {
        return generationService.findById(id);
    }

    @GetMapping("/list")
    public List<Generation> getAll() {
        return generationService.findAll();
    }
}

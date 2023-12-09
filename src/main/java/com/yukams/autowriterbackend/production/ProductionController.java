package com.yukams.autowriterbackend.production;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionController {
    @Autowired
    private ProductionService productionService;

    @GetMapping("/{id}")
    public Production getById(@PathVariable Long id) {
        return productionService.findById(id);
    }

    @GetMapping("/list")
    public List<Production> getAll() {
        return productionService.findAll();
    }
}

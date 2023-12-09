package com.yukams.autowriterbackend.preprompt;

import com.yukams.autowriterbackend.production.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/preprompt")
public class PrepromptController {
    @Autowired
    private PrepromptService prepromptService;

    @GetMapping("/{id}")
    public Preprompt getById(@PathVariable Long id) {
        return prepromptService.findById(id);
    }

    @GetMapping("/list")
    public List<Preprompt> getAll() {
        return prepromptService.findAll();
    }
}

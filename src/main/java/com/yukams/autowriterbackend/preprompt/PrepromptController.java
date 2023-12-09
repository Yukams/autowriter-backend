package com.yukams.autowriterbackend.preprompt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Preprompt> getAll() {
        return prepromptService.findAll();
    }
}

package com.yukams.autowriterbackend.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {
    @Autowired
    private RequestService requestService;

    @GetMapping("/{id}")
    public Request getById(@PathVariable Long id) {
        return requestService.findById(id);
    }

    @GetMapping("/list")
    public List<Request> getAll() {
        return requestService.findAll();
    }

    @PostMapping(path="/new", consumes = "application/json")
    public String post(@RequestParam String text, @RequestParam Long prepromptVersion) {
        return "Pong !";
    }
}

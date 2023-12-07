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
    public Request getRequestById(@PathVariable Long id) {
        return requestService.findRequestById(id);
    }

    @GetMapping("/list")
    public List<Request> getAllRequest() {
        return requestService.findAllRequests();
    }

    @PostMapping(path="/new", consumes = "application/json")
    public String postRequest(@RequestParam String text, @RequestParam Long prepromptVersion) {
        return "Pong !";
    }
}

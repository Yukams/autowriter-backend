package com.yukams.autowriterbackend.request;

import com.yukams.autowriterbackend.preprompt.PrepromptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {
    private RequestService requestService;
    private PrepromptService prepromptService;

    public RequestController(){}

    @Autowired
    public RequestController(RequestService requestService, PrepromptService prepromptService) {
        this.requestService = requestService;
        this.prepromptService = prepromptService;
    }

    public void setRequestService(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/{id}")
    public Request getById(@PathVariable Long id) {
        return requestService.findById(id);
    }

    @GetMapping("/list")
    public List<Request> getAll() {
        return requestService.findAll();
    }

    @PostMapping("/new")
    public ResponseEntity<Request> post(@RequestParam String text, @RequestParam(name="version") Long prepromptVersion) {
        Request r = new Request(text, prepromptService.findById(prepromptVersion));
        Request rq = requestService.save(r);

        if (rq != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json;charset=UTF-8");

            return ResponseEntity
                    .created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(rq.getId()).toUri())
                    .headers(headers)
                    .body(rq);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}

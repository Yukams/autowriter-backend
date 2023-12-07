package com.yukams.autowriterbackend.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    public RequestRepository requestRepository;

    public RequestService() {}

    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public void setRequestRepository(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public RequestRepository getRequestRepository() {
        return this.requestRepository;
    }

    public Request findRequestById(long id) {
        return this.requestRepository.findById(id).orElse(null);
    }

    public List<Request> findAllRequests() {
        return requestRepository.findAll();
    }
}

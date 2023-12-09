package com.yukams.autowriterbackend.production;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class Production {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String text;

    public Production() {}

    public Production(@NonNull String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    @NonNull
    public String getText() {
        return text;
    }
}
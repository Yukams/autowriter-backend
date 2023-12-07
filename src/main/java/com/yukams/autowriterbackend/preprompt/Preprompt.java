package com.yukams.autowriterbackend.preprompt;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class Preprompt {
    @Id
    @GeneratedValue
    private Long version;

    @NonNull
    private String text;

    public Preprompt() {}

    public Preprompt(@NonNull String text) {
        this.text = text;
    }
}
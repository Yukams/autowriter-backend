package com.yukams.autowriterbackend.request;

import com.yukams.autowriterbackend.generation.Generation;
import com.yukams.autowriterbackend.preprompt.Preprompt;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
public class Request {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String text;

    @NonNull
    @ManyToOne
    private Preprompt preprompt;

    @NonNull
    @OneToMany
    private List<Generation> generations;

    public Request() {}

    public Request(@NonNull String text, @NonNull Preprompt preprompt, @NonNull List<Generation> generations) {
        this.text = text;
        this.preprompt = preprompt;
        this.generations = generations;
    }
}
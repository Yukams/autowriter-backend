package com.yukams.autowriterbackend.request;

import com.yukams.autowriterbackend.generation.Generation;
import com.yukams.autowriterbackend.preprompt.Preprompt;
import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
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
    @OneToMany(cascade=CascadeType.ALL)
    private List<Generation> generations;

    public Request() {}

    public Request(@NonNull String text, @NonNull Preprompt preprompt) {
        this.text = text;
        this.preprompt = preprompt;
        this.generations = new ArrayList<>();
    }

    @NonNull
    public String getText() {
        return text;
    }

    @NonNull
    public Preprompt getPreprompt() {
        return preprompt;
    }

    @NonNull
    public List<Generation> getGenerations() {
        return generations;
    }

    public Long getId() {
        return id;
    }
}
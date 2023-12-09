package com.yukams.autowriterbackend.generation;

import com.yukams.autowriterbackend.production.Production;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Generation {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String text;

    @NonNull
    private Integer nbTry;

    @NonNull
    @OneToOne
    private Production production;

    @NonNull
    private Status status;

    public Generation() {}

    public Generation(@NonNull String text, @NonNull Integer nbTry, @NonNull Status status) {
        this.text = text;
        this.nbTry = nbTry;
        this.production = new Production(text);
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    @NonNull
    public String getText() {
        return text;
    }

    @NonNull
    public Integer getNbTry() {
        return nbTry;
    }

    @NonNull
    public Production getProduction() {
        return production;
    }

    @NonNull
    public Status getStatus() {
        return status;
    }
}
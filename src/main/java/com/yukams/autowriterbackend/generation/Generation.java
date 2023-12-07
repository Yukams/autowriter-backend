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

    public Generation(@NonNull String text, @NonNull Integer nbTry, @NonNull Production production, @NonNull Status status) {
        this.text = text;
        this.nbTry = nbTry;
        this.production = production;
        this.status = status;
    }
}
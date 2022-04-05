package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity
@Table(name = "tournament", schema = "competition")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDTORNEIO")
    private Integer id;
    @Column(name = "NOME")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
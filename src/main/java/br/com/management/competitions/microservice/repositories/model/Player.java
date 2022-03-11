package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity
@Table(name = "player", schema = "competition")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDJOGADOR")
    private Integer id;
    @Column(name = "NOME")
    private String name;
    @Column(name = "DATA_NASCIMENTO")
    private String birthDate;
    @Column(name = "NACIONALIDADE")
    private String nationality;
    @Column(name = "ID_TIME")
    private Integer idTeam;

    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
        this.idTeam = idTeam;
    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
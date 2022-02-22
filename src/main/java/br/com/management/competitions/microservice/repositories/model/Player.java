package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_player")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "id_team")
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
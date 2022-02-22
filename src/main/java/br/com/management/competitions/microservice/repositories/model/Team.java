package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_team")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "locality")
    private String locality;

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

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
}

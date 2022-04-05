package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDTIME")
    private Integer id;
    @Column(name = "NOME")
    private String name;
    @Column(name = "LOCALIDADE")
    private String locality;
    @Column(name = "ID_TORNEIO")
    private Integer idTournament;
    @Column(name = "ID_PARTIDA")
    private Integer idMatch;

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
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

    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }
}

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
    @Column(name = "ID_TORNEIO")
    private String idTournament;
    @Column(name = "ID_PARTIDA")
    private String idMatch;

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

    public String getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(String idTournament) {
        this.idTournament = idTournament;
    }

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }
}

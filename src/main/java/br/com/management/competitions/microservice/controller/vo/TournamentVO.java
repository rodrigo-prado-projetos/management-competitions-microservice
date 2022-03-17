package br.com.management.competitions.microservice.controller.vo;

public class TournamentVO {
    private Integer idTournament;
    private String name;

    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

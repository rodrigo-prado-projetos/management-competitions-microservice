package br.com.management.competitions.microservice.controller.dto;

import br.com.management.competitions.microservice.repositories.model.Match;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDTO extends Match {
    private Integer id;
    private String place;
    private String date;
    private String hour;
    private Integer idTournament;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String getHour() {
        return hour;
    }

    @Override
    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public Integer getIdTournament() {
        return idTournament;
    }

    @Override
    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }
}
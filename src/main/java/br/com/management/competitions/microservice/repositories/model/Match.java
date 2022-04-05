package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity
@Table(name = "metch", schema = "competition")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDPARTIDA")
    private Integer id;
    @Column(name = "LOCAL")
    private String place;
    @Column(name = "DATA")
    private String date;
    @Column(name = "HORA")
    private String hour;
    @Column(name = "ID_TORNEIO")
    private Integer idTournament;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }
}
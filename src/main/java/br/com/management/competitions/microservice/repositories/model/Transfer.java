package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity(name = "transfer")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transfer")
    private Integer id;
    @Column(name = "destination_team")
    private String destinationTeam;
    @Column(name = "origin_team")
    private String originTeam;
    @Column(name = "date_transfer")
    private String date;
    @Column(name = "value_transfer")
    private Double value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestinationTeam() {
        return destinationTeam;
    }

    public void setDestinationTeam(String destinationTeam) {
        this.destinationTeam = destinationTeam;
    }

    public String getOriginTeam() {
        return originTeam;
    }

    public void setOriginTeam(String originTeam) {
        this.originTeam = originTeam;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
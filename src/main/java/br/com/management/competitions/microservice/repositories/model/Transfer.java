package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity(name = "transfer")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDTRANSFERENCIA")
    private Integer id;
    @Column(name = "ID_TIME_DESTINO")
    private String destinationTeam;
    @Column(name = "ID_TIME_ORIGEM")
    private String originTeam;
    @Column(name = "DATA")
    private String date;
    @Column(name = "VALOR")
    private Double value;
    @Column(name = "ID_JOGADOR")
    private String idPlayer;

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

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
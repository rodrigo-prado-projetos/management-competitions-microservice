package br.com.management.competitions.microservice.repositories.model;

import javax.persistence.*;

@Entity(name = "transfer")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDTRANSFERENCIA")
    private Integer id;
    @Column(name = "ID_TIME_DESTINO")
    private Integer destinationTeam;
    @Column(name = "ID_TIME_ORIGEM")
    private Integer originTeam;
    @Column(name = "DATA")
    private String date;
    @Column(name = "VALOR")
    private String value;
    @Column(name = "ID_JOGADOR")
    private Integer idPlayer;

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDestinationTeam() {
        return destinationTeam;
    }

    public void setDestinationTeam(Integer destinationTeam) {
        this.destinationTeam = destinationTeam;
    }

    public Integer getOriginTeam() {
        return originTeam;
    }

    public void setOriginTeam(Integer originTeam) {
        this.originTeam = originTeam;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
package br.com.management.competitions.microservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferDTO {
    private Integer idTransfer;
    private Integer idPlayer;
    private Integer destinationTeam;
    private Integer originTeam;
    private String data;
    private String valor;

    public Integer getIdTransfer() {
        return idTransfer;
    }

    public void setIdTransfer(Integer idTransfer) {
        this.idTransfer = idTransfer;
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

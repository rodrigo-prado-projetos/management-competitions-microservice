package br.com.management.competitions.microservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferDTO {
    private String destinationTeam;
    private String originTeam;
    private String data;
    private Double valor;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}

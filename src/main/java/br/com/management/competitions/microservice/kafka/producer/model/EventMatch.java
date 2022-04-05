package br.com.management.competitions.microservice.kafka.producer.model;

import br.com.management.competitions.microservice.enumeration.ActionEnum;

public class EventMatch {
    private Integer idMatch;
    private Integer idTournament;
    private ActionEnum actionEnum;

    public Integer getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    public ActionEnum getActionEnum() {
        return actionEnum;
    }

    public void setActionEnum(ActionEnum actionEnum) {
        this.actionEnum = actionEnum;
    }
}

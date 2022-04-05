package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.dto.TournamentDTO;
import br.com.management.competitions.microservice.controller.vo.TournamentVO;
import br.com.management.competitions.microservice.enumeration.ActionEnum;
import br.com.management.competitions.microservice.kafka.producer.GenericProducer;
import br.com.management.competitions.microservice.kafka.producer.model.EventMatch;
import br.com.management.competitions.microservice.object.service.TournamentBS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TournamentBO {
    @Autowired
    private TournamentBS tournamentBS;
    @Autowired
    private GenericProducer genericProducer;

    public void createTournament(TournamentVO tournamentVO) {
        tournamentBS.createTournament(tournamentVO);
    }

    public void updateTournament(TournamentVO tournamentVO) {
        tournamentBS.updateTournament(tournamentVO);
    }

    public void deleteTournament(Integer id) {
        tournamentBS.deleteTournament(id);
    }

    public void createTournamentMatchEventsStart(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.INICIO);
        this.genericProducer.producer(eventMatch);
    }

    public void createTournamentMatchEventsGoal(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.GOL);
        this.genericProducer.producer(eventMatch);
    }


    public void createTournamentMatchEventsInterval(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.INTERVALO);
        this.genericProducer.producer(eventMatch);
    }

    public void createTournamentMatchEventsAddition(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.ACRESCIMO);
        this.genericProducer.producer(eventMatch);
    }

    public void createTournamentMatchEventsReplacement(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.SUBSTITUICAO);
        this.genericProducer.producer(eventMatch);
    }

    public void createTournamentMatchEventsWarning(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.ADVERTENCIA);
        this.genericProducer.producer(eventMatch);
    }

    public void createTournamentMatchEventsEnd(Integer idTournament, Integer idMatch) {
        EventMatch eventMatch = getEventMatch(idTournament, idMatch, ActionEnum.FIM);
        this.genericProducer.producer(eventMatch);
    }

    public List<TournamentDTO> findAllTournaments() {
        return this.tournamentBS.findAllTournaments();
    }

    private EventMatch getEventMatch(Integer idTournament, Integer idMatch, ActionEnum gol) {
        EventMatch eventMatch = new EventMatch();
        eventMatch.setIdTournament(idTournament);
        eventMatch.setIdMatch(idMatch);
        eventMatch.setActionEnum(gol);
        return eventMatch;
    }
}

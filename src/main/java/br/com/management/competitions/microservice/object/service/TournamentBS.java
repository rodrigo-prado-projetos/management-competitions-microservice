package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.controller.dto.TournamentDTO;
import br.com.management.competitions.microservice.controller.vo.TournamentVO;
import br.com.management.competitions.microservice.repositories.TournamentRepository;
import br.com.management.competitions.microservice.repositories.model.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentBS {
    @Autowired
    private TournamentRepository tournamentRepository;

    public void deleteTournament(Integer id) {
        this.tournamentRepository.deleteById(id);
    }

    public void createTournament(TournamentVO tournamentVO) {
        Tournament tournament = getTournament(tournamentVO);
        this.tournamentRepository.save(tournament);
    }

    public void updateTournament(TournamentVO tournamentVO) {
        Tournament tournament = getTournament(tournamentVO);
        this.tournamentRepository.save(tournament);
    }

    public List<TournamentDTO> findAllTournaments() {
        List<TournamentDTO> tournamentsDTO = new ArrayList<>();
        Iterable<Tournament> tournaments = this.tournamentRepository.findAll();
        tournaments.forEach(tournament -> {
            TournamentDTO tournamentDTO = new TournamentDTO();
            tournamentDTO.setId(tournament.getId());
            tournamentDTO.setName(tournament.getName());
            tournamentsDTO.add(tournamentDTO);
        });
        return tournamentsDTO;
    }

    private Tournament getTournament(TournamentVO tournamentVO) {
        Tournament tournament = new Tournament();
        tournament.setId(tournamentVO.getId());
        tournament.setName(tournamentVO.getName());
        return tournament;
    }
}
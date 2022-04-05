package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.controller.dto.MatchDTO;
import br.com.management.competitions.microservice.controller.dto.MatchTeamTournamentDTO;
import br.com.management.competitions.microservice.controller.vo.MatchVO;
import br.com.management.competitions.microservice.repositories.MatchRepository;
import br.com.management.competitions.microservice.repositories.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchBS {
    @Autowired
    private MatchRepository matchRepository;


    public void createMatch(MatchVO matchVO) {
        Match match = getMatch(matchVO);
        this.matchRepository.save(match);
    }

    public void updateMatch(MatchVO matchVO) {
        Match match = getMatch(matchVO);
        this.matchRepository.save(match);
    }

    public void deleteMatch(Integer id) {
        this.matchRepository.deleteById(id);
    }

    public  List<MatchTeamTournamentDTO> findAllMatchesTeamTournament() {
       return this.matchRepository.findAllMatchesTeamTournament();
    }

    private Match getMatch(MatchVO matchVO) {
        Match match = new Match();
        match.setId(matchVO.getId());
        match.setDate(matchVO.getDate());
        match.setHour(matchVO.getHour());
        match.setPlace(matchVO.getPlace());
        match.setIdTournament(matchVO.getIdTournament());
        return match;
    }
}

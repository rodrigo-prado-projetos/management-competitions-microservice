package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.dto.MatchDTO;
import br.com.management.competitions.microservice.controller.dto.MatchTeamTournamentDTO;
import br.com.management.competitions.microservice.controller.vo.MatchVO;
import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.object.service.MatchBS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchBO {
    @Autowired
    private MatchBS matchBS;

    public void createMatch(MatchVO matchVO) {
        this.matchBS.createMatch(matchVO);
    }

    public void updateMatch(MatchVO matchVO) {
        this.matchBS.updateMatch(matchVO);
    }

    public void deleteMatch(Integer id) {
        this.matchBS.deleteMatch(id);
    }

    public List<MatchTeamTournamentDTO> findAllMatchesTeamTournament() {
        return this.matchBS.findAllMatchesTeamTournament();
    }
}
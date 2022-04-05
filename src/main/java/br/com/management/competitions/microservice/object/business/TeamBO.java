package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.dto.TeamDTO;
import br.com.management.competitions.microservice.controller.dto.TeamTournamentDTO;
import br.com.management.competitions.microservice.controller.vo.TeamVO;
import br.com.management.competitions.microservice.object.service.TeamBS;
import br.com.management.competitions.microservice.repositories.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeamBO {
    @Autowired
    private TeamBS teamBS;

    public List<TeamDTO> findAllTeams() {
        return this.teamBS.findAllTeams();
    }

    public void createTeam(TeamVO teamVO) {
        this.teamBS.createTeam(teamVO);
    }

    public void updateTeam(TeamVO teamVO) {
        this.teamBS.updateTeam(teamVO);
    }

    public void deleteTeam(Integer id) {
        this.teamBS.deleteTeam(id);
    }

    public List<TeamTournamentDTO> findTeamsRegisteredITournaments() {
        return this.teamBS.findTeamsRegisteredITournaments();
    }
}
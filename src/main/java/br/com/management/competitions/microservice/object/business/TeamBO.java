package br.com.management.competitions.microservice.object.business;

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

    public List<Team> findAllTeams() {
        List<Team> teams = new ArrayList<>();
        this.teamBS.findAllTeams().iterator().forEachRemaining(teams::add);
        return teams;
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
}
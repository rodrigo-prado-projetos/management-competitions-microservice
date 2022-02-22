package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.controller.vo.TeamVO;
import br.com.management.competitions.microservice.repositories.TeamRepository;
import br.com.management.competitions.microservice.repositories.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamBS {
    @Autowired
    private TeamRepository teamRepository;

    public Iterable<Team> findAllTeams() {
        return this.teamRepository.findAll();
    }

    public void createTeam(TeamVO teamVO) {
        this.teamRepository.save(getTeam(teamVO));
    }

    public void updateTeam(TeamVO teamVO) {
        this.teamRepository.save(getTeam(teamVO));
    }

    public void deleteTeam(Integer id) {
        this.teamRepository.deleteById(id);
    }

    private Team getTeam(TeamVO teamVO) {
        Team team = new Team();
        team.setId(teamVO.getId());
        team.setLocality(teamVO.getLocality());
        team.setName(teamVO.getName());
        return team;
    }


}

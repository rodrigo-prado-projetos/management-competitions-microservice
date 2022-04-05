package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.controller.dto.TeamDTO;
import br.com.management.competitions.microservice.controller.dto.TeamTournamentDTO;
import br.com.management.competitions.microservice.controller.vo.TeamVO;
import br.com.management.competitions.microservice.repositories.TeamRepository;
import br.com.management.competitions.microservice.repositories.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamBS {
    @Autowired
    private TeamRepository teamRepository;

    public List<TeamDTO> findAllTeams() {
        List<TeamDTO> teamDTOList = new ArrayList<>();
        Iterable<Team> teams = this.teamRepository.findAll();
        teams.forEach(team -> {
            TeamDTO teamDTO = new TeamDTO();
            teamDTO.setId(team.getId());
            teamDTO.setName(team.getName());
            teamDTO.setLocality(team.getLocality());
            teamDTOList.add(teamDTO);
        });
        return teamDTOList;
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
        team.setId(teamVO.getIdTeam());
        team.setLocality(teamVO.getLocality());
        team.setName(teamVO.getName());
        team.setIdTournament(teamVO.getIdTournament());
        team.setIdMatch(teamVO.getIdMatch());
        return team;
    }

    public List<TeamTournamentDTO> findTeamsRegisteredITournaments() {
        return this.teamRepository.findTeamsRegisteredITournaments();
    }

    public Optional<Team> findById(Integer idTeam) {
        return this.teamRepository.findById(idTeam);
    }
}

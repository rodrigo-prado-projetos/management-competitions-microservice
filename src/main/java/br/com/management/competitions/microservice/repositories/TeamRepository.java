package br.com.management.competitions.microservice.repositories;

import br.com.management.competitions.microservice.controller.dto.TeamTournamentDTO;
import br.com.management.competitions.microservice.repositories.model.Player;
import br.com.management.competitions.microservice.repositories.model.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {

    @Query(value = "SELECT t.NOME as time, tournament.NOME as torneio    from team t inner join tournament tournament on t.ID_TORNEIO = tournament.IDTORNEIO", nativeQuery = true)
    List<Object[]> findTeamsRegisteredITournamentsObject();

    default List<TeamTournamentDTO> findTeamsRegisteredITournaments() {
        List<TeamTournamentDTO> teamTournamentDTOS = new ArrayList<>();
        List<Object[]> objects = findTeamsRegisteredITournamentsObject();
        for (Object[] object : objects) {
            TeamTournamentDTO tournamentDTO = new TeamTournamentDTO();
            tournamentDTO.setTeamName((String) object[0]);
            tournamentDTO.setTournamentName((String) object[1]);
            teamTournamentDTOS.add(tournamentDTO);
        }
        return teamTournamentDTOS;
    }
}

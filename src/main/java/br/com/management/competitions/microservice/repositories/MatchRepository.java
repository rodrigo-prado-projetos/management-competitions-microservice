package br.com.management.competitions.microservice.repositories;

import br.com.management.competitions.microservice.controller.dto.MatchTeamTournamentDTO;
import br.com.management.competitions.microservice.controller.dto.PlayerDTO;
import br.com.management.competitions.microservice.repositories.model.Match;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MatchRepository extends CrudRepository<Match, Integer> {

    @Query(value = "SELECT t.NOME as teamName, tournament.NOME as tournamentName, m.`LOCAL` , m.`DATA` , m.HORA " +
            "from team t " +
            "inner join metch m on t.ID_PARTIDA = m.IDPARTIDA " +
            "inner join tournament tournament on t.ID_TORNEIO = tournament.IDTORNEIO ", nativeQuery = true)
    List<Object[]> findAllMatchesTeamTournamentObject();

    default  List<MatchTeamTournamentDTO> findAllMatchesTeamTournament() {
        List<MatchTeamTournamentDTO> teamTournamentDTOS = new ArrayList<>();
        List<Object[]> objects = findAllMatchesTeamTournamentObject();

        for (Object[] object : objects) {
            MatchTeamTournamentDTO matchTeamTournamentDTO = new MatchTeamTournamentDTO();
            matchTeamTournamentDTO.setTeamName((String) object[0]);
            matchTeamTournamentDTO.setTournamentName((String) object[1]);
            matchTeamTournamentDTO.setMatchLocation((String) object[2]);
            matchTeamTournamentDTO.setMatchDate((String) object[3]);
            matchTeamTournamentDTO.setMatchHour((String) object[4]);
            teamTournamentDTOS.add(matchTeamTournamentDTO);
        }
        return teamTournamentDTOS;
    }
}

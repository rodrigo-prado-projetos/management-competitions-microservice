package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.dto.PlayerDTO;
import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.object.business.PlayerBO;
import br.com.management.competitions.microservice.repositories.model.Player;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/competitions")
public class MatchController {
    @Autowired
    private PlayerBO playerBO;

    @Cacheable(value = "matches", key = "id")
    @GetMapping("v1/matches/{id}/teams/tournaments")
    public ResponseEntity findMatchTeamTournamentById(@PathVariable(name = "id") Integer id) {
        PlayerDTO playerDTO = this.playerBO.findPlayerById(id);
        if (Objects.isNull(playerDTO)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(playerDTO);
    }

    @Cacheable("matches")
    @GetMapping("v1/matches/teams/tournaments")
    public ResponseEntity findAllMatchTeamTournament() {
        ResponseEntity result;
        List<PlayerDTO> allPlayers = this.playerBO.findAllPlayers();
        if (allPlayers.isEmpty()) {
            result = ResponseEntity.noContent().build();
        } else {
            result = ResponseEntity.ok(allPlayers);
        }
        return result;
    }

    @PostMapping("v1/matches/teams/tournaments")
    public ResponseEntity<Object> createTournament(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/matches/teams/tournaments")
    public ResponseEntity<Object> updateTournament(@RequestBody PlayerVO playerVO) {
        this.playerBO.updatePlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/matches/{id}/teams/tournaments")
    public ResponseEntity<Object> deleteMatchBetweenTeamInTournament(
            @PathVariable(name = "id") Integer id) {
        this.playerBO.deletePlayer(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }
}
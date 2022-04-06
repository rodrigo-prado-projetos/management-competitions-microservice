package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.dto.MatchTeamTournamentDTO;
import br.com.management.competitions.microservice.controller.vo.MatchVO;
import br.com.management.competitions.microservice.object.business.MatchBO;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/competitions")
public class MatchController {
    @Autowired
    private MatchBO matchBO;

    @Cacheable("matches")
    @GetMapping("v1/matches/teams/tournaments")
    public ResponseEntity findAllMatchesTeamTournament() {
        ResponseEntity result;
        List<MatchTeamTournamentDTO> matches = this.matchBO.findAllMatchesTeamTournament();
        if (matches.isEmpty()) {
            result = ResponseEntity.noContent().build();
        } else {
            result = ResponseEntity.ok(matches);
        }
        return result;
    }

    @PostMapping("v1/matches/teams/tournaments")
    public ResponseEntity<Object> createMatch(@RequestBody MatchVO matchVO) {
        this.matchBO.createMatch(matchVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/matches/teams/tournaments")
    public ResponseEntity<Object> updateTournament(@RequestBody MatchVO matchVO) {
        this.matchBO.updateMatch(matchVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/matches/{id}/teams/tournaments")
    public ResponseEntity<Object> deleteMatchBetweenTeamInTournament(
            @PathVariable(name = "id") Integer id) {
        this.matchBO.deleteMatch(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }
}
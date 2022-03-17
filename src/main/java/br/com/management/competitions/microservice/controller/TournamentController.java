package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.controller.vo.TournamentVO;
import br.com.management.competitions.microservice.object.business.TournamentBO;
import br.com.management.competitions.microservice.repositories.model.Team;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/competitions")
public class TournamentController {
    @Autowired
    private TournamentBO tournamentBO;

    @GetMapping("/v1/tournaments")
    public ResponseEntity findAllTournaments() {
         this.tournamentBO.findAllTournaments();
//        if (teams.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
        return ResponseEntity.ok(null);
    }

    @PostMapping("v1/tournaments")
    public ResponseEntity<Object> createTournament(@RequestBody TournamentVO tournamentVO) {
        this.tournamentBO.createTournament(tournamentVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/tournaments")
    public ResponseEntity<Object> updateTournament(@RequestBody PlayerVO playerVO) {
        this.tournamentBO.updateTournament(playerVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/tournaments/{id}")
    public ResponseEntity<Object> deleteTournament(@PathVariable(name = "id") Integer id) {
        this.tournamentBO.deleteTournament(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/start")
    public ResponseEntity<Object> createTournamentMatchEventsStart() {
        this.tournamentBO.createTournamentMatchEventsStart();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/goal")
    public ResponseEntity<Object> createTournamentMatchEventsGoal() {
        this.tournamentBO.createTournamentMatchEventsGoal();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/interval")
    public ResponseEntity<Object> createTournamentMatchEventsInterval() {
        this.tournamentBO.createTournamentMatchEventsInterval();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/addition")
    public ResponseEntity<Object> createTournamentMatchEventsAddition() {
        this.tournamentBO.createTournamentMatchEventsAddition();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/replacement")
    public ResponseEntity<Object> createTournamentMatchEventsReplacement() {
        this.tournamentBO.createTournamentMatchEventsReplacement();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/warning")
    public ResponseEntity<Object> createTournamentMatchEventsWarning() {
        this.tournamentBO.createTournamentMatchEventsWarning();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/end")
    public ResponseEntity<Object> createTournamentMatchEventsEnd() {
        this.tournamentBO.createTournamentMatchEventsEnd();
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }
}
package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.object.business.PlayerBO;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/competitions")
public class TournamentController {
    @Autowired
    private PlayerBO playerBO;

    @GetMapping("/v1/tournaments")
    public ResponseEntity findAllTournaments() {
        return ResponseEntity.ok(null);
    }

    @PostMapping("v1/tournaments")
    public ResponseEntity<Object> createTournament(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/tournaments")
    public ResponseEntity<Object> updateTournament(@RequestBody PlayerVO playerVO) {
        this.playerBO.updatePlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/tournaments/{id}")
    public ResponseEntity<Object> deleteTournament(@PathVariable(name = "id") Integer id) {
        this.playerBO.deletePlayer(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }


    @PostMapping("v1/tournaments/{id}/matches/{id}/events/start")
    public ResponseEntity<Object> createTournamentMatchEventsStart(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/goal")
    public ResponseEntity<Object> createTournamentMatchEventsGoal(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/interval")
    public ResponseEntity<Object> createTournamentMatchEventsInterval(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/addition")
    public ResponseEntity<Object> createTournamentMatchEventsAddition(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/replacement")
    public ResponseEntity<Object> createTournamentMatchEventsReplacement(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/warning")
    public ResponseEntity<Object> createTournamentMatchEventsWarning(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{id}/matches/{id}/events/end")
    public ResponseEntity<Object> createTournamentMatchEventsEnd(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }
}
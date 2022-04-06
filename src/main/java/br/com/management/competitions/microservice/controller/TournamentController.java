package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.dto.TournamentDTO;
import br.com.management.competitions.microservice.controller.vo.TournamentVO;
import br.com.management.competitions.microservice.object.business.TournamentBO;
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
        List<TournamentDTO> tournaments = this.tournamentBO.findAllTournaments();
        if (tournaments.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tournaments);
    }

    @PostMapping("v1/tournaments")
    public ResponseEntity<Object> createTournament(@RequestBody TournamentVO tournamentVO) {
        this.tournamentBO.createTournament(tournamentVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/tournaments")
    public ResponseEntity<Object> updateTournament(@RequestBody TournamentVO tournamentVO) {
        this.tournamentBO.updateTournament(tournamentVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/tournaments/{id}")
    public ResponseEntity<Object> deleteTournament(@PathVariable(name = "id") Integer id) {
        this.tournamentBO.deleteTournament(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/start")
    public ResponseEntity<Object> createTournamentMatchEventsStart(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsStart(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/goal")
    public ResponseEntity<Object> createTournamentMatchEventsGoal(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsGoal(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/interval")
    public ResponseEntity<Object> createTournamentMatchEventsInterval(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsInterval(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/addition")
    public ResponseEntity<Object> createTournamentMatchEventsAddition(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsAddition(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/replacement")
    public ResponseEntity<Object> createTournamentMatchEventsReplacement(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsReplacement(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/warning")
    public ResponseEntity<Object> createTournamentMatchEventsWarning(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsWarning(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PostMapping("v1/tournaments/{idTournament}/matches/{idMatch}/events/end")
    public ResponseEntity<Object> createTournamentMatchEventsEnd(
            @PathVariable(name = "idTournament") Integer idTournament,
            @PathVariable(name = "idMatch") Integer idMatch) {
        this.tournamentBO.createTournamentMatchEventsEnd(idTournament, idMatch);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }
}
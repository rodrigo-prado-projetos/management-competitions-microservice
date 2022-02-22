package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.vo.TeamVO;
import br.com.management.competitions.microservice.object.business.TeamBO;
import br.com.management.competitions.microservice.repositories.model.Team;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/competitions")
public class TeamController {
    @Autowired
    private TeamBO teamBO;

    @GetMapping("/v1/teams")
    public ResponseEntity findAllTeams() {
        List<Team> teams = this.teamBO.findAllTeams();
        if (teams.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(teams);
    }

    @PostMapping("v1/teams")
    public ResponseEntity<Object> createTeam(@RequestBody TeamVO teamVO) {
        this.teamBO.createTeam(teamVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/teams")
    public ResponseEntity<Object> updateTeam(@RequestBody TeamVO teamVO) {
        this.teamBO.updateTeam(teamVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/teams/{id}")
    public ResponseEntity<Object> deleteTeam(@PathVariable(name = "id") Integer id) {
        this.teamBO.deleteTeam(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }
}
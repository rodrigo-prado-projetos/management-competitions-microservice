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
public class PlayerController {
    @Autowired
    private PlayerBO playerBO;

    //  @Cacheable(value = "players", key = "id")
    @GetMapping("/v1/players/{id}")
    public ResponseEntity findPlayerById(@PathVariable(name = "id") Integer id) {
        PlayerDTO playerDTO = this.playerBO.findPlayerById(id);
        if (Objects.isNull(playerDTO)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(playerDTO);
    }

    @Cacheable("players")
    @GetMapping("/v1/players")
    public ResponseEntity findAllPlayers() {
        ResponseEntity result;
        List<PlayerDTO> allPlayers = this.playerBO.findAllPlayers();
        if (allPlayers.isEmpty()) {
            result = ResponseEntity.noContent().build();
        } else {
            result = ResponseEntity.ok(allPlayers);
        }
        return result;
    }

    @PostMapping("v1/players")
    public ResponseEntity<Object> createPlayer(@RequestBody PlayerVO playerVO) {
        this.playerBO.createPlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }


    @PutMapping("v1/players")
    public ResponseEntity<Object> updatePlayer(@RequestBody PlayerVO playerVO) {
        this.playerBO.updatePlayer(playerVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/players/{id}")
    public ResponseEntity<Object> deletePlayer(@PathVariable(name = "id") Integer id) {
        this.playerBO.deletePlayer(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }
}
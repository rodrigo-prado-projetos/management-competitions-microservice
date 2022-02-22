package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.dto.PlayerDTO;
import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.object.service.PlayerBS;
import br.com.management.competitions.microservice.repositories.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerBO {
    @Autowired
    private PlayerBS playerBS;

    public List<Player> findAllPlayers() {
        List<Player> players = new ArrayList<>();
        this.playerBS.findAllPlayers().iterator().forEachRemaining(players::add);
        return players;
    }

    public PlayerDTO findPlayerById(String id) {
        return this.playerBS.findPlayerById(id);
    }

    public void createPlayer(PlayerVO playerVO) {
        this.playerBS.createPlayer(playerVO);
    }

    public void updatePlayer(PlayerVO playerVO) {
        this.playerBS.updatePlayer(playerVO);
    }

    public void deletePlayer(Integer id) {
        this.playerBS.deletePlayer(id);
    }


}
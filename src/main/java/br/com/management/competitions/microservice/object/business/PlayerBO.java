package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.dto.PlayerDTO;
import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.object.service.PlayerBS;
import br.com.management.competitions.microservice.object.service.TeamBS;
import br.com.management.competitions.microservice.repositories.model.Player;
import br.com.management.competitions.microservice.repositories.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class PlayerBO {
    @Autowired
    private PlayerBS playerBS;
    @Autowired
    private TeamBS teamBS;

    public List<PlayerDTO> findAllPlayers() {
        List<Player> players = new ArrayList<>();
        List<PlayerDTO> playerDTOS = new ArrayList<>();
        this.playerBS.findAllPlayers().iterator().forEachRemaining(players::add);

        for (Player player : players) {
            PlayerDTO playerDTO = new PlayerDTO();
            playerDTO.setId(player.getId());
            playerDTO.setName(player.getName());
            playerDTO.setNationality(player.getNationality());
            playerDTO.setBirthDate(player.getBirthDate());
            getNameTeam(player, playerDTO);
            playerDTOS.add(playerDTO);
        }
        return playerDTOS;
    }

    public PlayerDTO findPlayerById(Integer id) {
        Optional<Player> playerOptional = this.playerBS.findPlayerById(id);
        PlayerDTO playerDTO = null;
        if (playerOptional.isPresent()) {
            playerDTO = new PlayerDTO();
            Player player = playerOptional.get();
            playerDTO.setId(player.getId());
            playerDTO.setName(player.getName());
            playerDTO.setNationality(player.getNationality());
            playerDTO.setBirthDate(player.getBirthDate());
            getNameTeam(player, playerDTO);
        }
        return playerDTO;
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

    private void getNameTeam(Player player, PlayerDTO playerDTO) {
        if (Objects.nonNull(player.getIdTeam())) {
            Optional<Team> optionalTeam = this.teamBS.findById(player.getIdTeam());
            if (optionalTeam.isPresent()) {
                playerDTO.setTeamName(optionalTeam.get().getName());
            }
        }
    }


}
package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.controller.dto.PlayerDTO;
import br.com.management.competitions.microservice.controller.vo.PlayerVO;
import br.com.management.competitions.microservice.repositories.PlayerRepository;
import br.com.management.competitions.microservice.repositories.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerBS {
    @Autowired
    private PlayerRepository playerRepository;

    public Iterable<Player> findAllPlayers() {
        return this.playerRepository.findAll();
    }

    public PlayerDTO findPlayerById(String id) {
        return this.playerRepository.findPlayerByIdAndConvertResult(id);
    }

    public void createPlayer(PlayerVO playerVO) {
        this.playerRepository.save(getPlayer(playerVO));
    }

    public void updatePlayer(PlayerVO playerVO) {
        this.playerRepository.save(getPlayer(playerVO));
    }

    public void deletePlayer(Integer id) {
        this.playerRepository.deleteById(id);
    }

    private Player getPlayer(PlayerVO playerVO) {
        Player player = new Player();
        player.setIdTeam(playerVO.getIdTeam());
        player.setBirthDate(playerVO.getBirthDate());
        player.setName(playerVO.getName());
        player.setNationality(playerVO.getNationality().name());
        return player;
    }


}
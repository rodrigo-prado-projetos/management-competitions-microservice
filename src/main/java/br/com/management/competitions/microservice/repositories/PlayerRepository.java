package br.com.management.competitions.microservice.repositories;

import br.com.management.competitions.microservice.controller.dto.PlayerDTO;
import br.com.management.competitions.microservice.repositories.model.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    @Query(value = "select pl.nome, pl.data_nascimento, pl.nacionalidade, tm.* from player pl inner join team tm where pl.idjogador =:id", nativeQuery = true)
    List<Object[]> findPlayerById(String id);

    default PlayerDTO findPlayerByIdAndConvertResult(String id) {
        List<Object[]> objects = findPlayerById(id);
        PlayerDTO playerDTO = new PlayerDTO();
        for (Object[] object : objects) {
            playerDTO.setName((String) object[0]);
            playerDTO.setBirthDate((String) object[1]);
            playerDTO.setNationality((String) object[2]);
            playerDTO.setTeamName((String) object[3]);
            break;
        }
        return playerDTO;
    }
}
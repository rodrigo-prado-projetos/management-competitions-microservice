package br.com.management.competitions.microservice.repositories;

import br.com.management.competitions.microservice.repositories.model.Player;
import br.com.management.competitions.microservice.repositories.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {
}

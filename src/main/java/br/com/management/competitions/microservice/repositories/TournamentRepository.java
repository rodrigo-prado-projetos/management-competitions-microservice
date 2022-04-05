package br.com.management.competitions.microservice.repositories;

import br.com.management.competitions.microservice.repositories.model.Tournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Integer> {
}

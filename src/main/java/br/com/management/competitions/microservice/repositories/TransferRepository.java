package br.com.management.competitions.microservice.repositories;

import br.com.management.competitions.microservice.repositories.model.Transfer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends CrudRepository<Transfer, Integer> {
}

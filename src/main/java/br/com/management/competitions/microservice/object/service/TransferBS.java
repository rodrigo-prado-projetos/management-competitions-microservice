package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferBS {
    @Autowired
    private TransferRepository transferRepository;
}

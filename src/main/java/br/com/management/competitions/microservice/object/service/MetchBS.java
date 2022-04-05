package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetchBS {
    @Autowired
    private MatchRepository matchRepository;


}
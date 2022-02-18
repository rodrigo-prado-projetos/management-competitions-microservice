package br.com.management.competitions.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/competitions")
public class PlayerController {
    @GetMapping("/v1/players")
    public ResponseEntity<Object> findAllPlayers() {
        return ResponseEntity.ok("OK");
    }
}
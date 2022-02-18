package br.com.management.competitions.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/competitions")
public class TransferController {
    @GetMapping("/v1/transfers")
    public ResponseEntity<Object> findAllTransfers() {
        return ResponseEntity.ok("OK");
    }
}
package com.felipemoreira.strproducer.controllers;

import static org.springframework.http.HttpStatus.CREATED;

import com.felipemoreira.strproducer.services.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/producer")
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);

        return ResponseEntity.status(CREATED).build();
    }
}

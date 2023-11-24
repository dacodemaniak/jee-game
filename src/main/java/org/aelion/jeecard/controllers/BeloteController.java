package org.aelion.jeecard.controllers;

import org.aelion.jeecard.dto.CardSetsDto;
import org.aelion.jeecard.services.Game;
import org.aelion.jeecard.services.impl.BeloteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/belote")
public class BeloteController {
    @Autowired
    @Qualifier("belote")
    private Game service;
    @GetMapping
    public ResponseEntity<CardSetsDto> distribute() {
        return ResponseEntity.ok(this.service.distribute());
    }
}

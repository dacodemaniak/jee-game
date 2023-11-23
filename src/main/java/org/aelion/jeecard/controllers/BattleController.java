package org.aelion.jeecard.controllers;

import org.aelion.jeecard.dto.CardSetsDto;
import org.aelion.jeecard.services.BattleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/battle")
public class BattleController {
    @Autowired
    private BattleService service;


    /**
     * Endpoint for GET http://127.0.0.1:8080/
     * @return
     */
    @GetMapping
    public ResponseEntity<CardSetsDto> distribute() {
        return ResponseEntity.ok(this.service.distribute());
    }
}

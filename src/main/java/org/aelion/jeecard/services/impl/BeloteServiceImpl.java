package org.aelion.jeecard.services.impl;

import org.aelion.jeecard.dto.CardSetsDto;
import org.aelion.jeecard.entities.PlayingCard;
import org.aelion.jeecard.services.Game;
import org.aelion.jeecard.utils.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service("belote")
public class BeloteServiceImpl implements Game {
    public CardSetsDto distribute() {
        var fullDesk = Data.createDeck();

        // Filter desk to get only available cards
        var beloteDesk = new ArrayList<>(fullDesk.stream().filter(pc -> {
            return
                    !pc.getCard().equals("2") &&
                            !pc.getCard().equals("3") &&
                            !pc.getCard().equals("4") &&
                            !pc.getCard().equals("5") &&
                            !pc.getCard().equals("6");
        }).toList());

        // Shuffle collection
        Collections.shuffle(beloteDesk);

        // Create a DTO
        var dto = new CardSetsDto();

        // Sets the DTO
        dto.hands.put("Player 1", new ArrayList<PlayingCard>(beloteDesk.subList(0, 7)));
        dto.hands.put("Player 2", new ArrayList<PlayingCard>(beloteDesk.subList(7, 14)));
        dto.hands.put("Player 3", new ArrayList<PlayingCard>(beloteDesk.subList(14, 21)));
        dto.hands.put("Player 4", new ArrayList<PlayingCard>(beloteDesk.subList(21, 28)));

        return dto;


    }
}

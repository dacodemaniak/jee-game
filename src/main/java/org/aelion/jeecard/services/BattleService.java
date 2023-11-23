package org.aelion.jeecard.services;

import org.aelion.jeecard.dto.CardSetsDto;
import org.aelion.jeecard.entities.PlayingCard;
import org.aelion.jeecard.utils.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class BattleService {
    public CardSetsDto distribute() {
        // Get full cards deck from Data class
        ArrayList<PlayingCard> deck = (ArrayList<PlayingCard>) Data.createDeck();

        // Shuffle deck
        Collections.shuffle(deck);

        var cardSets = new CardSetsDto();

        // 26 cards for player one
        ArrayList<PlayingCard> subList = new ArrayList<PlayingCard>(deck.subList(0, 26));
        cardSets.hands.put("Player 1", subList);

        // 26 cards for player two
        subList = new ArrayList<PlayingCard>(deck.subList(26, 52));
        cardSets.hands.put("Player 2", subList);

        return cardSets;
    }
}

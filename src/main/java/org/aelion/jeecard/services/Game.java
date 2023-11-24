package org.aelion.jeecard.services;

import org.aelion.jeecard.dto.CardSetsDto;

public interface Game {
    /**
     * Deck distribution no matter what game
     * @return
     */
    CardSetsDto distribute();
}

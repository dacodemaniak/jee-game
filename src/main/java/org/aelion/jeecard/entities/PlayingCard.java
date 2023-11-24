package org.aelion.jeecard.entities;

@Entity
public final class PlayingCard extends Card {
    private String card;

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}

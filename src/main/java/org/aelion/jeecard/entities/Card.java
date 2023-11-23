package org.aelion.jeecard.entities;

import org.aelion.jeecard.entities.enums.Family;

public abstract class Card {
    /**
     * Color of a card
     */
    private String color;

    /**
     * Card family
     */
    protected Family family;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String toString() {
        String output = "";
        switch (this.family) {
            case HEARTS:
                output = "Coeurs";
                break;
            case SPADES:
                output = "Piques";
                break;
            case DIAMONDS:
                output = "Carreaux";
                break;
            case CLUBS:
                output = "Trèfles";
                break;
            default:
                break;
        }
        return output;
    }
}

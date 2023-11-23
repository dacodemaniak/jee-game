package org.aelion.jeecard.dto;

import org.aelion.jeecard.entities.PlayingCard;

import java.util.ArrayList;
import java.util.HashMap;

public class CardSetsDto {
    public HashMap<String, ArrayList<PlayingCard>> hands  = new HashMap();
}

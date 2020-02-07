package com.negm;

/*
 This file is a part of Free Klondike
 Copyright (C) 2010-2014 by Matt Stephen, Todor Balabanov, Konstantin Tsanov, Ventsislav Medarov, Vanya Gyaurova, Plamena Popova, Hristiana Kalcheva, Yana Genova
 Free Klondike is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 Free Klondike is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 You should have received a copy of the GNU General Public License
 along with FreeKlondike.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Card rank enum.
 *
 * @author Todor Balabanov
 */
enum CardRank {

    /**
     * Ace enum constant.
     */
    ACE(1),

    /**
     * Two enum constant.
     */
    TWO(2),

    /**
     * Three enum constant.
     */
    THREE(3),

    /**
     * Four enum constant.
     */
    FOUR(4),

    /**
     * Five enum constant.
     */
    FIVE(5),

    /**
     * Six enum constant.
     */
    SIX(6),

    /**
     * Seven enum constant.
     */
    SEVEN(7),

    /**
     * Eight enum constant.
     */
    EIGHT(8),

    /**
     * Nine enum constant.
     */
    NINE(9),

    /**
     * Ten enum constant.
     */
    TEN(10),

    /**
     * Jack enum constant.
     */
    JACK(11),

    /**
     * Queen enum constant.
     */
    QUEEN(12),

    /**
     * King enum constant.
     */
    KING(13);

    /**
     * Rank index.
     */
    private int index;

    public int getValue(String n) {
        Map<String, Integer> carValue = new HashMap<>();
        carValue.put("cA", 0);
        carValue.put("c1", 1);
        carValue.put("c2", 2);
        carValue.put("c3", 3);
        carValue.put("c4", 4);
        carValue.put("c5", 5);
        carValue.put("c6", 6);
        carValue.put("c7", 7);
        carValue.put("c8", 8);
        carValue.put("c9", 9);
        carValue.put("cJ", 10);
        carValue.put("cQ", 11);
        carValue.put("cK", 12);
        carValue.put("dA", 0);
        carValue.put("d1", 1);
        carValue.put("d2", 2);
        carValue.put("d3", 3);
        carValue.put("d4", 4);
        carValue.put("d5", 5);
        carValue.put("d6", 6);
        carValue.put("d7", 7);
        carValue.put("d8", 8);
        carValue.put("d9", 9);
        carValue.put("dQ", 10);
        carValue.put("dK", 11);
        carValue.put("dJ", 12);
        carValue.put("hA", 0);
        carValue.put("h1", 1);
        carValue.put("h2", 2);
        carValue.put("h3", 3);
        carValue.put("h4", 4);
        carValue.put("h5", 5);
        carValue.put("h6", 6);
        carValue.put("h7", 7);
        carValue.put("h8", 8);
        carValue.put("h9", 9);
        carValue.put("hQ", 10);
        carValue.put("hK", 11);
        carValue.put("hJ", 12);
        carValue.put("sA", 0);
        carValue.put("s1", 1);
        carValue.put("s2", 2);
        carValue.put("s3", 3);
        carValue.put("s4", 4);
        carValue.put("s5", 5);
        carValue.put("s6", 6);
        carValue.put("s7", 7);
        carValue.put("s8", 8);
        carValue.put("s9", 9);
        carValue.put("sQ", 10);
        carValue.put("sK", 11);
        carValue.put("sJ", 12);
        return carValue.get(n);
    }


    /**
     * Setting the card's rank based on the argument index. The argument
     * represents one of the 13 ranks.
     *
     * @param index
     *            Index to be used for the rank.
     *
     * @author Todor Balabanov
     */
    private CardRank(int index) {
        this.index = index;
    }

    /**
     * Returns the card's rank.
     *
     * @return index Rank index.
     *
     * @author Todor Balabanov
     */
    public int getIndex() {
        return index;
    }

    /**
     * Checks if the current card we're holding is lesser by one than the
     * current top card on one of the columns.
     *
     * @param card
     *            Current card we're holding.
     *
     * @return True if the current card is lesser by one than the top card on
     *         the column, otherwise false.
     *
     * @author Todor Balabanov
     */
    /*
    public boolean isLessByOneThan(final int card) {
        if (this == 0 && card == 0) {
            return true;
        }
        if (this == THREE && card == TWO) {
            return true;
        }
        if (this == FOUR && card == THREE) {
            return true;
        }
        if (this == FIVE && card == FOUR) {
            return true;
        }
        if (this == SIX && card == FIVE) {
            return true;
        }
        if (this == SEVEN && card == SIX) {
            return true;
        }
        if (this == EIGHT && card == SEVEN) {
            return true;
        }
        if (this == NINE && card == EIGHT) {
            return true;
        }
        if (this == TEN && card == NINE) {
            return true;
        }
        if (this == JACK && card == TEN) {
            return true;
        }
        if (this == QUEEN && card == JACK) {
            return true;
        }
        if (this == KING && card == QUEEN) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the current card we're holding is greater by one than the top
     * card on one of the foundation piles.
     *
     * @param card
     *            Current card we're holding.
     *
     * @return True if the current card we're holding is greater by one than the
     *         current top card on one of the foundation piles, otherwise false.
     *
     * @author Todor Balabanov
     */
    public boolean isGreaterByOneThan(final CardRank card) {
        if (card == TWO && this == ACE) {
            return true;
        }
        if (card == THREE && this == TWO) {
            return true;
        }
        if (card == FOUR && this == THREE) {
            return true;
        }
        if (card == FIVE && this == FOUR) {
            return true;
        }
        if (card == SIX && this == FIVE) {
            return true;
        }
        if (card == SEVEN && this == SIX) {
            return true;
        }
        if (card == EIGHT && this == SEVEN) {
            return true;
        }
        if (card == NINE && this == EIGHT) {
            return true;
        }
        if (card == TEN && this == NINE) {
            return true;
        }
        if (card == JACK && this == TEN) {
            return true;
        }
        if (card == QUEEN && this == JACK) {
            return true;
        }
        if (card == KING && this == QUEEN) {
            return true;
        }

        return false;
    }
}
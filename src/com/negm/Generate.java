package com.negm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Generate {
    public ArrayList<String> column = new ArrayList<String>();
    public ArrayList<String> deck = new ArrayList<String>(
            Arrays.asList("cA", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "cJ", "cQ", "cK",
                    "dA", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "dJ", "dQ", "dK",
                    "hA", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "hJ", "hQ", "hK",
                    "sA", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "sJ", "sQ", "sK"));
    public Generate(){}

    public Generate(ArrayList<String> column) {
        this.column = column;
        this.deck = deck;
    }


    public ArrayList<String> column(int columnSize){
        Random rd = new Random();
        int indexTemp = rd.nextInt(deck.size());
        column.add(deck.get(indexTemp));
        deck.remove(indexTemp);
        indexTemp--;
        return column;
    }
}

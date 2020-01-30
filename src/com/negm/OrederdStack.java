package com.negm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class OrederdStack {
    public ArrayList<String> deck = new ArrayList<String>(
            Arrays.asList("cA", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "cJ", "cQ", "cK",
                    "dA", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "dJ", "dQ", "dK",
                    "hA", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "hJ", "hQ", "hK",
                    "sA", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "sJ", "sQ", "sK"));
    public Stack<String> column1 = new Stack<>();
    public Stack<String> column2 = new Stack<String>();
    public Stack<String> column3 = new Stack<String>();
    public Stack<String> column4 = new Stack<String>();
    public Stack<String> column5 = new Stack<String>();
    public Stack<String> column6 = new Stack<String>();
    public Stack<String> column7 = new Stack<String>();
    public Stack<String> column8 = new Stack<String>();
    public Stack<String> column9 = new Stack<String>();
    public GenerateColSize size = new GenerateColSize();
    public Random rd = new Random();
    public OrederdStack(){}
    public OrederdStack(ArrayList<String> deck) {
        this.deck = deck;
    }

    public void shuffleDeck() {

        for (int index = 0; index < size.getcol1(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column1.push(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol2(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column2.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol3(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column3.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol4(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column4.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol5(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column5.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol6(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column6.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol7(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column7.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }


        for (int index = 0; index < size.getcol8(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column8.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }
        //column9 is just an extra column no data need to be inserted in it

    }
}

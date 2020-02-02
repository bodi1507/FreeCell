package com.negm;

import java.util.*;

public class OrederdStack {
    public ArrayList<String> deck = new ArrayList<String>(
            Arrays.asList("cA", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "cJ", "cQ", "cK",
                    "dA", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "dJ", "dQ", "dK",
                    "hA", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "hJ", "hQ", "hK",
                    "sA", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "sJ", "sQ", "sK"));


    public Stack<String> pileC = new Stack<String>();
    public Stack<String> pileD = new Stack<String>();
    public Stack<String> pileH = new Stack<String>();
    public Stack<String> pileS = new Stack<String>();
    public Stack<String> column1 = new Stack<String>();
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

    public OrederdStack() {
    }

    public OrederdStack(ArrayList<String> deck) {
        this.deck = deck;
    }
    public void pushC(String cardName) {
        if (column1.peek() == cardName) {
            pileC.push(cardName);
            column1.pop();
        } else
            System.out.println("error");

    }
    public void move(){}
    public String getTopCard(String columnNum){
        switch (columnNum){
            case "1": return column1.peek();
            case "2": return column2.peek();
            case "3": return column3.peek();
            case "4": return column4.peek();
            case "5": return column5.peek();
            case "6": return column6.peek();
            case "7": return column7.peek();
            case "8": return column8.peek();
            case "c": pileC.peek();
            case "d": pileD.peek();
            case "h": pileH.peek();
            case "s": pileS.peek();
            default:
                return "error";
        }
    }
    public int getCardValue(String n) {
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

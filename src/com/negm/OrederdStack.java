package com.negm;

import java.util.*;

public class OrederdStack {
    public ArrayList<String> deck = new ArrayList<String>(
            Arrays.asList("cA", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "cJ", "cQ", "cK",
                    "dA", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "dJ", "dQ", "dK",
                    "hA", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "hJ", "hQ", "hK",
                    "sA", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "sJ", "sQ", "sK"));


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

    public void push(String cardName, String colTo) {
        System.out.println(colTo);
        if(colTo.equals("1") || colTo.equals("2")|| colTo.equals("3") || colTo.equals("4") ||colTo.equals("5") || colTo.equals("6") || colTo.equals("7") || colTo.equals("8") || colTo.equals("9")){
            if (getCardValue(getTopCard(colTo)) == getCardValue(cardName) + 1) {
                pushTo(colTo, cardName);
            } else
                System.out.println("error at colPush");
        }
        else {
            if (getCardValue(getTopCard(colTo)) == getCardValue(cardName) - 1) {
                pushTo(colTo, cardName);
            } else
                System.out.println("error at pilePush");
        }

    }

    public void moveTo(String colFrom, String cardName, String colTo) {
        if (colTo.equals("h") || colTo.equals("c")|| colTo.equals("s")|| colTo.equals("d")){
            if (cardName.compareTo(getTopCard(colFrom)) == 0) {
                System.out.println("moveTo-pile");
                pilePush(cardName,colTo,colFrom);

            } else
                System.out.println("error MoveTo pile" + " " + cardName + " : " + getTopCard(colFrom));
        }
        else {
            if (cardName.compareTo(getTopCard(colFrom)) == 0) {
                push(cardName, colTo);
                popFrom(colFrom);
            } else
                System.out.println("error moveTo column" + " " + cardName + " : " + getTopCard(colFrom));
        }
    }
    public boolean compare(String colFrom, String cardName){
        if (getTopCard(colFrom) == cardName) {
            return true;
        }
        else
            return false;
    }

    public void pushTo(String colTo, String cardName) {
        switch (colTo) {
            case "1":
                column1.push(cardName);
                break;
            case "2":
                column2.push(cardName);
                break;
            case "3":
                column3.push(cardName);
                break;
            case "4":
                column4.push(cardName);
                break;
            case "5":
                column5.push(cardName);
                break;
            case "6":
                column6.push(cardName);
                break;
            case "7":
                column7.push(cardName);
                break;
            case "8":
                column8.push(cardName);
                break;
            case "9":
                column9.push(cardName);
                break;
            case "c":
                pileC.push(cardName);
                break;
            case "d":
                pileD.push(cardName);
                break;
            case "h":
                pileH.push(cardName);
                break;
            case "s":
                pileS.push(cardName);
                break;
            default:
                System.out.println("error at pushTo method");
        }
    }

    public void popFrom(String colFrom) {
        switch (colFrom) {
            case "1":
                column1.pop();
                break;
            case "2":
                column2.pop();
                break;
            case "3":
                column3.pop();
                break;
            case "4":
                column4.pop();
                break;
            case "5":
                column5.pop();
                break;
            case "6":
                column6.pop();
                break;
            case "7":
                column7.pop();
                break;
            case "8":
                column8.pop();
                break;
            case "9":
                column9.pop();
                break;
            default:
                System.out.println("error at popFrom method");
        }
    }

    public String getTopCard(String columnNum) {
        try {
            switch (columnNum) {
                case "1":
                    return column1.peek();
                case "2":
                    return column2.peek();
                case "3":
                    return column3.peek();
                case "4":
                    return column4.peek();
                case "5":
                    return column5.peek();
                case "6":
                    return column6.peek();
                case "7":
                    return column7.peek();
                case "8":
                    return column8.peek();
                case "9":
                    return column9.peek();
                case "c":
                    if(pileC.isEmpty())
                        return "";
                    else return pileC.peek();
                case "d":
                    if(pileD.isEmpty())
                        return "0";
                    else return pileD.peek();
                case "h":
                    if(pileH.isEmpty())
                        return "0";
                    else return pileH.peek();
                case "s":
                    if(pileS.isEmpty())
                        return "0";
                    else return pileS.peek();
                default:
                    return "error1";
            }
        } catch (EmptyStackException e) {
            System.out.println("error2");
            throw e;
        }
    }

    public int getCardValue(String n) {
        Map<String, Integer> carValue = new HashMap<>();
        carValue.put("cA", 1);
        carValue.put("c2", 2);
        carValue.put("c3", 3);
        carValue.put("c4", 4);
        carValue.put("c5", 5);
        carValue.put("c6", 6);
        carValue.put("c7", 7);
        carValue.put("c8", 8);
        carValue.put("c9", 9);
        carValue.put("c10", 10);
        carValue.put("cJ", 11);
        carValue.put("cQ", 12);
        carValue.put("cK", 13);
        carValue.put("dA", 1);
        carValue.put("d2", 2);
        carValue.put("d3", 3);
        carValue.put("d4", 4);
        carValue.put("d5", 5);
        carValue.put("d6", 6);
        carValue.put("d7", 7);
        carValue.put("d8", 8);
        carValue.put("d9", 9);
        carValue.put("d10",10);
        carValue.put("dJ", 11);
        carValue.put("dQ", 12);
        carValue.put("dK", 13);
        carValue.put("hA", 1);
        carValue.put("h2", 2);
        carValue.put("h3", 3);
        carValue.put("h4", 4);
        carValue.put("h5", 5);
        carValue.put("h6", 6);
        carValue.put("h7", 7);
        carValue.put("h8", 8);
        carValue.put("h9", 9);
        carValue.put("h10", 10);
        carValue.put("hJ", 11);
        carValue.put("hQ", 12);
        carValue.put("hK", 13);
        carValue.put("sA", 1);
        carValue.put("s2", 2);
        carValue.put("s3", 3);
        carValue.put("s4", 4);
        carValue.put("s5", 5);
        carValue.put("s6", 6);
        carValue.put("s7", 7);
        carValue.put("s8", 8);
        carValue.put("s9", 9);
        carValue.put("s10", 10);
        carValue.put("sJ", 11);
        carValue.put("sQ", 12);
        carValue.put("sK", 13);
        carValue.put(".", 0);
        return carValue.get(n);
    }
    public void pilePush(String cardName, String colTo,String colFrom  ){
        System.out.println("pilePush fun6 ");
        if((cardName.equals("cA")) || (cardName.matches("c") && (getCardValue(getTopCard(colTo)) == getCardValue(cardName) - 1)) ){
            pileC.push(cardName);
            popFrom(colFrom);
            System.out.println("pile Push c");
        }
        else if
        ((cardName.equals("hA")) || ( cardName.matches("h") && (getCardValue(getTopCard(colTo)) == getCardValue(cardName) - 1)) ){
            pileH.push(cardName);
            popFrom(colFrom);
        }
        else if
        ((cardName.equals("sA")) || (cardName.matches("s") &&  (getCardValue(getTopCard(colTo)) == getCardValue(cardName) - 1)) ){
            pileS.push(cardName);
            popFrom(colFrom);
        }
        else if
        ((cardName.equals("dA")) ||(cardName.matches("d") &&  (getCardValue(getTopCard(colTo)) == getCardValue(cardName) - 1) )){
            pileD.push(cardName);
            popFrom(colFrom);
        }
        else{
            System.out.println("nothing is moved pilepush");
        }

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
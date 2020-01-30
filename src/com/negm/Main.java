/*
v1.3
Changed:
1) added PointValue class that returns the back face value of a card
2) GenerateColSize now generates a value within a specific range
Status:
1) compiling with no errors
2) PointValue class is incomplete
 */


package com.negm; /*remove me when compiling using cmd
                    if compiling in IDE replace with your own domain*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
    public static void main(String[] args) throws Exception {
        String colFrom;
        String colTo;
        String cardName;


        ArrayList<String> deck = new ArrayList<String>(
                Arrays.asList("cA", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "cJ", "cQ", "cK",
                        "dA", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "dJ", "dQ", "dK",
                        "hA", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "hJ", "hQ", "hK",
                        "sA", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "sJ", "sQ", "sK"));


        ArrayList<String> pileC = new ArrayList<String>();
        ArrayList<String> pileD = new ArrayList<String>();
        ArrayList<String> pileH = new ArrayList<String>();
        ArrayList<String> pileS = new ArrayList<String>();


        GenerateColSize size = new GenerateColSize();
        Random rd = new Random();

        //These For loops generates random columns so it can be printed later
        ArrayList<String> column1 = new ArrayList<String>();
        for (int index = 0; index < size.getcol1(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column1.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column2 = new ArrayList<String>();
        for (int index = 0; index < size.getcol2(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column2.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column3 = new ArrayList<String>();
        for (int index = 0; index < size.getcol3(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column3.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column4 = new ArrayList<String>();
        for (int index = 0; index < size.getcol4(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column4.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column5 = new ArrayList<String>();
        for (int index = 0; index < size.getcol5(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column5.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column6 = new ArrayList<String>();
        for (int index = 0; index < size.getcol6(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column6.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column7 = new ArrayList<String>();
        for (int index = 0; index < size.getcol7(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column7.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }

        ArrayList<String> column8 = new ArrayList<String>();
        for (int index = 0; index < size.getcol8(); index++) {
            int indexTemp = rd.nextInt(deck.size());
            column8.add(deck.get(indexTemp));
            deck.remove(indexTemp);
            indexTemp--;
        }
        //column9 is just an extra column no data need to be inserted in it
        ArrayList<String> column9 = new ArrayList<String>(Arrays.asList("a"));


        PointValue v = new PointValue();
        //System.out.println(v.retVal("cA"));
        do {
            System.out.println(column9.size());
            System.out.println("Pile   C : " + pileC);
            System.out.println("Pile   D : " + pileD);
            System.out.println("Pile   H : " + pileH);
            System.out.println("Pile   S : " + pileS);
            System.out.println("Column 1 : " + column1);
            System.out.println("Column 2 : " + column2);
            System.out.println("Column 3 : " + column3);
            System.out.println("Column 4 : " + column4);
            System.out.println("Column 5 : " + column5);
            System.out.println("Column 6 : " + column6);
            System.out.println("Column 7 : " + column7);
            System.out.println("Column 8 : " + column8);
            System.out.println("Column 9 : " + column9);


            System.out.print("Command->> ");
            Scanner input = new Scanner(System.in);
            colFrom = input.next();
            cardName = input.next();
            colTo = input.next();

            // Need to put these if conditions in a class

            //if condition to remove the element selected by the user from the original array
            if (colFrom.equals("1")) {
                column1.remove(cardName);
            } else if (colFrom.equals("2")) {
                column2.remove(cardName);
            } else if (colFrom.equals("3")) {
                column3.remove(cardName);
            } else if (colFrom.equals("4")) {
                column4.remove(cardName);
            } else if (colFrom.equals("5")) {
                column5.remove(cardName);
            } else if (colFrom.equals("6")) {
                column6.remove(cardName);
            } else if (colFrom.equals("7")) {
                column7.remove(cardName);
            } else if (colFrom.equals("8")) {
                column8.remove(cardName);
            } else if (colFrom.equals("9")) {
                column9.remove(cardName);
            }

            //if condition to add the element selected by the user to a selected array
            if (colTo == "1") {
                column1.add(cardName);
            } else if (colTo.equals("2")) {
                column2.add(cardName);
            } else if (colTo.equals("3")) {
                column3.add(cardName);
            } else if (colTo.equals("4")) {
                column4.add(cardName);
            } else if (colTo.equals("5")) {
                column5.add(cardName);
            } else if (colTo.equals("6")) {
                column6.add(cardName);
            } else if (colTo.equals("7")) {
                column7.add(cardName);
            } else if (colTo.equals("8")) {
                column8.add(cardName);
            } else if (colTo.equals("9")) {
                column9.add(cardName);
            } else if (colTo.equals("c")) {
                pileC.add(cardName);
            } else if (colTo.equals("d")) {
                pileD.add(cardName);
            } else if (colTo.equals("h")) {
                pileH.add(cardName);
            } else if (colTo.equals("s")) {
                pileS.add(cardName);
            }
            cls();
        } while (!cardName.equals("x"));

    }
}

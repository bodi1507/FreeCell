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

import java.util.*;

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

        Stack<String> deckStack = new Stack<String>();


        ArrayList<String> pileC = new ArrayList<String>();
        ArrayList<String> pileD = new ArrayList<String>();
        ArrayList<String> pileH = new ArrayList<String>();
        ArrayList<String> pileS = new ArrayList<String>();




        PointValue v = new PointValue();
        //System.out.println(v.retVal("cA"));
        OrederdStack n = new OrederdStack();
        n.shuffleDeck();
        do {

            System.out.println("Pile   C : " + pileC);
            System.out.println("Pile   D : " + pileD);
            System.out.println("Pile   H : " + pileH);
            System.out.println("Pile   S : " + pileS);
            System.out.println("Column 1 : " + n.column1);
            System.out.println("Column 2 : " + n.column2);
            System.out.println("Column 3 : " + n.column3);
            System.out.println("Column 4 : " + n.column4);
            System.out.println("Column 5 : " + n.column5);
            System.out.println("Column 6 : " + n.column6);
            System.out.println("Column 7 : " + n.column7);
            System.out.println("Column 8 : " + n.column8);
            System.out.println("Column 9 : " + n.column9);


            System.out.print("Command->> ");
            Scanner input = new Scanner(System.in);
            //colFrom = input.next();
            cardName = input.next();
            //colTo = input.next();
            n.pushC(cardName);
           

            // Need to put these if conditions in a class

            //if condition to remove the element selected by the user from the original array
            cls();
        } while (!cardName.equals("x"));

    }
}

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




        OrederdStack n = new OrederdStack();
        n.shuffleDeck();
        /*n.pileC.push(".");
        n.pileD.push(".");
        n.pileS.push(".");
        n.pileH.push(".");  */

        /*n.column9.push("d2");
        n.column9.push("c2");
        n.column9.push("h2");
        n.column9.push("s2");
        n.column9.push("sA"); */

        do {
            if((n.column1.isEmpty() && n.column2.isEmpty()&& n.column3.isEmpty()&& n.column4.isEmpty()&& n.column5.isEmpty()&& n.column6.isEmpty()&& n.column7.isEmpty()&& n.column8.isEmpty()&& n.column9.isEmpty()))
            {
                n.PrintBoard();
                System.out.println("Game is done");
                break;
            }
            n.PrintBoard();
            System.out.print("Command->> ");
            Scanner input = new Scanner(System.in);
            colFrom = input.next();
            if(colFrom.equals("r")){
                String colRot = input.next();
                n.colRotation(colRot);
            }
            else {
                cardName = input.next();
                colTo = input.next();
                n.moveTo(colFrom, cardName, colTo);
            }
            cls();
        } while (!colFrom.equals("x"));
        {
            System.out.println("done...");
        }

    }
}

/*
a class that returns the back face value of a card
 */

package com.negm; /*remove me when compiling using cmd
                    if compiling in IDE replace with your own domain*/

public class PointValue {
    public String searchVar;

    public PointValue(){}
    public PointValue(String searchVar) {
        this.searchVar = searchVar;
    }
    public String retVal(String searchVar){
        switch (searchVar){
            case "cA": case "dA": case "hA": case "sA": searchVar = "1"; break;
            case "c2": case "d2": case "h2": case "s2": searchVar = "2"; break;
            case "c3": case "d3": case "h3": case "s3": searchVar = "3"; break;
            case "c4": case "d4": case "h4": case "s4": searchVar = "4"; break;
            case "c5": case "d5": case "h5": case "s5": searchVar = "5"; break;
            case "c6": case "d6": case "h6": case "s6": searchVar = "6"; break;
            case "c7": case "d7": case "h7": case "s7": searchVar = "7"; break;
            case "c8": case "d8": case "h8": case "s8": searchVar = "8"; break;
            case "c9": case "d9": case "h9": case "s9": searchVar = "9"; break;
            case "c10": case "d10": case "h10": case "s10": searchVar = "10"; break;
        }
        return searchVar;
    }
   
}

package com.company;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> polishNumbers = new HashMap<>();
        fillHashMap(polishNumbers);
        try {
            String expression = JOptionPane.showInputDialog("Please enter expression: ");
            NumericalExpression myExpression = new NumericalExpression(expression);
            JOptionPane.showMessageDialog(null, "Translated expression: " + myExpression.translateExpression(polishNumbers));
        } catch(InvalidExpression e) {
            JOptionPane.showMessageDialog(null, "An error occured!");
            e.printStackTrace();
        }
    }

    static void fillHashMap(HashMap<String, String> myHashMap) {
        myHashMap.put("0", "zero");
        myHashMap.put("1", "jeden");
        myHashMap.put("2", "dwa");
        myHashMap.put("3", "trzy");
        myHashMap.put("4", "cztery");
        myHashMap.put("5", "piec");
        myHashMap.put("6", "szesc");
        myHashMap.put("7", "siedem");
        myHashMap.put("8", "osiem");
        myHashMap.put("9", "dziewiec");
        myHashMap.put("10", "dziesiec");
        myHashMap.put("11", "jedenascie");
        myHashMap.put("12", "dwanascie");
        myHashMap.put("13", "trzynascie");
        myHashMap.put("14", "czternascie");
        myHashMap.put("15", "pietnascie");
        myHashMap.put("16", "szesnascie");
        myHashMap.put("17", "siedemnascie");
        myHashMap.put("18", "osiemnascie");
        myHashMap.put("19", "dziewietnascie");
        myHashMap.put("20", "dwadziescia");
        myHashMap.put("21", "dwadziescia jeden");
        myHashMap.put("22", "dwadziescia dwa");
        myHashMap.put("23", "dwadziescia trzy");
        myHashMap.put("24", "dwadziescia cztery");
        myHashMap.put("25", "dwadziescia piec");
        myHashMap.put("26", "dwadziescia szesc");
        myHashMap.put("27", "dwadziescia siedem");
        myHashMap.put("28", "dwadziescia osiem");
        myHashMap.put("29", "dwadziescia dziewiec");
        myHashMap.put("30", "trzydziesci");
        myHashMap.put("31", "trzydziesci jeden");
        myHashMap.put("32", "trzydziesci dwa");
        myHashMap.put("33", "trzydziesci trzy");
        myHashMap.put("34", "trzydziesci cztery");
        myHashMap.put("35", "trzydziesci 5");
        myHashMap.put("36", "trzydziesci szesc");
        myHashMap.put("37", "trzydziesci siedem");
        myHashMap.put("38", "trzydziesci osiem");
        myHashMap.put("39", "trzydziesci dziewiec");
        myHashMap.put("40", "czterdziesci");
        myHashMap.put("41", "czterdziesci jeden");
        myHashMap.put("42", "czterdziesci dwa");
        myHashMap.put("43", "czterdziesci trzy");
        myHashMap.put("44", "czterdziesci cztery");
        myHashMap.put("45", "czterdziesci piec");
        myHashMap.put("46", "czterdziesci szesc");
        myHashMap.put("47", "czterdziesci siedem");
        myHashMap.put("48", "czterdziesci osiem");
        myHashMap.put("49", "czterdziesci dziewiec");
        myHashMap.put("50", "piecdziesiat");
        myHashMap.put("51", "piecdziesiat jeden");
        myHashMap.put("52", "piecdziesiat dwa");
        myHashMap.put("53", "piecdziesiat trzy");
        myHashMap.put("54", "piecdziesiat cztery");
        myHashMap.put("55", "piecdziesiat piec");
        myHashMap.put("56", "piecdziesiat szesc");
        myHashMap.put("57", "piecdziesiat siedem");
        myHashMap.put("58", "piecdziesiat osiem");
        myHashMap.put("59", "piecdziesiat dziewiec");
        myHashMap.put("60", "szescdziesiat");
        myHashMap.put("61", "szescdziesiat jeden");
        myHashMap.put("62", "szescdziesiat dwa");
        myHashMap.put("63", "szescdziesiat trzy");
        myHashMap.put("64", "szescdziesiat cztery");
        myHashMap.put("65", "szescdziesiat piec");
        myHashMap.put("66", "szescdziesiat szesc");
        myHashMap.put("67", "szescdziesiat siedem");
        myHashMap.put("68", "szescdziesiat osiem");
        myHashMap.put("69", "szescdziesiat dziewiec");
        myHashMap.put("70", "siedemdziesiat");
        myHashMap.put("71", "siedemdziesiat jeden");
        myHashMap.put("72", "siedemdziesiat dwa");
        myHashMap.put("73", "siedemdziesiat trzy");
        myHashMap.put("74", "siedemdziesiat cztery");
        myHashMap.put("75", "siedemdziesiat piec");
        myHashMap.put("76", "siedemdziesiat szesc");
        myHashMap.put("77", "siedemdziesiat siedem");
        myHashMap.put("78", "siedemdziesiat osiem");
        myHashMap.put("79", "siedemdziesiat dziewiec");
        myHashMap.put("80", "osiemdziesiat");
        myHashMap.put("81", "osiemdziesiat jeden");
        myHashMap.put("82", "osiemdziesiat dwa");
        myHashMap.put("83", "osiemdziesiat trzy");
        myHashMap.put("84", "osiemdziesiat cztery");
        myHashMap.put("85", "osiemdziesiat piec");
        myHashMap.put("86", "osiemdziesiat szesc");
        myHashMap.put("87", "osiemdziesiat siedem");
        myHashMap.put("88", "osiemdziesiat osiem");
        myHashMap.put("89", "osiemdziesiat dziewiec");
        myHashMap.put("90", "dziewiecdziesiat");
        myHashMap.put("91", "dziewiecdziesiat jeden");
        myHashMap.put("92", "dziewiecdziesiat dwa");
        myHashMap.put("93", "dziewiecdziesiat trzy");
        myHashMap.put("94", "dziewiecdziesiat cztery");
        myHashMap.put("95", "dziewiecdziesiat piec");
        myHashMap.put("96", "dziewiecdziesiat szesc");
        myHashMap.put("97", "dziewiecdziesiat siedem");
        myHashMap.put("98", "dziewiecdziesiat osiem");
        myHashMap.put("99", "dziewiecdziesiat dziewiec");
        myHashMap.put("+", "plus");
        myHashMap.put("*", "razy");
        myHashMap.put("-", "minus");
    }

}



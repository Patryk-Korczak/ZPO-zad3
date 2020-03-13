package com.company;
import java.util.HashMap;

public class NumericalExpression {
    private String expression;

    NumericalExpression(String expression) throws InvalidExpression {
        this.expression = expression;
        if(!validateExpression()) throw new InvalidExpression("Passed expression is invalid.");
    }

    public String translateExpression(HashMap<String, String> dictionary) {
        String[] splittedExpression = expression.split("\\s+");
        StringBuilder translatedExpression = new StringBuilder();

        for(String token : splittedExpression) {
            translatedExpression.append(dictionary.get(token));
            translatedExpression.append(" ");
        }

        return translatedExpression.toString();
    }

    public String getExpression() {
        return expression;
    }

    private boolean validateExpression() {
        if(!(Character.isDigit(expression.charAt(expression.length() - 1)))) return false; //last part of expression must be digit to be valid

        for(char c : expression.toCharArray()) { // if any character isn't digit or operator or space expression is invalid
            if(!(Character.isDigit(c))) {
                if(!(c == '-' | c == '+' | c == '+' | c == 32)) return false;
            }
        }

        String[] splittedExpression = expression.split("\\s+"); // parts at 1st,3rd etc. slots are values and are max 2 chars long, parts at 2nd, 4th etc. slots are operators and have to be max 1 char
        int tokenNumber = 1;
        for(String token : splittedExpression){
            if(tokenNumber % 2 == 1) {
                if(token.length() > 2) return false;
            } else {
                if(token.length() > 1) return false;
            }
            tokenNumber++;
        }

        return true;
    }
}

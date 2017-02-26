package com.sathiya.arithmeticexpressionscalculator;

import java.util.Stack;

/**
 *
 * @author smdgandhi
 */
public class CalculateArithmaticExpression {

    protected String calculate()throws ArithmeticException {
        String str = "(1 + 38) * 5";
        str = str.replaceAll("\\s|[()]", "");
        Stack<Integer> operandsVal = new Stack<>();
        Stack<Character> operandsOperator = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] character = str.toCharArray();
        int result = 0;
        for (int i = 0; i < character.length; i++) {

            if (isOperator(character[i])) {
                operandsOperator.push(character[i]);
            } else {
                sb.append(character[i]);
                if ((i == character.length - 1 || isOperator(character[i + 1])) && sb.length() > 0) {
                    operandsVal.push(Integer.valueOf(sb.toString()));
                    sb = new StringBuilder();
                }
            }
        }
        while (!operandsOperator.empty()) {
            result = calculateValues(operandsOperator.pop(), operandsVal.pop(), operandsVal.pop());
            System.out.println("Result" + result);
            operandsVal.push(result);
        }
        
        return String.valueOf(result);
    }

    private int calculateValues(char operator, int value2, int value1) throws ArithmeticException{
//    int result;
        switch (operator) {
            case '+':
                return Math.addExact(value1, value2);
            case '-':
                return Math.subtractExact(value1, value2);
            case '*':
                return Math.multiplyExact(value1, value2);
            case '/':
                if (value2 == 0) {
                    throw new UnsupportedOperationException("Divided by Zero");
                }
                return value1 / value2;
        }

        return 0;
    }

    private boolean isOperator(char character) {
        return character == '+' || character == '-'
                || character == '*' || character == '/';
    }
}

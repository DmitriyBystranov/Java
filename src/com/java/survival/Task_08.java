package com.java.survival;

import java.util.Scanner;
import java.util.Stack;


public class Task_08 {
    public static String expressionToReversePolishNotation (String exp) {
        String rpn = "";// reverse polish notation line
        Stack<Character> stack = new Stack<>();
        int priority;
        for (int i = 0; i < exp.length(); i++) {

            priority = getP(exp.charAt(i));
            char currentCharExp = exp.charAt(i);


            if(priority == 0) rpn += currentCharExp;
            if(priority == 1) stack.push(currentCharExp);
            if(priority > 1) {
                rpn += ' ';
                while (!stack.empty()) {
                    if (getP(stack.peek()) >= priority) rpn += stack.pop();
                        else break;
                }
                stack.push(currentCharExp);
            }

            if(priority == -1) {
                rpn += ' ';
                while (getP(stack.peek()) != 1) {
                    rpn += stack.pop();
                }
                stack.pop();
            }
        }
        while (!stack.empty()) {
            rpn += stack.pop();
        }
        return rpn;
    }

    public static double rpnToAnswer(String rpn) {
        String operand = "";
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < rpn.length(); i++) {

            if (rpn.charAt(i) == ' ')
                continue;

            if (getP(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getP(rpn.charAt(i)) == 0) {
                    operand += rpn.charAt(i++);
                    if (i == rpn.length()) break;
                }
                stack.push(Double.parseDouble(operand));
                operand = "";
            }

            if (getP(rpn.charAt(i)) > 1) {
                double digit_1 = stack.pop(), digit_2 = stack.pop();
                if (rpn.charAt(i) == '+') stack.push(digit_2 + digit_1);
                if (rpn.charAt(i) == '-') stack.push(digit_2 - digit_1);
                if (rpn.charAt(i) == '*') stack.push(digit_2 * digit_1);
                if (rpn.charAt(i) == '/') stack.push(digit_2 / digit_1);
            }
        }
        return stack.pop();
    }

    public static int getP(char token) {
        if(token == '*' || token == '/') return 3;
            else if(token == '+' || token == '-') return 2;
                else if(token == '(') return 1;
                    else if (token == ')') return -1;
                        else return 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        //System.out.println(expressionToReversePolishNotation(expression));
        System.out.println(rpnToAnswer(expressionToReversePolishNotation(expression)));
    }
}

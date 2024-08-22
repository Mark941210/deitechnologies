/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressionparser;

/**
 *
 * @author Mark Elias
 */
 import java.util.Scanner;


public class ExpressionParser extends GenericStack{

    /**
     * @param args the command line arguments
     */

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } 
        else if (operator == '*' || operator == '/') {
            return 2;
        } 
        else if (operator == '^') {
            return 3;
        } 
        else {
            return -1;
        }
    }

    private static int applyOperation(char operator, int b, int a) {
    if (operator == '+') {
        return a + b;
    } 
    else if (operator == '-') {
        return a - b;
    } 
    else if (operator == '*') {
        return a * b;
    } 
    else if (operator == '/') {
        if (b == 0) {
            throw new UnsupportedOperationException("Cannot divide by zero");
        }
        return a / b;
    } 
    else if (operator == '^') {
        return (int) Math.pow(a, b);
    } 
    else {
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }
}

    public static int evaluate(String expression) {
        GenericStack<Integer> numbers = new GenericStack<>();
        GenericStack<Character> operators = new GenericStack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(num);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop(); // pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();
        System.out.println("The Result is: " + evaluate(expression));
        scanner.close();
    }
}



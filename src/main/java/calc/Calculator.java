package calc;

import java.util.Scanner;

public class Calculator {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter the 1st number: ");
    	double number1 = scanner.nextDouble();
    	System.out.print("Enter the 2nd number: ");
    	double number2 = scanner.nextDouble();
        String operator = getInput("Choose the operation + - * and /: ");
 
        double result = 0;
 
        try {
            switch (operator) {
                case "+":
                    result = add(number1, number2);
                    break;
                case "-":
                    result = subtract(number1, number2);
                    break;
                case "*":
                    result = multyply(number1, number2);
                    break;
                case "/":
                    result = divide(number1, number2);
                    break;
                default:
                    System.out.println("There is no that kind of operation");
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }
 
    static double add(double d1, double d2) {
            return d1 + d2;
    }
 
    static double subtract(double d1, double d2) {
       // double d1 = Double.parseDouble(st1);
       // double d2 = Double.parseDouble(st2);
        return d1 - d2;
    }
 
    static double multyply(double d1, double d2) {
       // double d1 = Double.parseDouble(st1);
       // double d2 = Double.parseDouble(st2);
        return d1 * d2;
    }
 
    static double divide(double d1, double d2) {
        //double d1 = Double.parseDouble(st1);
       //double d2 = Double.parseDouble(st2);
        return d1 / d2;
    }
}
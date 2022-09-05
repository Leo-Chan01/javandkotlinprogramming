package coding_fundamentals.fundamentals;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        //Arithmetic operations
        int firstNumber;
        int secondNumber;
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Input the first Number: ");
        firstNumber = takeInput.nextInt();
        System.out.println("Input the second Number: ");
        secondNumber = takeInput.nextInt();

        //add the two numbers?
        int additionOfNumbers = firstNumber + secondNumber;
        //print output
        System.out.println("Result is: " + additionOfNumbers);
        takeInput.close();
    }
}

package coding_fundamentals.fundamentals;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        //Give user an instruction to input a value
        System.out.print("Hello, Please input your username: ");
        //Request user data
        //A scanner takes input in form of Charsequence
        String userName;
        Scanner takeInput = new Scanner(System.in);
        userName = takeInput.nextLine();
        //Show an output
        System.out.println("Your name is: "+ userName);

        takeInput.close();

        //A print line statement can 
    }
}

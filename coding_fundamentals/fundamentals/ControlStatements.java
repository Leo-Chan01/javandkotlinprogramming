package coding_fundamentals.fundamentals;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        //loops and the conditional statements

        //variable and objects declarations
        String nameOfUser;
        int ageOfUser;
        String occupationOfUser;
        Boolean isBlack;
        Scanner takeInput = new Scanner(System.in);

        System.out.println("WELCOME TO THE BORING  COMPANY\n\n To input your details type START, to continue type C");
        while (!(takeInput.nextLine().equals("END"))) {
            System.out.print("What is your name? ");
            nameOfUser = takeInput.nextLine();
            System.out.print("How old are you? ");
            //change a string to an integer by Integer.parseInt() function
            ageOfUser = Integer.parseInt(takeInput.nextLine());
            System.out.print("What do you do? ");
            occupationOfUser = takeInput.nextLine();
            System.out.print("Are you Black or White \n[B - Black, W - white]: ");
            isBlack =  (takeInput.nextLine().equals("B"));
            System.out.println(nameOfUser + ageOfUser + occupationOfUser + isBlack);
        }
        System.out.println("Thank you");
        //always close your scanner at the end
        takeInput.close();
    }
}

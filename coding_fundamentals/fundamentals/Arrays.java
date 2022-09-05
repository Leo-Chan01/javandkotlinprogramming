package coding_fundamentals.fundamentals;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int numberOfRows;
        int numberOfColumns;
        Scanner takeInput = new Scanner(System.in);

        //notify the user to input required data
        System.out.println("Hello welcome to the box drawer! \nInput the required"
        +" values as requested below to give proper output");

        //collect the input from the user
        System.out.print("Number of Rows: ");
        numberOfRows = takeInput.nextInt();
        System.out.print("Number of Columns: ");
        numberOfColumns = takeInput.nextInt();

        //give as output the box demanded by the user
        String[][] bigArray = new String[numberOfRows][numberOfColumns];

        for (int rowIndex = 0; rowIndex < bigArray.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < bigArray[rowIndex].length;
            columnIndex++) {
                if (columnIndex == bigArray[rowIndex].length - 1) {
                    System.out.println("*");
                }else{
                    System.out.print("*  ");
                }
            }
        }
        takeInput.close();
    }
}

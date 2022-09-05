import java.util.Scanner;

public class AssignmentCorrection {
    public static void main(String[] args) {
        /* 
         * Form collects and stores info
         * print out in tabular format
         * 
         * 
        */
        Scanner takeInput = new Scanner(System.in);
        String[][] userForm = new String[3][2];

        System.out.println("Hello give the required input \n");
        System.out.print("Input name:");
        String name = takeInput.nextLine();

        
        // userForm[0][0] = "Name: ";
        // userForm[0][1] = name; 
        System.out.print("Input email: ");
        String email = takeInput.nextLine();
        // userForm[1][0] = "Email: ";
        // userForm[1][1] = email;
        System.out.print("Input other:");
        String otherInfo = takeInput.nextLine();
        // userForm[2][0] = "Other information: ";
        // userForm[2][1] = otherInfo;

        for (int rowInput = 0; rowInput < userForm.length; rowInput++) {
            for (int columnInput = 0; columnInput < userForm[rowInput].length; columnInput++) {
                // switch (rowInput) {
                //     case 0:
                //         userForm[rowInput][0] = "Name: ";
                //         break;
                //     case 1:
                //         userForm[rowInput][0] = "Email: ";
                //         break;
                //     case 2:
                //         userForm[rowInput][0] = "Other Information: ";
                //         break;
                //     default:
                //         break;
                // }


                if (rowInput == 0 && columnInput == 0) {
                    userForm[rowInput][columnInput] = "Name: ";
                    userForm[rowInput][1] = name;
                }else if (rowInput == 1 && columnInput == 0) {
                    userForm[rowInput][columnInput] = "Email: ";
                    userForm[rowInput][1] = email;
                }else if(rowInput == 2 && columnInput == 0){
                    userForm[rowInput][columnInput] = "Other: ";
                    userForm[rowInput][1] = otherInfo;
                }
            }
        }

        for (int row = 0; row < userForm.length; row++) {
            for (int column = 0; column < userForm[row].length; column++) {
                if (column == userForm[row].length -1) {
                    System.out.println(userForm[row][column]);
                }else{
                    System.out.print(userForm[row][column]);
                }
            }
        }
        takeInput.close();
    }
}

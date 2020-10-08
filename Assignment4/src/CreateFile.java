// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

import java.io.*;
import java.util.Scanner;

class CreateFile{
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        FileWriter myOutput = null;
        try{

            scanner = new Scanner(System.in);
            myOutput = new FileWriter("command_line_input.txt");
            System.out.println("Enter @q to quit!");
            String userInput = "";
            while (!userInput.equals("@q")){
                myOutput.write(userInput);
                userInput = scanner.nextLine();
            }
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
            if (myOutput != null){
                myOutput.close();
            }

        }

    }
}

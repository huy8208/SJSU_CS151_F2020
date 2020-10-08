// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class IntToHex {
    public static void main(String[] args) throws IOException,InputMismatchException {
        Scanner scanner = null;
        OutputStreamWriter myStandardOut = null;
        try{
            int userInput;
            scanner = new Scanner(System.in);
            myStandardOut = new OutputStreamWriter(System.out);
            System.out.print("Enter an integer value: ");
            userInput = scanner.nextInt();
            myStandardOut.write(Integer.toHexString(userInput));
            myStandardOut.write("\n");
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
            if (myStandardOut != null){
                myStandardOut.close();
            }
        }
    }


}

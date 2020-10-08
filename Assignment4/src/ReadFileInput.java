// SJSU-CS151
// Assignment 4
// Duc Huy Nguyen

import java.io.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ReadFileInput {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scanner = null;
        OutputStreamWriter myStandardOut = null;

        try{
            String line = "";
            myStandardOut = new OutputStreamWriter(System.out);
            file = new File("quote.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                myStandardOut.write(line);
            }
            myStandardOut.write("\n");
        }
        finally {
            if (myStandardOut != null){
                myStandardOut.close();
            }
            if (scanner != null){
                scanner.close();
            }
        }
    }
}

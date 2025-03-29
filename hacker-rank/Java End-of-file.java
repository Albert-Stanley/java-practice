import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException{
    Scanner reader = new Scanner(System.in);
    String line;
    int lineNumber = 1;
    
    while(reader.hasNextLine()){
        line = reader.nextLine();
        System.out.println(lineNumber++ + " " + line);   
    }
    reader.close();
}
}

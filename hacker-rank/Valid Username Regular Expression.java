import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final String REGEX = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    
    
    for(int i = 0; i < n; i++ ){
        String username = sc.nextLine();
        
        System.out.println((username.matches(REGEX)) ? "Valid" : "Invalid");
        
    }
    
    sc.close();

}
}

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String str = Integer.toString(n);
        if(str.equals(Integer.toString(n))){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        
        scanner.close();
    }
}

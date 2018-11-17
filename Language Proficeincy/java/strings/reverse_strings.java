import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // Two Ways to solve.. Either String Buffer or String Builder
        // Complexity O(n)

        String B = new StringBuilder(A).reverse().toString();
        //String B = new StringBuffer(A).reverse().toString();
        if (B.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}

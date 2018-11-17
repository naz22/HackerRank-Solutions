import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String t = "";
        int n = 0;
        while(in.hasNext()){
            n++;
            t = in.nextLine();
            System.out.println(n + " "+ t);
        }
        
        in.close();
    }
}
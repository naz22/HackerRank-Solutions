import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = 0;
        for(int i = 1; i <= 10; i++){
            j = i * n;
            System.out.println(n+" x "+ i+" = "+j);
        }
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = 0;
        for(int i = 1; i <= 10; i++){
            j = i * n;
            System.out.println(n+" x "+ i+" = "+j);
        }
    }
}
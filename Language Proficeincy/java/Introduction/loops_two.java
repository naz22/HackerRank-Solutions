import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s = 0;
        int q = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            q = a + b;
          //  System.out.println(q);
            int[] result = new int[n];
             for (int j = 0, k = 1, e = a + k * b; j < n; ++j, k *= 2, e += k * b){
                 result[j] = e;
             }
            String formatter = Arrays.toString(result);
            String newStr = formatter.replaceAll("[^a-zA-Z0-9 ]+","");
            
            System.out.println(newStr);    
        }
        
        in.close();
    }
}
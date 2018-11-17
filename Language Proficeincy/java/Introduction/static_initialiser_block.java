import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean flag;
    public static int H;
    public static int B;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        flag = B > 0 && H > 0;
    
        if(!flag) System.out.println("java.lang.Exception: Breadth and height must be positive");
        in.close();
        
        public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

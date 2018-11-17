import java.io.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;

public class Solution {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    int f = 0;
    /* Enter your code here. Print output to STDOUT. */
    int C = A.length() + B.length();
    System.out.println(C);
    if (A.length() <= B.length()){
      f = A.length();
    }else if (A.length() > B.length()) {
      f = B.length();
    }

    A = A.toUpperCase();
    B = B.toUpperCase();

    if (A.equals(B) && A != null && B != null){
      System.out.println("No");
      if (A.length() != 1){
        A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
      }
      System.out.println(A + " " + B);

    }
    if (A.length() != 1){
      A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
    }
    if (B.length() !=1){
      B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
    }
    for (int i = 0; i < f; i++){
      if (A.charAt(i) != B.charAt(i)){
        if (Character.getNumericValue(A.charAt(i)) <
        Character.getNumericValue(B.charAt(i))
        ){
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }

        System.out.println(A + " " + B);
        break;
      }
      if (i + 1 == f && !A.equals(B)){
        System.out.println("No");
        System.out.println(A + " " + B);
      }
    }
  }
}

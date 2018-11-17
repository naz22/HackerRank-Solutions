import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        String delims = "[0-9  !,?._'@]+";
        List<String> tokens = new ArrayList<String>(Arrays.asList(s.split(delims)));
        // remove all null tokens
        tokens.removeAll(Collections.singleton(null));
        tokens.removeAll(Collections.singleton(""));
        //print number of tokens after removing any nulls
        System.out.println(tokens.size());
        for(int i =0; i < tokens.size(); i++){
                System.out.println(tokens.get(i));
        }

        scan.close();
    }
}

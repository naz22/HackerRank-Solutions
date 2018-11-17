import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.LocalDate;
public class Solution {
  public static String getDay(String day, String month, String year) {
    /*
    * Write your code here.
    */
    LocalDate d = LocalDate.of(Integer.valueOf(year),Integer.valueOf(month), Integer.valueOf(day));
    return String.valueOf(d.getDayOfWeek());
  }


  public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

      int month = Integer.parseInt(firstMultipleInput[0]);

      int day = Integer.parseInt(firstMultipleInput[1]);

      int year = Integer.parseInt(firstMultipleInput[2]);

      String res = Result.findDay(month, day, year);

      bufferedWriter.write(res);
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
    }
  }

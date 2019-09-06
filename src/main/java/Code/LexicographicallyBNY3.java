package Code;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'smallestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY substrings as parameter.
     */

    public static String smallestString(List<String> substrings) {
		return null;
    // Write your code here

    }

}

public class LexicographicallyBNY3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int substringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < substringsCount; i++) {
            String substringsItem = bufferedReader.readLine();
            substrings.add(substringsItem);
        }

        String result = Result.smallestString(substrings);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

package Code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class BNYOddNumbers_1 {



    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
    	
          List<Integer> list = new ArrayList<>();
          
          for(int i=l; i<=r; i++)
          {
        	  if(i%2 != 0)
        	  {
        		  list.add(i);
        	  }
          }
          return list;
    }

    public static void main(String[] args) throws IOException {
    	String path="C:\\Users\\ramaaror\\Desktop\\HackerRank_InputFiles\\test_cases_3pramr7a684_oddNumbers\\input002.txt";
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), StandardCharsets.UTF_8));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);
        
        System.out.println(res);

       /* bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}

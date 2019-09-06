package InterviewQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class NoOfWordAsc {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		ArrayList<String> list = new ArrayList<String>();
		BufferedWriter writer = null;

		try {
			File f = new File("C:\\Users\\ramaaror\\Desktop\\rama.txt");
			File f1 = new File("C:\\Users\\ramaaror\\Desktop\\rama1.txt");

			FileReader fr = new FileReader(f);
			reader = new BufferedReader(fr);

			String currentLine = reader.readLine();

			while (currentLine != null) {
				list.add(currentLine);
				currentLine = reader.readLine();
			}
			Collections.sort(list);

			writer = new BufferedWriter(new FileWriter(f1));

			for (String out : list) {
				System.out.println(out);
				writer.write(out);
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}

				if (writer != null) {
					writer.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

package done;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class NoOfWordsNotepad {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		try {
			File f = new File("C:\\Users\\ramaaror\\Desktop\\rama.txt");

			if (f.exists()) {
				FileReader fr = new FileReader(f);
				reader = new BufferedReader(fr);

				int lineCount = 0;
				int wordCount = 0;
				int charCount = 0;

				String currentLine = reader.readLine();
				System.out.println(currentLine);
				while (currentLine != null) {
					lineCount++;
					String[] word = currentLine.split(" ");
					wordCount = wordCount + word.length;

					for (String word1 : word) {
						charCount = charCount + word1.length();
					}
					currentLine = reader.readLine();
					System.out.println(currentLine);

				}
				System.out.println("No of line:" + lineCount);
				System.out.println("No of word: " + wordCount);
				System.out.println("No of character : " + charCount);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}
}

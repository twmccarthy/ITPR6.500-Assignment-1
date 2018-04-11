package main.java.nz.twm.assignment1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileHandler {
	
	public List<Character> readFile(String filename) {
		ArrayList<Character> chars = new ArrayList<Character>();
		try	{
			FileReader inFile = new FileReader(filename);
			int ch = inFile.read();
			while (ch != -1)
			{
				chars.add((char)ch);
				ch = inFile.read();
			}
			inFile.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}		
		return chars;
	}

	public void writeFile(String filename, List<Character> chars) {
		try {
			File file = new File(filename);

			FileWriter outFile = new FileWriter(file);
			for (Iterator<Character> it = chars.iterator(); it.hasNext();)
			{
				outFile.write(it.next());
			}
			outFile.close();
		} catch (IOException exc) {
			System.out.println("Error writing file: " + filename);
		}
	}
}


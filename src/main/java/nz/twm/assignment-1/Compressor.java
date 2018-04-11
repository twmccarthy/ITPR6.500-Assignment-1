package main.java.nz.twm.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Compressor {
	
	public List<Character> compress(List<Character> text) {
		ArrayList<Character> compressedResult = new ArrayList<>();
		Iterator<Character> characterIterator = text.iterator();

		if (!characterIterator.hasNext()) return null;

		char currentCharacter;
		char lastCharacter = characterIterator.next();
		int countOfSameCharactersInARow = 1;

		while (characterIterator.hasNext()) {
			currentCharacter = characterIterator.next();

			if (currentCharacter == lastCharacter) {
				countOfSameCharactersInARow++;
			} else {
				compressedResult.add(lastCharacter);
				compressedResult.add((char)countOfSameCharactersInARow);
				countOfSameCharactersInARow = 1;
			}
			lastCharacter = currentCharacter;
		}
		compressedResult.add(lastCharacter);
		compressedResult.add((char)countOfSameCharactersInARow);

		return compressedResult;
	}

	public List<Character> uncompress(List<Character> text) {
		ArrayList<Character> uncompressedResult = new ArrayList<>();

		for (int index = 0; index < text.size() - 1; index++) {
			Character character = text.get(index);
			int numberOfCharacters = text.get(++index);
			for (int count = 0; count < numberOfCharacters; count++) {
				uncompressedResult.add(character);
			}
		}
		return uncompressedResult;
	}
}
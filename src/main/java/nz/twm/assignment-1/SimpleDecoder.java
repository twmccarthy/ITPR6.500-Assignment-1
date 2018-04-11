package main.java.nz.twm.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleDecoder {
	
	public List<Character> decode(List<Character> encoded) {
		int numberOfUniqueCharacters = (int)encoded.get(0);
		ArrayList<Character> decodedResult = new ArrayList<Character>();
		HashMap<Character, Character> characterToValueMap =
						new HashMap<Character, Character>();
		
		for (int index = 1; index < numberOfUniqueCharacters + 1; index++) {
			characterToValueMap.put((char)(index - 1),
							encoded.get(index));
		}
		
		for (int index = 1 + numberOfUniqueCharacters;
						index < encoded.size();
						index++) {
			decodedResult.add(characterToValueMap
							.get(encoded.get(index)));
		}
		return decodedResult;
	}
}

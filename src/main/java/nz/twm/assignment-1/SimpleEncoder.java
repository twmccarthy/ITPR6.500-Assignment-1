package main.java.nz.twm.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SimpleEncoder {
	
	public List<Character> encode(List<Character> text) {
		// Used HashSet to remove duplicates
		HashSet<Character> uniqueCharacters =
						new HashSet<Character>(text);	
		HashMap<Character, Character> characterToValueMap = 
						new HashMap<Character, Character>();
		ArrayList<Character> encodedResult = new ArrayList<Character>();

		encodedResult.add((char)uniqueCharacters.size());
		encodedResult.addAll(uniqueCharacters);

		int valueOfCharacter = 0;
		for (Character character : uniqueCharacters) {
			characterToValueMap.put(character,
							(char)valueOfCharacter);
			valueOfCharacter++;
		}    
		for (Character character : text) {
			encodedResult.add(characterToValueMap.get(character));
		}
			
		return encodedResult;
	}
}

package main.java.nz.twm.assignment1;

import java.util.List;

public class FileActions {
	
	private FileHandler fileHandler = new FileHandler();
	private FileConverter fileConverter = new FileConverter();
			
	public void encodeAndShowFile(String fileName) {
		if (!StringUtil.hasCorrectExtension(fileName, "txt")) {
			return;
		}
		fileName = StringUtil.trimFileName(fileName) + ".txt";
		List<Character> fileCharacters = fileHandler.readFile(fileName);
		List<Character> encodedCharacters = 
						fileConverter.encodeTxtToZap(fileCharacters);
		showResult(encodedCharacters);
		saveFile(fileName, "zap", encodedCharacters);
	}
	
	public void compressAndShowFile(String fileName) {
		if (!StringUtil.hasCorrectExtension(fileName, "txt")) {
			return;
		}
		fileName = StringUtil.trimFileName(fileName) + ".txt";
		List<Character> fileCharacters = fileHandler.readFile(fileName);
		List<Character> encodedCharacters = 
						fileConverter.encodeTxtToZap(fileCharacters);
		List<Character> compressedCharacters = 
						fileConverter.compressZapToCzp(encodedCharacters); 
		showResult(compressedCharacters);
		saveFile(fileName, "czp", compressedCharacters);
	}
	
	public void decodeAndShowFile(String fileName) {
		if (!StringUtil.hasCorrectExtension(fileName, "zap")) {
			return;
		}
		fileName = StringUtil.trimFileName(fileName) + ".zap";
		List<Character> fileCharacters = fileHandler.readFile(fileName);
		List<Character> decodedCharacters = 
						fileConverter.decodeZapToTxt(fileCharacters);
		showResult(decodedCharacters);
		saveFile(fileName, "txt", decodedCharacters);
	}
	
	public void uncompressAndShowFile(String fileName) {
		if (!StringUtil.hasCorrectExtension(fileName, "czp")) {
			return;
		}
		fileName = StringUtil.trimFileName(fileName) + ".czp";
		List<Character> fileCharacters = fileHandler.readFile(fileName);
		List<Character> uncompressedCharacters = 
						fileConverter.uncompressCzpToZap(fileCharacters);
		List<Character> decodedCharacters = 
						fileConverter.decodeZapToTxt(uncompressedCharacters);
		showResult(decodedCharacters);
		saveFile(fileName, "txt", decodedCharacters);
	}
	
	public void showFile(String fileName) {
		showResult(fileHandler.readFile(fileName));
	}
	
	private void showResult(List<Character> fileAsListOfCharacters) {
		for (Character c : fileAsListOfCharacters) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	private void saveFile(String fileName,
					String extension,
					List<Character> fileAsListOfCharacters) {
		String fileNameWithExtension =
						StringUtil.trimFileName(fileName) + "." + extension;
		System.out.println("Saving file as " + fileNameWithExtension);
		fileHandler.writeFile(fileNameWithExtension, fileAsListOfCharacters);
	}
}

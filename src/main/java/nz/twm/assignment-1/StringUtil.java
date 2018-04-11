package main.java.nz.twm.assignment1;

public class StringUtil {

	public static String getExtension(String fileName) {
		int i = fileName.lastIndexOf('.');
		if (i > 0) {
			return fileName.substring(i + 1);
		}
		return "";
	}
	
	public static String trimFileName(String fileName) {
		int i = fileName.lastIndexOf('.');
		if (i > 0) {
			return fileName.substring(0, i);
		}
		return fileName;
	}
	
	public static boolean hasCorrectExtension(String fileName,
					String correctExtension) {
		String extension = getExtension(fileName);
		if (correctExtension.equals(extension) || extension.equals("")) {
			return true;
		}	
		System.out.println("File extension given: " 
						+ extension 
						+ ", needed: correctExtension");
		return false;
	}
}

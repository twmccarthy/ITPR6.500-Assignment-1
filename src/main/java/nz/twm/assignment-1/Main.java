package main.java.nz.twm.assignment1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		FileActions fileActions = new FileActions();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("example files are 'file1' -> 'file6'");
			System.out.print("1 encode |" +
							" 2 compress |" +
							" 3 decode |" +
							" 4 uncompress |" +
							" 5 show |" +
							" 6 exit : ");

			switch (scanner.nextLine()) {
				case "1":
					fileActions.encodeAndShowFile(askForFileName(scanner));
					break;
				case "2":
					fileActions.compressAndShowFile(askForFileName(scanner));
					break;
				case "3":
					fileActions.decodeAndShowFile(askForFileName(scanner));
					break;
				case "4":
					fileActions.uncompressAndShowFile(askForFileName(scanner));
					break;
				case "5":
					fileActions.showFile(askForFileName(scanner));
				case "6":
					System.exit(0);
				default:
					System.out.println("Invalid input, please try again");
			}
		}
	}

	private static String askForFileName(Scanner scanner) {
		System.out.print("Please enter the file name: ");
		return scanner.nextLine();
	}
}

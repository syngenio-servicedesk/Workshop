package de.syngenio.lib.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterReader {

	public static Integer readIntegerFromConsole(){
		return readIntegerFromConsole("Ihre Wahl: ");
	}

	public static Integer readIntegerFromConsole(String promt){
		return Integer.valueOf(readString(promt));
	}
	
	public static String readString(String prompt){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print(prompt);
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

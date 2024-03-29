package de.syngenio.lib.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterReader {

	public static Integer readIntegerFromConsole(){
		return readIntegerFromConsole("Ihre Wahl: ");
	}

	public static Integer readIntegerFromConsole(String promt){
		try {
			return Integer.valueOf(readString(promt));
		} catch (Throwable t) {
			return -1;
		}
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
	
	public static Long readLongFromConsole(){
		return Long.valueOf(readString("Ihre Wahl: "));
	}
}

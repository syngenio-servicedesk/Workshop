package de.syngenio.lib.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterReader {

	public static Integer readIntegerFromConsole(){
		return Integer.valueOf(readString("Ihre Wahl: "));
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

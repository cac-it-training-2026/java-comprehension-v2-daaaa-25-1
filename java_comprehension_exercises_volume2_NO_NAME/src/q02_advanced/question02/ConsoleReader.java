package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	// 17 文字列入力
	public static String inputString() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	// 18 数値入力
	public static int inputNumber() {
		try {
			return Integer.parseInt(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
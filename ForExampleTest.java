package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForExampleTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader jk = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int number = Integer.parseInt(jk.readLine());

		for (int number1 = 1; number1 <= 10; number1++) {
			System.out.println(number1 * number);

		}
	}

}

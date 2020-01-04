package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Do_WhileLoops {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader js = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int number = Integer.parseInt(js.readLine());
		int number1 = 2;
		do {
			System.out.println(number1);
			number1++;

		} while (number1 < 100);

	}

}

package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Do_WhileLoopsTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader ss = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int num = Integer.parseInt(ss.readLine());
		int num1 = 1;
		do {
			System.out.println(num1 * num);
			num1++;
		} while (num1 <= 10);
	}

}

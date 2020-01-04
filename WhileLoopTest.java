package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoopTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader gh = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int num = Integer.parseInt(gh.readLine());
		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num * num1);
			num1++;
		}
	}

}

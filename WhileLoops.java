package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoops {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int a = Integer.parseInt(br.readLine());
		int a1 = 1;
		while (a1 < 100) {
			System.out.println(a1);
			a1++;
		}
	}

}

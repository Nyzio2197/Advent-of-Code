package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int sum = 0;
		File input = new File("/home/apcomputer15/eclipse-workspace/Advent of Code/bin/input_files/module mass amounts");
		Scanner scanner = new Scanner(input);
		while(scanner.hasNextLine()) {
			int temp = scanner.nextInt() / 3 - 2;
			while(temp > 0) {
				sum += temp;
				temp = temp /3 - 2;
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}

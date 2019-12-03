package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) throws FileNotFoundException {
		int sum = 0;
		File input = new File("/home/apcomputer15/eclipse-workspace/Advent of Code/bin/input_files/module mass amounts");
		Scanner scanner = new Scanner(input);
		while(scanner.hasNextLine()) {
			sum += scanner.nextInt() / 3 - 2;
		}
		System.out.println(sum);
		scanner.close();
	}

}
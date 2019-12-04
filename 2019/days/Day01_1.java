// Alan Xiao
// github.com/alandaboi
// started on: December 3, 2019
// finished on: December 3, 2019

package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day01_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// get input from file and initialize int 'sum'
		int sum = 0;
		File input = new File("/home/apcomputer15/eclipse-workspace/Advent of Code/bin/input_files/Day 01 inputs");
		Scanner scanner = new Scanner(input);
		// while loop to compute fuel
		while(scanner.hasNextLine()) {
			sum += scanner.nextInt() / 3 - 2;
		}
		// print output
		System.out.println(sum);
		scanner.close();
	}

}
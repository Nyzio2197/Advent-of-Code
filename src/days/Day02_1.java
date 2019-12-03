// Alan Xiao
// github.com/alandaboi
// started on: December 3rd, 2019
// finished on: December 3rd, 2019

package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// get input from file
		File input = new File("/home/apcomputer15/eclipse-workspace/Advent of Code/bin/input_files/Day 02 inputs");
		Scanner scanner = new Scanner(input);
		// put input into temporary ArrayList, as length is not determined yet
		ArrayList<Integer> temp = new ArrayList<>();
		while(scanner.hasNext(",")) {
			temp.add(Integer.parseInt(scanner.next(",")));
		}
		temp.add(Integer.parseInt(scanner.next()));
		// transfer ArrayList into int Array
		int[] array = new int[temp.size()];
		for(int x = 0; x < array.length; x++) {
			array[x] = temp.get(x);
		}
		
		
	}
	
}

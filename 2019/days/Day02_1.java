// Alan Xiao
// github.com/alandaboi
// started on: December 3rd, 2019
// finished on: 

package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day02_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// get input from file
		File input = new File("/home/apcomputer15/eclipse-workspace/Advent of Code/bin/input_files/Day 02 inputs");
		Scanner scanner = new Scanner(input);
		// input as String array
		String[] temp = scanner.nextLine().split(",");
		scanner.close();
		// convert String to int array
		int[] array = new int[temp.length];
		for(int location = 0; location < temp.length; location++) {
			array[location] = Integer.parseInt(temp[location]);
		}
		// starting inputs
		array[1] = 12; array[2] = 2;
		// start code
		for(int position = 0; position < array.length; position += 4) {
			// if "opcode" is 1, sum
			if(array[position] == 1) {
				array[array[position + 3]] = array[array[position + 1]] + array[array[position + 2]];
			} 
			// if "opcode" is 2, product
			else if(array[position] == 2) {
				array[array[position + 3]] = array[array[position + 1]] * array[array[position + 2]];
			} 
			// if "opcode" is 99, end
			else if(array[position] == 99) {
				break;
			}
		}
		// print final answer, number at array[0]
		System.out.println(array[0]);
	}
	
}

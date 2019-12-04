// Alan Xiao
// github.com/alandaboi
// started on: December 4, 2019
// finished on: December X, 2019

package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day02_2 {
	
	private static int noun = 1, verb = 1;
	private static int[] array;

	public static void main(String[] args) throws FileNotFoundException {
		// get input from file
		File input = new File("/home/apcomputer15/eclipse-workspace/Advent of Code/bin/input_files/Day 02 inputs");
		Scanner scanner = new Scanner(input);
		// input as String array
		String[] temp = scanner.nextLine().split(",");
		scanner.close();
		// convert String to int array
		array = new int[temp.length];
		for(int location = 0; location < temp.length; location++) {
			array[location] = Integer.parseInt(temp[location]);
		}
		// for loop running through possibilities
		for(noun = 1; noun < 100; noun++) {
			boolean ifBreak = false;
			for(verb = 1; verb < 100; verb++) {
				// starting inputs
				array[1] = noun; array[2] = verb;
				// start code
				for(int position = 0; position < array.length; position += 4) {
					// if "opcode" is 1, sum
					if(array[position] == 1) {
						array[fixArrayIndexOutOfBounds(array[position + 3])] = array[fixArrayIndexOutOfBounds(array[position + 1])] + array[fixArrayIndexOutOfBounds(array[position + 2])];
					} 
					// if "opcode" is 2, product
					else if(array[position] == 2) {
						array[fixArrayIndexOutOfBounds(array[position + 3])] = array[fixArrayIndexOutOfBounds(array[position + 1])] * array[fixArrayIndexOutOfBounds(array[position + 2])];
					} 
					// if "opcode" is 99, end
					else if(array[position] == 99) {
						break;
					}
				}
				// check for 19690720
				if(array[0] == 19690720) {
					ifBreak = true;
					break;
				}
			}
			if(ifBreak) {
				break;
			}
		}
		
		// print final answer, 100 * noun + verb
		System.out.println(100 * noun + verb);
	}
	
	private static int fixArrayIndexOutOfBounds(int i) {
		return i > array.length  - 1? array.length  - 1: i;
	}
	
}

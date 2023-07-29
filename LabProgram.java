package LabProgram407;

import java.util.Scanner;

public class LabProgram {
	public static Pair<Integer> readIntegerPair(Scanner scnr) {
		/* Type your code here. */
		return new Pair(scnr.nextInt(), scnr.nextInt());
	}

	public static Pair<Double> readDoublePair(Scanner scnr) {
		/* Type your code here. */
		return new Pair(scnr.nextDouble(), scnr.nextDouble());
	}

	public static Pair<String> readWordPair(Scanner scnr) {
		/* Type your code here. */
		return new Pair(scnr.next(), scnr.next());
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Pair<Integer> integerPair1 = readIntegerPair(scnr);
		Pair<Integer> integerPair2 = readIntegerPair(scnr);

		Pair<Double> doublePair1 = readDoublePair(scnr);
		Pair<Double> doublePair2 = readDoublePair(scnr);

		Pair<String> wordPair1 = readWordPair(scnr);
		Pair<String> wordPair2 = readWordPair(scnr);

		/* Type the code for output here. */
		
		System.out.print(integerPair1 + " "); 
		System.out.print(integerPair1.comparisonSymbol(integerPair2));
		System.out.print(" " + integerPair2);
		System.out.println();
		
		System.out.print(doublePair1 + " ");
		System.out.print(doublePair1.comparisonSymbol(doublePair2));
		System.out.print(" " + doublePair2);
		System.out.println();
		
		System.out.print(wordPair1 + " ");
		System.out.print(wordPair1.comparisonSymbol(wordPair2));
		System.out.print(" " + wordPair2);
		System.out.println();
	}
}

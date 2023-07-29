package LabProgram407;

public class Pair<TheType extends Comparable<TheType>> {
	private TheType firstVal;
	private TheType secondVal;

	/* Type the code for The constructor here. */
	public Pair(TheType aVal, TheType bVal) {
		firstVal = aVal;
		secondVal = bVal;
	}

	public String toString() {
		/* Type your code here. */
		return "[" + firstVal + ", " + secondVal + "]";
	}

	// Implement Comparable's expected compareTo()
	public int compareTo(Pair<TheType> otherPair) {
		/*
		 * Return -1, 0, or 1 according to whether the Pair is less than, equal to, or
		 * greater than otherPair Precedence of comparisons: firstVal, then secondVal
		 */
		/* Type your code here. */
		 if( (this.firstVal.compareTo(otherPair.firstVal) > 0)
				 && (this.secondVal.compareTo(otherPair.secondVal) > 0))
			 return 1;
		 if( (this.firstVal.compareTo(otherPair.firstVal) < 0 )
				 && (this.secondVal.compareTo(otherPair.secondVal) < 0))
			 return -1;
		 else return 0;
	}

	// Return '<', '=', or '>' according to the ordering of this pair and otherPair
	public char comparisonSymbol(Pair<TheType> otherPair) {
		/* Type your code here. */
		
		if (this.firstVal.compareTo(otherPair.firstVal) > 0)
			return '>';
		if (this.firstVal.compareTo(otherPair.firstVal) < 0)
			return '<';
		if (this.secondVal.compareTo(otherPair.secondVal) > 0)
			return '>';
		if (this.secondVal.compareTo(otherPair.secondVal) < 0)
			return '<';
		else return '=';
	}
}

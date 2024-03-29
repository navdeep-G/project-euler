package euler;

/**
 * Problem2:
 * 	Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public final class Problem2 implements EulerInterface {
	
	public static void main(String[] args) {
		System.out.println(new Problem2().run());
	}

	/* 
	 * The Fibonacci sequence grows exponentially by a factor of 1.618, the sum is
	 * bounded above by a small multiple of 4 million.
	 */
	public String run() {
		int sum = 0;
		int x = 1;  // Represents the current Fibonacci number being processed
		int y = 2;  // Represents the next Fibonacci number in the sequence
		while (x <= 4000000) {
			if (x % 2 == 0)
				sum += x;
			int z = x + y;
			x = y;
			y = z;
		}
		return Integer.toString(sum);
	}
	
}

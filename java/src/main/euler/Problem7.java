package euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public final class Problem7 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new Problem7().run());
	}
	
	
	/* 
	 * Test each number individually for primeness
	 */
	public String run() {
		for (int i = 2, count = 0; ; i++) {
			if (Util.isPrime(i)) {
				count++;
				if (count == 10001)
					return Integer.toString(i);
			}
		}
	}
	
}

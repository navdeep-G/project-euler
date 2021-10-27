package euler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public final class Problem10 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new Problem10().run());
	}
	
	
	/* 
	 * Call the sieve of Eratosthenes and sum the primes found.
	 * A conservative upper bound for the sum is 2000000^2, which fits in a Java long type.
	 */
	private static final int LIMIT = 2000000;
	
	public String run() {
		long sum = 0;
		for (int p : Util.listPrimes(LIMIT - 1))
			sum += p;
		return Long.toString(sum);
	}
	
}

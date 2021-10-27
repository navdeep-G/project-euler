package euler;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public final class Problem9 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new Problem9().run());
	}
	
	
	/* 
	 * Brute-force search to directly solve the problem.
	 * Note that a^2 + b^2 is bounded above by 2*(1000^2), which fits in a Java int type.
	 */
	private static final int PERIMETER = 1000;
	
	public String run() {
		for (int a = 1; a < PERIMETER; a++) {
			for (int b = a + 1; b < PERIMETER; b++) {
				int c = PERIMETER - a - b;
				if (a * a + b * b == c * c) {
					// It is now implied that b < c, because we have a > 0
					return Integer.toString(a * b * c);
				}
			}
		}
		throw new AssertionError("Not found");
	}
	
}

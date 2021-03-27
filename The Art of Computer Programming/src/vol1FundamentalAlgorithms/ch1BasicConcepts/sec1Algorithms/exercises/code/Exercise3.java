package vol1FundamentalAlgorithms.ch1BasicConcepts.sec1Algorithms.exercises.code;

public class Exercise3 {
	/*
	 * Algorithm F
	 * 
	 * Euclid's Algorithm, improved!
	 *   *Not actually improved. Speed is about the same, possibly slower
	 * 
	 * Given two positive integers m and n, find their greatest common divisor,
	 * that is, the largest positive integer that evenly divides both m and n
	 * 
	 * This time, we'll swap M and N by doing both versions in the same loop
	 * 
	 * imagine C is the GCD, A is an arbitrary number, and B is a number less
	 * than A that's also relatively prime to A
	 * 
	 * We are given A*C and B*C, and we want to find the GCD (which is always
	 * C)
	 * 
	 * Then, (A-B)*C also has the same GCD
	 * 
	 * By repeatedly subtracting B while keeping A positive, we can see that
	 * (A%B)*C also has the same GCD.
	 * 
	 * And similarly, (B%(A%B))*C has the same GCD, and so on.
	 * 
	 */
	
	public static void main(String[] args) {
		long runTime = -System.nanoTime();

		int imax = 10000;
		int jmax = 10000;
		for(int i = 1; i < imax; i++) {
			for(int j = 1; j < jmax; j++) {
				euclidsAlgorithm(i,j);
			}
		}

		runTime += System.nanoTime();
		System.out.println("\n\nRuntime: " + runTime/(double)(imax*jmax*1000000000L) + " seconds");
	}
	
	public static int euclidsAlgorithm(int m, int n) {
		while(true) {
			m = m%n;
			
			if(m==0) return n;
			
			n = n%m;
			
			if(n==0) return m;
		}
	}
}

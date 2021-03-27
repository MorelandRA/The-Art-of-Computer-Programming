package vol1FundamentalAlgorithms.ch1BasicConcepts.sec1Algorithms.algorithms;

public class AlgorithmE {
	
	/*
	 * Algorithm E
	 * 
	 * Euclid's Algorithm
	 * 
	 * Given two positive integers m and n, find their greatest common divisor,
	 * that is, the largest positive integer that evenly divides both m and n
	 * 
	 * Page 2
	 * 
	 */
	
	public static void main(String[] args) {
		long runTime = -System.nanoTime();

		for(int i = 1; i < 10000; i++) {
			for(int j = 1; j < 10000; j++) {
				euclidsAlgorithm(i,j);
			}
		}

		runTime += System.nanoTime();
		System.out.println("\n\nRuntime: " + runTime/1000000000. + " seconds");
	}
	
	public static int euclidsAlgorithm(int m, int n) {
		while(true) {
			//[Find remainder]
			int r = m%n;
			
			//[Is it zero?]
			if(r==0) return n;
			
			//[Reduce]
			m=n;
			n=r;
		}
	}

}

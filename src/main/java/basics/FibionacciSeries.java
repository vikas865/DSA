package basics;

public class FibionacciSeries {
	

	    static final int MOD = 1000000007;

	    // Helper method to multiply two matrices
	    static long[][] multiply(long[][] A, long[][] B) {
	        long[][] C = new long[2][2];
	        C[0][0] = (A[0][0] * B[0][0] + A[0][1] * B[1][0]) % MOD;
	        C[0][1] = (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % MOD;
	        C[1][0] = (A[1][0] * B[0][0] + A[1][1] * B[1][0]) % MOD;
	        C[1][1] = (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % MOD;
	        return C;
	    }

	    // Helper method to calculate power of a matrix
	    static long[][] power(long[][] A, long n) {
	        if (n == 1)
	            return A;
	        long[][] half = power(A, n / 2);
	        long[][] result = multiply(half, half);
	        if (n % 2 == 1)
	            result = multiply(result, A);
	        return result;
	    }

	    // Method to find nth Fibonacci number
	    static long nthFibonacci(long n) {
	        if (n <= 1)
	            return n;
	        long[][] F = {{1, 1}, {1, 0}};
	        F = power(F, n - 1);
	        return F[0][0];
	    }

	    public static void main(String args[]) {
	        int n = 5; // Example: Find the 10th Fibonacci number
	        long result = nthFibonacci(n) % MOD;
	        System.out.println("The " + n + "th Fibonacci number is: " + result);
	    }
	}




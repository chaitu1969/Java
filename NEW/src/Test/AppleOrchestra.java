package Test;

public class AppleOrchestra {
		  // Finds the greatest common divisor (GCD) of two numbers.
		  public static int gcd(int a, int b) {
		    if (b == 0) {
		      return a;
		    } else {
		      return gcd(b, a % b);
		    }
		  }

		  // Finds the maximum number of apples Allie can fetch from the orchard.
		  public static int findMaxApples(int input1, int[] input2) {
		    int maxApples = 0;

		    // Iterate through each possible segment of trees.
		    for (int i = 0; i < input1; i++) {
		      for (int j = i + 1; j <= input1; j++) {
		        // Calculate the GCD of the segment.
		        int gcd = input2[i];
		        for (int k = i + 1; k < j; k++) {
		          gcd = gcd(gcd, input2[k]);
		        }

		        // Calculate the maximum number of apples that can be collected from the segment.
		        int maxApplesInSegment = gcd * (j - i);

		        // Update the maximum number of apples across all segments.
		        maxApples = Math.max(maxApples, maxApplesInSegment);
		      }
		    }

		    return maxApples;
		  }

		  public static void main(String[] args) {
		    int input1 = 3;
		    int[] input2 = {80, 38, 82};

		    int maxApples = findMaxApples(input1, input2);
		    
		    System.out.println("The Maximum apples "+maxApples);

//		    System.out.print("Maximum Apples", maxApples);
		  }


	

}


/**
 * Binary search: Iterative
 */

public class binarySearch {
    public int binarySearch(final int input[], int value) {
        int lowIndex = 0;
	int highIndex = input.length - 1;
	int midIndex;
	while (lowIndex <= highIndex) {
	    midIndex = lowIndex + ((highIndex-lowIndex) / 2);
	    if (input[midIndex] == value) {
	        return midIndex;
	    } else if (input[midIndex] < value) {
	        lowIndex = midIndex + 1;
	    } else {
	        highIndex = midIndex -1 ;
	    }
	}

        return -1
    }

    public static void main(String args[]) {
        
    }

}

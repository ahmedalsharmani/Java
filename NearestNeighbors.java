// Name:   Ahmed Alsharmani
// Branch: AIML, B3
// Batch:  2022-26
// BRN :   22070126137 


public class NearestNeighbors {
    public static int findNearest(int[] arr) {

        // Step 1: Check if the array is null or has less than 2 elements
        if (arr == null || arr.length < 2)
            throw new IllegalArgumentException("Array length must be at least 2");

        int minDistance = Integer.MAX_VALUE;
        int minIndex = 0;

        // Step 2: Find the pair of neighboring numbers with the smallest distance
        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        // Step 3: Return the index of the first number in the pair
        return minIndex;
    }
}

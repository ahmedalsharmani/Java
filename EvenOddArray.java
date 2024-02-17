// Name:   Ahmed Alsharmani
// Branch: AIML, B3
// Batch:  2022-26
// BRN :   22070126137 


import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting the size of the array from the user
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();

            int[] numbers = new int[size];
            int[] even;
            int[] odd;

            int evenCount = 0;
            int oddCount = 0;

            // Accepting numbers from the user and categorizing them into even and odd arrays
            for (int i = 0; i < size; i++) {
                System.out.println("Enter number " + (i + 1) + ":");
                numbers[i] = scanner.nextInt();
                if (numbers[i] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }

            // Initializing even and odd arrays based on the counts of even and odd numbers
            even = new int[evenCount];
            odd = new int[oddCount];

            evenCount = 0;
            oddCount = 0;

            // Moving numbers to their respective even and odd arrays
            for (int i = 0; i < size; i++) {
                if (numbers[i] % 2 == 0)
                    even[evenCount++] = numbers[i];
                else
                    odd[oddCount++] = numbers[i];
            }

            // Displaying even and odd numbers
            System.out.println("Even numbers:");
            for (int num : even)
                System.out.print(num + " ");
            System.out.println();

            System.out.println("Odd numbers:");
            for (int num : odd)
                System.out.print(num + " ");
            System.out.println();
        } finally {
            scanner.close(); // Closing the scanner in a finally block to ensure it's always closed
        }
    }
}

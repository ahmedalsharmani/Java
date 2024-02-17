// Name:   Ahmed Alsharmani
// Branch: AIML, B3
// Batch:  2022-26
// BRN :   22070126137 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversion {
    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3, 4, 5 };

        // Step 1: Convert array to ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList: " + list);

        // Step 2: Convert ArrayList back to array
        Integer[] newArr = list.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(newArr));
    }
}

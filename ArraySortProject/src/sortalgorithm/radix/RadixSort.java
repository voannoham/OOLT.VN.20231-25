package sortalgorithm.radix;

import sortalgorithm.SortAlgorithm;

import java.util.Arrays;

public class RadixSort extends SortAlgorithm {
    public RadixSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        radixSort(array);
    }

    private void radixSort(int[] arr) {
        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp, exp > max / 10); // Pass a boolean indicating whether it's the last step
        }
    }

    private int getMax(int[] arr) {
        if (arr.length == 0) {
            // Handle the case of an empty array
            return 0; // You can choose an appropriate default value
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private void countingSort(int[] arr, int exp, boolean isLastStep) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Step 1: Counting occurrences
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        System.out.println("Count array after counting (exp=" + exp + "): " + Arrays.toString(count));

        // Step 2: Updating count to get actual positions
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("Count array after updating (exp=" + exp + "): " + Arrays.toString(count));

        // Step 3: Building the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.out.println("Output array after arranging (exp=" + exp + "): " + Arrays.toString(output));

        // Step 4: Copying the output array back to the original array
        System.arraycopy(output, 0, arr, 0, n);

        // Step 5: Display the array after each step only if it's the last step
        if (isLastStep) {
            displayArray(arr);
            System.out.println(); // Add a new line for better separation
        }
    }

    private void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public SortAlgorithm newInstance(int[] newArray) {
        return new RadixSort(newArray);
    }
}

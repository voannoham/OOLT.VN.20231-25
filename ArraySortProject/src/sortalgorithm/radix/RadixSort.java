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
            countingSort(arr, exp);
        }
    }

    private int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Step 1: Counting occurrences
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        System.out.println("Count array after counting: " + Arrays.toString(count));

        // Step 2: Updating count to get actual positions
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        System.out.println("Count array after updating: " + Arrays.toString(count));

        // Step 3: Building the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.out.println("Output array after arranging: " + Arrays.toString(output));

        // Step 4: Copying the output array back to the original array
        System.arraycopy(output, 0, arr, 0, n);

        // Step 5: Display the array after each step
        displaySteps();
    }

    @Override
    public SortAlgorithm newInstance(int[] newArray) {
        return new RadixSort(newArray);
    }
}

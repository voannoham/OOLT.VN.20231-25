package sortalgorithm.counting;

import sortalgorithm.SortAlgorithm;

public class CountingSort extends SortAlgorithm {
    public CountingSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        countingSort(array);
    }

    private void countingSort(int[] arr) {
        int n = arr.length;
        int max = getMax(arr);

        int[] count = new int[max + 1];
        int[] output = new int[n];

        // Bước 1: Đếm số lần xuất hiện của mỗi phần tử
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Hiển thị thông tin chi tiết sau mỗi bước
        System.out.println("Initial count:");
        displayCount(count);

        // Bước 2: Chuyển đổi count[i] để nó chứa vị trí thực sự của phần tử này trong
        // đầu ra
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Hiển thị thông tin chi tiết sau mỗi bước
        System.out.println("After modifying count:");
        displayCount(count);

        // Bước 3: Xây dựng mảng đầu ra
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;

            // Hiển thị mảng sau mỗi bước
            displayArray(output);
        }

        // Bước 4: Sao chép mảng đầu ra vào mảng chính arr[]
        System.arraycopy(output, 0, arr, 0, n);

        // Hiển thị mảng cuối cùng
        displayArray(arr);
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

    private void displayCount(int[] count) {
        for (int i = 0; i < count.length; i++) {
            System.out.println("Count of " + i + ": " + count[i]);
        }
    }

    private void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public SortAlgorithm newInstance(int[] newArray) {
        return new CountingSort(newArray);
    }
}

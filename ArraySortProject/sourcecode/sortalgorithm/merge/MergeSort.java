package sortalgorithm.merge;

import sortalgorithm.SortAlgorithm;
import java.util.Arrays;

public class MergeSort extends SortAlgorithm {
    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        // Triển khai thuật toán Merge Sort
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Tìm điểm giữa mảng
            int middle = left + (right - left) / 2;

            // Gọi đệ quy cho nửa bên trái và nửa bên phải
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Hợp nhất hai nửa đã sắp xếp
            merge(array, left, middle, right);
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Tạo các mảng tạm
        int[] leftArray = Arrays.copyOfRange(array, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(array, middle + 1, middle + 1 + n2);

        // Hợp nhất các mảng tạm lại
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Sao chép phần còn lại của leftArray (nếu có)
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Sao chép phần còn lại của rightArray (nếu có)
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

        // Hiển thị mảng sau mỗi bước
        displaySteps();
    }
    @Override
    public SortAlgorithm newInstance(int[] newArray) {
        return new MergeSort(newArray);
    }
}

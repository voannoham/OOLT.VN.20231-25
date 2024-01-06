package sortalgorithm;


import java.util.Arrays;

public abstract class SortAlgorithm {
    protected int[] array;

    public SortAlgorithm(int[] array) {
        this.array = array;
    }

    public abstract void sort();

    public void setArray(int[] newArray) {
        this.array = newArray;
    }

    public void displaySteps() {
        System.out.println(Arrays.toString(array));
    }

    // Thêm phương thức newInstance để tạo một thể hiện mới của SortAlgorithm với mảng mới
    public abstract SortAlgorithm newInstance(int[] newArray);
}
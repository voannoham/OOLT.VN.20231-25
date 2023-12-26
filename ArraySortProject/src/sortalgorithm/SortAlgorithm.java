package sortalgorithm;


import java.util.Arrays;

public abstract class SortAlgorithm {
    protected int[] array;

    public SortAlgorithm(int[] array) {
        this.array = array;
    }

    public abstract void sort();

    public void displaySteps() {
        System.out.println(Arrays.toString(array));
    }
}
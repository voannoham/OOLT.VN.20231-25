package view;

import java.util.Scanner;
import sortalgorithm.merge.MergeSort;
import sortalgorithm.demo.SortingDemoInterface;
import sortalgorithm.counting.CountingSort;
import sortalgorithm.radix.RadixSort;
public class MainMenu {
    public void display() {
        System.out.println("----- Sorting Algorithm Demo -----");
        System.out.println("1. Merge Sort");
        System.out.println("2. Counting Sort");
        System.out.println("3. Radix Sort");
        System.out.println("4. Help");
        System.out.println("5. Quit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int[] array1 = {};
                MergeSort mergeSort = new MergeSort(array1);
                SortingDemoInterface mergeSortInterface = new SortingDemoInterface(mergeSort);
                mergeSortInterface.display();
                break;
            case 2:
                int[] array2 = {};
                CountingSort countingSort = new CountingSort(array2);
                SortingDemoInterface countingSortInterface = new SortingDemoInterface(countingSort);
                countingSortInterface.display();
            case 3:
                int[] array3 ={};
                RadixSort radixSort = new RadixSort(array3);
                SortingDemoInterface radixSortInterface= new SortingDemoInterface(radixSort);
                radixSortInterface.display();
            case 4:
                display();
                break;
            case 5:
                System.out.println("Are you sure you want to quit? (Y/N)");
                String confirm = scanner.next();
                if (confirm.equalsIgnoreCase("Y")) {
                    System.exit(0);
                } else {
                    display();
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                display();
                break;
        }

        scanner.close();
    }
}


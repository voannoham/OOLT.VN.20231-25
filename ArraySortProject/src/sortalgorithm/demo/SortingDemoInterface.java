package sortalgorithm.demo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import sortalgorithm.SortAlgorithm;
import view.MainMenu;

public class SortingDemoInterface {
    private SortAlgorithm sortAlgorithm;
    private Scanner scanner;

    public SortingDemoInterface(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        System.out.println("----- Sorting Algorithm Demo -----");
        System.out.println("1. Create Array");
        System.out.println("2. Start Sorting");
        System.out.println("3. Back");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Tạo mảng (ngẫu nhiên hoặc nhập từ người dùng)
                createArray();
                break;
            case 2:
                sortAlgorithm.sort();
                sortAlgorithm.displaySteps();
                display();
                break;
            case 3:
                MainMenu mainMenu = new MainMenu();
                mainMenu.display();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                display();
                break;
        }
    }

    private void createArray() {
        System.out.println("Choose array creation method:");
        System.out.println("1. Random Array");
        System.out.println("2. Input Array From User");

        int creationChoice = scanner.nextInt();

        switch (creationChoice) {
            case 1:
                createRandomArray();
                break;
            case 2:
                inputArrayFromUser();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                createArray();
                break;
        }
    }

    private void createRandomArray() {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Số ngẫu nhiên từ 0 đến 99 (điều chỉnh theo nhu cầu)
        }

        System.out.println("Random Array created: " + Arrays.toString(array));
        sortAlgorithm = sortAlgorithm.newInstance(array); // Cập nhật mảng trong thuật toán sắp xếp

        display();
    }

    private void inputArrayFromUser() {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array entered by the user: " + Arrays.toString(array));
        sortAlgorithm = sortAlgorithm.newInstance(array); // Cập nhật mảng trong thuật toán sắp xếp

        display();
    }
}

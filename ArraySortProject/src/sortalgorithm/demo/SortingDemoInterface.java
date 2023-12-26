package sortalgorithm.demo;
import java.util.Scanner;
import sortalgorithm.SortAlgorithm;
import sortalgorithm.MainMenu;
public class SortingDemoInterface {
    private SortAlgorithm sortAlgorithm;

    public SortingDemoInterface(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void display() {
        System.out.println("----- Sorting Algorithm Demo -----");
        System.out.println("1. Create Array");
        System.out.println("2. Start Sorting");
        System.out.println("3. Back");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
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
}

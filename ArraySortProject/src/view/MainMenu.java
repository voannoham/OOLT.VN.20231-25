package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.CountingSortListener;
import controller.ExitListener;
import controller.HelpListener;
import controller.MergeSortListener;
import controller.RadixSortListener;

public class MainMenu extends JFrame{
    JButton mergeSort;
    JButton countingSort;
    JButton radixSort;
    JButton help;
    JButton quit;
    //constructor
    public MainMenu(){
        this.init();
    }
    public void init(){
        //set MainMenu frame
        this.setTitle("Sorting Visualizer");
        this.setSize(1000,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //create button
        mergeSort = new JButton("MERGE SORT");
        countingSort = new JButton("COUNTING SORT");
        radixSort = new JButton("RADIX SORT");
        help = new JButton("HELP");
        quit = new JButton("QUIT");
        
        //even when click button
        ActionListener exitListener = new ExitListener();
        quit.addActionListener(exitListener);
        ActionListener helpListener = new HelpListener();
        help.addActionListener(helpListener);
        ActionListener mergeSortListener = new MergeSortListener();
        mergeSort.addActionListener(mergeSortListener);

        
        // add radix sort listener
        ActionListener radixSortListener = new RadixSortListener();
        radixSort.addActionListener(radixSortListener);
        

        ActionListener countingSortListener = new CountingSortListener();
        countingSort.addActionListener(countingSortListener);


        JPanel panel = new JPanel();

        panel.add(mergeSort);
        panel.add(countingSort);
        panel.add(radixSort);
        panel.add(help);
        panel.add(quit);
        
        this.setLayout(new BorderLayout());
        this.add(panel,BorderLayout.CENTER);
        
    }
}

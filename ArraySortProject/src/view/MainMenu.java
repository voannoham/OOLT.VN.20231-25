package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ExitListener;
import controller.HelpListener;
import controller.MergeSortListener;

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
        this.setTitle("sorting visualizer");
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //create button
        mergeSort = new JButton("merge sort");
        countingSort = new JButton("counting sort");
        radixSort = new JButton("radix sort");
        help = new JButton("help");
        quit = new JButton("quit");
        
        //even when click button
        ActionListener exitListener = new ExitListener();
        quit.addActionListener(exitListener);
        ActionListener helpListener = new HelpListener();
        help.addActionListener(helpListener);
        ActionListener mergeSortListener = new MergeSortListener();
        mergeSort.addActionListener(mergeSortListener);

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

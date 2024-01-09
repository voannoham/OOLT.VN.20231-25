package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.BackListener;
import controller.RandomListener;
import sortalgorithm.SortAlgorithm;

public abstract class SortScreen extends JFrame{
    JButton back;
    JButton start;
    JButton random;
    JButton input;
    boolean isRunning;
   
    SortAlgorithm sortingAlgorithm;
    //constructor
    public SortScreen(SortAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
        init();
    }
    public void init(){
        this.setTitle("sorting visualizer");
        this.setSize(1000,700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

    
        //start = new JButton("start");
        back = new JButton("back");
        random = new JButton("random");
        input = new JButton("input");
        
        ActionListener backActionListener = new BackListener();
        back.addActionListener(backActionListener);
        

        JPanel panel1 = new JPanel();
        panel1.setSize(1000,50);
        
        
        panel1.add(random);
        panel1.add(input);
        //panel1.add(start);
        panel1.add(back);

        ActionListener randomListener = new RandomListener(sortingAlgorithm);
        random.addActionListener(randomListener);
        
        this.setLayout(new BorderLayout());
        this.add(panel1,BorderLayout.NORTH);
        
        //this.add(drawArray());

        
    }
    
    
    
}

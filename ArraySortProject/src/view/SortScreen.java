package view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.BackListener;
import controller.RandomListener;
import controller.StartListener;
import model.sorting.SortingAlgorithm;

public abstract class SortScreen extends JFrame{
    JButton back;
    JButton start;
    JButton random;
    JButton input;
    int [] array;
    SortingAlgorithm sortingAlgorithm;
    //constructor
    public SortScreen(){
        init();
    }
    public void init(){
        this.setTitle("sorting visualizer");
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

    
        start = new JButton("start");
        back = new JButton("back");
        random = new JButton("random");
        input = new JButton("input");
        
        ActionListener backActionListener = new BackListener();
        back.addActionListener(backActionListener);
        

        JPanel panel1 = new JPanel();
        panel1.setSize(400,50);
        
        
        panel1.add(random);
        panel1.add(input);
        panel1.add(start);
        panel1.add(back);

        ActionListener randomListener = new RandomListener();
        random.addActionListener(randomListener);
        
        ActionListener startListener = new StartListener();
        start.addActionListener(startListener);
        

        this.setLayout(new BorderLayout());
        this.add(panel1,BorderLayout.NORTH);
        
        this.add(drawArray());

        
    }
    
    public void setArray( int[] array){
        this.array = array;
    }
    public int[] getArray(){
        return array;
    }
    public JPanel drawArray(){
        JPanel main = new JPanel(){ 
            
            public void paintComponent( Graphics g ){
                super.paintComponent( g );
                for (int i=0; i < array.length;i++){
                    g.drawRect(50+40*i, 200, 30, 30);
                    g.drawString(String.valueOf(array[i]), 50+40*i + 10, 220);
                }
            }
        };
        
        return main;
    }
}

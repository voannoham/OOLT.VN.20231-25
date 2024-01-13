package paint;

import javax.swing.*;

import sortalgorithm.SortAlgorithm;
import sortalgorithm.util.ArrayUtils;

import java.awt.*;
import java.awt.event.*;

public class RadixSortPanel extends JPanel{
	SortAlgorithm sortingAlgorithm;
	JButton start;
	double iheight;
    int iwidth;
    int[][] stepSortArray;
    int [][] flag;
    int[] array;
    
    public RadixSortPanel (SortAlgorithm sortingAlgorithm) {
    	this.sortingAlgorithm = sortingAlgorithm;
    	this.stepSortArray = sortingAlgorithm.getArrayLog();
        this.flag = sortingAlgorithm.getPointerLog();
        iheight = (double)450 / ArrayUtils.max(sortingAlgorithm.getArray());
        iwidth = 1000 / sortingAlgorithm.getArray().length;
        this.array = stepSortArray[0];
        start = new JButton("start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){
                System.out.println("*************");
                for (int i = 0; i< flag.length; i++){
                    for (int j = 0; j < flag[i].length; j++){
                        System.out.print(flag[i][j]+ " ");
                    }
                    System.out.println();
                }
                bubbleSortAnimate();
            }
        });
        
        add(start);
        
        System.out.println("--------------");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public void bubbleSortAnimate() {
        Timer timer = new Timer(10000, new ActionListener() {
            int i = 0;
            @Override
            public void actionPerformed(ActionEvent event){
                if (i==flag.length){
                    ((Timer) event.getSource()).stop();
                }
                else {
                    array = stepSortArray[i++];
                }
                if (i < flag.length){
                    repaint();
                }
            }
        });
        timer.setRepeats(true);
        timer.start();
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent( g );
        for (int index=0; index < array.length;index++){
            g.setColor(Color.YELLOW);
            g.fillRect(index*iwidth + (1000 - iwidth*array.length)/2, 
                                    500 - (int)(array[index]*iheight), 
                                    iwidth - 5, 
                                    (int)(array[index] * iheight));
        }
    }
}

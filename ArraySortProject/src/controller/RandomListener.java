package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import sortalgorithm.SortAlgorithm;
import view.MergeSortScreen;


public class RandomListener implements ActionListener{
    SortAlgorithm sortingAlgorithm1;
    public RandomListener(SortAlgorithm sortingAlgorithm){
        sortingAlgorithm1 = sortingAlgorithm;
    }
    
    public void actionPerformed(ActionEvent event){
        int[] array=new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            array[i] = random.nextInt(100)+1;
        }
        MergeSortScreen mergeSortScreen1 = new MergeSortScreen(sortingAlgorithm1.newInstance(array));
        mergeSortScreen1.setVisible(true);
      
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
    }
}


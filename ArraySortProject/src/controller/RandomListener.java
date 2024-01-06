package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.SwingUtilities;
import view.MergeSortScreen;


public class RandomListener implements ActionListener{
    
    int[] array=new int[20];
    public void actionPerformed(ActionEvent event){
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            array[i] = random.nextInt(100)+1;
        }
        MergeSortScreen mergeSortScreen1 = new MergeSortScreen();
        mergeSortScreen1.setArray(this.array);
        mergeSortScreen1.setVisible(true);
        System.out.print(mergeSortScreen1.getArray()[0]);
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
    }
}


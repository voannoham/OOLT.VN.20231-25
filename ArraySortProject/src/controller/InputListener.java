package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import sortalgorithm.SortAlgorithm;
import view.MergeSortScreen;


public class InputListener implements ActionListener{
    SortAlgorithm sortingAlgorithm1;
    public InputListener(SortAlgorithm sortingAlgorithm){
        sortingAlgorithm1 = sortingAlgorithm;
    }
    
    public void actionPerformed(ActionEvent event){
        String input = JOptionPane.showInputDialog("enter n:");
        int n = Integer.parseInt(input);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            input = JOptionPane.showInputDialog("enter array[" + i + "]:");
            array[i] = Integer.parseInt(input);
        }
        MergeSortScreen mergeSortScreen1 = new MergeSortScreen(sortingAlgorithm1.newInstance(array));
        mergeSortScreen1.setVisible(true);
      
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
    }
}

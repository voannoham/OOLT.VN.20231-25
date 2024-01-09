package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import sortalgorithm.merge.MergeSort;
import view.MergeSortScreen;

public class MergeSortListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        int[] array1={4,1,2,3};
        MergeSort mergeSort1 = new MergeSort(array1);
        MergeSortScreen mergeSortScreen1 = new MergeSortScreen(mergeSort1);
        mergeSortScreen1.setVisible(true);
        
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
    }
}
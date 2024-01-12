package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import sortalgorithm.counting.CountingSort;
import view.CountingSortScreen;

public class CountingSortListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        int[] array1={4,1,2,3};
        CountingSort countingSort1 = new CountingSort(array1);
        CountingSortScreen countingSortScreen1 = new CountingSortScreen(countingSort1);
        countingSortScreen1.setVisible(true);
        
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
    }
}
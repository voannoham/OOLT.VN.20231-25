package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;


import view.MergeSortScreen;

public class MergeSortListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        
        MergeSortScreen mergeSortScreen = new MergeSortScreen();
        mergeSortScreen.setVisible(true);
        
       
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
    }
}

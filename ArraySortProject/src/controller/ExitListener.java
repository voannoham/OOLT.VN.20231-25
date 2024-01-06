package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ExitListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        int result = JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){
			    System.exit(0);
		}
    }
}

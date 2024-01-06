package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import view.MainMenu;

public class BackListener implements ActionListener{
     @Override
    public void actionPerformed(ActionEvent event){
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
		SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();
    }
}

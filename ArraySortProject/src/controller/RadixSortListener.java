package controller;

import java.awt.event.*;
import javax.swing.*;

import sortalgorithm.radix.RadixSort;
import view.RadixSortScreen;

import java.awt.*;

public class RadixSortListener implements ActionListener {
	public void actionPerformed (ActionEvent event) {
		int [] array1 = {4,1,2,3};
		RadixSort radixSort1 = new RadixSort(array1);
		RadixSortScreen radixSortScreen1 = new RadixSortScreen(radixSort1);
		radixSortScreen1.setVisible(true);
		
        SwingUtilities.windowForComponent(((JButton) event.getSource())).dispose();	
	}
}

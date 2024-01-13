package view;

import javax.swing.*;

import paint.RadixSortPanel;
import sortalgorithm.SortAlgorithm;

import java.awt.*;
import java.awt.event.*;

public class RadixSortScreen extends SortScreen {
	
	public RadixSortScreen (SortAlgorithm sortingAlgorithm) {
		super (sortingAlgorithm);
		
		sortingAlgorithm.sort();
		JPanel radixSortPanel = new RadixSortPanel(sortingAlgorithm);
		for (int i=0; i < sortingAlgorithm.getPointerLog().length;i++){
            for (int j = 0; j < sortingAlgorithm.getPointerLog()[i].length;j++){
                System.out.print(sortingAlgorithm.getPointerLog()[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        this.setSize(1000,700);
        this.add(radixSortPanel);
	}
}

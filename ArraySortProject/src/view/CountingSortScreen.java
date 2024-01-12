package view;

import javax.swing.JPanel;
import sortalgorithm.SortAlgorithm;
import paint.CountingSortPanel;

public class CountingSortScreen extends SortScreen{
    
    public CountingSortScreen(SortAlgorithm sortingAlgorithm){ 
        super(sortingAlgorithm);
        
        sortingAlgorithm.sort();
        JPanel countingSortPanel = new CountingSortPanel(sortingAlgorithm);
        for (int i=0; i < sortingAlgorithm.getArrayLog().length;i++){
            for (int j = 0; j < sortingAlgorithm.getArrayLog()[i].length;j++){
                System.out.print(sortingAlgorithm.getArrayLog()[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        this.setSize(1000,700);
        this.add(countingSortPanel);
    }
}

package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class HelpListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        String helpText ="Sorting is commonly used as the introductory problem \nin various Computer Science classes "
                    + "to showcase a range of algorithmic ideas\n"
                    + "Without loss of generality, we assume that we will sort only Integers,\nnot necessarily distinct, in non-decreasing order in this visualization\n";
        JTextArea textArea = new JTextArea(helpText);
        JFrame helpFrame = new JFrame("Help");//creat help frame
        helpFrame.setSize( 640, 360 ); // set frame size
        helpFrame.setLocationRelativeTo(null);
        helpFrame.add(textArea);
        helpFrame.setVisible( true ); // display frame
    }
}

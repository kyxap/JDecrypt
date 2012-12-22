
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame {
	String ya = "ya";
    JFrame Frame1 = new JFrame("PageStore Decrypete ver 0.1");
    JPanel j2 = new JPanel();
    JButton b1 = new JButton ("Decrypt");
    JTextField t1 = new JTextField(14);
    JTextField t2 = new JTextField(20);
    JPanel j1 = new JPanel (new FlowLayout());
    JLabel l1 = new JLabel("Put Code here:");
    
    public Frame()
    {
    	String temp = "";
    	j1.add(l1);
	    j1.add(t1);
	    j2.add(b1);
	    j2.add(t2);
	    temp = t2.getText();  //WTF ? to be continied 
	    
	    Frame1.add(j1);
	    Frame1.add(j2);
	    Frame1.setLayout(new FlowLayout());
	    Frame1.setSize(400,150);
	    Frame1.setVisible(true);
	    Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
}

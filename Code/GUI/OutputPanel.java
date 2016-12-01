package GUI;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OutputPanel extends JPanel{
	
	public static JScrollPane scroll; 
	public static JTextArea output; 
	
	public OutputPanel(){
		
		setLayout(new BorderLayout()); 
		
		output = new JTextArea();
		output.setEditable(false);
		output.setFont(new Font("TimesRoman", Font.PLAIN, 24));
		output.setOpaque(true);
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
		
		add(output);
		
		scroll = new JScrollPane(output,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setOpaque(true);
		add(scroll);
	
		
	}

}

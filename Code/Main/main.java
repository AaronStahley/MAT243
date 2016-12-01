package Main;

import javax.swing.JFrame;

import GUI.OutputPanel;
import GUI.equationPanel;

public class main {
	
	public static JFrame frame; 
	private static JFrame output; 

	
	public static void main (String[] args){
		
		equationPanel ep = new equationPanel(); 
		OutputPanel op = new OutputPanel();
		
		frame = new JFrame("Truth Table Generator"); 		
		frame.add(ep);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		setOutput(new JFrame("Output"));
		getOutput().add(op);
		getOutput().setLocationRelativeTo(null);
		getOutput().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getOutput().setVisible(true);
		getOutput().setSize(250, 600);
		getOutput().setResizable(true);
		
		
	}


	public static JFrame getOutput() {
		return output;
	}


	public static void setOutput(JFrame output) {
		main.output = output;
	}
	

}



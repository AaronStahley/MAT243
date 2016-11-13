package Main;

import javax.swing.JFrame;

import GUI.equationPanel;
import Gates.gates;



public class main {
	
	private static JFrame frame; 

	
	public static void main(String[] args) {
		
		equationPanel ep = new equationPanel(); 
		
		
		
		frame = new JFrame("Truth Table Generator"); 
		
		frame.setLocationRelativeTo ( null );
		
		frame.add(ep); 

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		// Testing the gates.

		/*
		System.out.println(gates.andGate(0, 0));
		System.out.println(gates.andGate(0, 1));
		System.out.println(gates.andGate(1, 0));
		System.out.println(gates.andGate(1, 1));
		
		System.out.println();
		
		System.out.println(gates.orGate(0, 0));
		System.out.println(gates.orGate(0, 1));
		System.out.println(gates.orGate(1, 0));
		System.out.println(gates.orGate(1, 1));
		
		System.out.println();
	
		System.out.println(gates.notGate(0));
		System.out.println(gates.notGate(1));
		*/
	
		//System.out.println((gates.andGate(gates.orGate())gates.notGate()));
		
	//--------------------------------------------------// 

		System.out.println("a b");
		System.out.println("--------");
	     
	
		   for (int a =0; a <= 1; a++ ) 
	            for (int b=0; b <= 1; b++ )
	                for (int c=0; c<=1; c++ ) {
	                    int aa = (a==1)? 1: 0;
	                    int bb = (b==1)? 1: 0;
	                    int cc = (c==1)? 1: 0;
	                    System.out.println(aa + " " + bb + " " + cc + " | " + gates.andGate(gates.orGate(aa, bb),cc));
	                      
	                }		
	
		   


	}

}

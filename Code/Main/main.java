package Main;

import Gates.gates;

public class main {

	public static void main(String[] args) {
		
		
		// Testing the gates.

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
	
	
		//System.out.println((gates.andGate(gates.orGate())gates.notGate()));
		
	//--------------------------------------------------// 


	}

}

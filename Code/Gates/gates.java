package Gates;

public class gates {
	
	public gates(){
		
	}
	
	public static int andGate(int input1, int input2){
		
		int output = 0; 
		
		if(input1 == 1 && input2 == 1){
			
			output = 1; 
			
		}else{
			output = 0;
		}
		
		 return output; 
	}
	
	public static int orGate(int input1, int input2){
		
		int output = 0; 
		
		if(input1 == 1 && input2 == 1 || input1 == 1 && input2 == 0 || input1== 0 && input2 == 1 ){
			output = 1; 
		}else{
			output = 0; 
		}
		
		return output;
	}
	
	public static int notGate(int input){
		
		int output = 0;
		
		if(input == 1){
			output = 0;
		}else{
			output = 1; 
		}
		
		return output; 
	}

}

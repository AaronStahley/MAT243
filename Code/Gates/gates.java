package Gates;


public class gates {
	
	public static int aa; 
	public static int bb; 
	public static int cc; 
	
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
	
	public static int XORGate(int input1, int input2){
		
		int output = 0;
		
		return output; 
		
	}
	
	public static int implies(int input1, int input2){
		
		int output = 0;
		
		return output; 
	}
	
	public static int equivalance(int input1, int input2){
		int output = 0;
		
		return output; 
	}
	
	public static void evaluate(int num, gates i){
		
		if(num == 1){
			   for (int a =0; a <= 1; a++ ) {
		                    aa = (a==1)? 1: 0;
//		                    System.out.println(aa); 
		            }
		}
		else if(num == 2){
			
			   for (int a =0; a <= 1; a++ ) 
		            for (int b=0; b <= 1; b++ ){
		                    int aa = (a==1)? 1: 0;
		                    int bb = (b==1)? 1: 0;
//		                    System.out.println(aa + " " + bb + " | " + i ); 

		            }
			
		}
		else if(num == 3){
		
			 for (int a =0; a <= 1; a++ ) 
		            for (int b=0; b <= 1; b++ ){
		            	for(int c=0; c <= 1; c++){
		                    int aa = (a==1)? 1: 0;
		                    int bb = (b==1)? 1: 0;
		                    int cc = (b==1)? 1: 0; 
//		                    System.out.println(aa + " " + bb + " | " + i ); 
		            	}
		            }
			
		}
		else if(num == 4){
			
			 for (int a =0; a <= 1; a++ ) 
		            for (int b=0; b <= 1; b++ ){
		            	for(int c=0; c <= 1; c++){
		            		for(int d=0; d <= 1; d++){
		            			int aa = (a==1)? 1: 0;
		            			int bb = (b==1)? 1: 0;
		            			int cc = (b==1)? 1: 0; 
		            			int dd = (b==1)? 1: 0;
//		                    System.out.println(aa + " " + bb + " | " + i ); 
		            		}
		            	}
		            }
			
		}
		else if(num == 5){
			
			 for (int a =0; a <= 1; a++ ) 
		            for (int b=0; b <= 1; b++ ){
		            	for(int c=0; c <= 1; c++){
		            		for(int d=0; d <= 1; d++){
		            			for(int e=0; e <=1; e++){
		            				int aa = (a==1)? 1: 0;
		            				int bb = (b==1)? 1: 0;
		            				int cc = (b==1)? 1: 0; 
		            				int dd = (b==1)? 1: 0;
		            				int ee = (e==1)? 1: 0;
//		                    		System.out.println(aa + " " + bb + " | " + i ); 
		            			}
		            		}
		            	}
		            }
			
		}
		else if(num == 6){
			
			 for (int a =0; a <= 1; a++ ) 
		            for (int b=0; b <= 1; b++ ){
		            	for(int c=0; c <= 1; c++){
		            		for(int d=0; d <= 1; d++){
		            			for(int e=0; e <=1; e++){
		            				for(int f=0; f <=1; f++){
		            				int aa = (a==1)? 1: 0;
		            				int bb = (b==1)? 1: 0;
		            				int cc = (b==1)? 1: 0; 
		            				int dd = (b==1)? 1: 0;
		            				int ee = (e==1)? 1: 0;
		            				int ff = (f==1)? 1: 0; 
//		                    		System.out.println(aa + " " + bb + " | " + i ); 
		            				}
		            			}
		            		}
		            	}
		            }
			
		}
		
		
		
	}

}

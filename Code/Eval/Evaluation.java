package Eval;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import GUI.OutputPanel;
import GUI.equationPanel;

public class Evaluation {
	

	static equationPanel ep; 

		
	public Evaluation(){
		ep = new equationPanel();
//		jexl = new JexlEngine();
	}
	
	public static void evaluate(int num) throws ScriptException{
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

	
		
		if(num == 1){
			
			OutputPanel.output.append("A | K");
			OutputPanel.output.append("\n");
			
			   for (int A =0; A <= 1; A++ ){ 
		                    String a = (A==1)? "a = 1": "a = 0" ;
		            		String userVar[] = {a};
		            		
		            		for (String s : userVar) {
		            		    
		            			engine.eval(s);
		            			
		            		}
//			                  System.out.println(A + " | " + engine.eval(equationPanel.getEquationString()));       
		            	     OutputPanel.output.append((A + "  | " + engine.eval(equationPanel.getEquationString())));       
			                  OutputPanel.output.append("\n");
		           
			   }
		}
		else if(num == 2){
						
				OutputPanel.output.append("A B | K");
				OutputPanel.output.append("\n");
			
			   for (int A =0; A <= 1; A++ ) 
		            for (int B=0; B <= 1; B++ ){
		                    String a = (A==1)? "a = 1": "a = 0" ;
		                    String b = (B==1)? "b = 1": "b = 0";
		            		String userVar[] = {a, b};
		            		
		            		for (String s : userVar) {
		            		    
		            			engine.eval(s);
		            			
		            		}
			                 // System.out.println(A + " " + B + " | " + engine.eval(equationPanel.getEquationString()));       
			                  OutputPanel.output.append((A + "  " + B + " | " + engine.eval(equationPanel.getEquationString())));       
			                  OutputPanel.output.append("\n");
		            }
			   
		}
		
		else if(num == 3){
			
			OutputPanel.output.append("A B C | K");
			OutputPanel.output.append("\n");
		
			   for (int A =0; A <= 1; A++ ) 
		            for (int B=0; B <= 1; B++ ){
		            	  for (int C=0; C <= 1; C++ ){
		                    String a = (A==1)? "a = 1": "a = 0" ;
		                    String b = (B==1)? "b = 1": "b = 0";
		                    String c = (C==1)? "c = 1": "c = 0";

		            		String userVar[] = {a, b, c};
		            		
		            		for (String s : userVar) {
		            		    
		            			engine.eval(s);
		            			
		            		}
		            		
//			                  System.out.println(A + " " + B + " " + C + " | " + engine.eval(equationPanel.getEquationString()));       
		            		  OutputPanel.output.append((A + "  " + B + "  " + C + " | " + engine.eval(equationPanel.getEquationString())));       
			                  OutputPanel.output.append("\n");
		            	  }
		            }
			
		}
		else if(num == 4){
			
			OutputPanel.output.append("A B C D | K");
			OutputPanel.output.append("\n");
			
			   for (int A =0; A <= 1; A++ ) 
		            for (int B=0; B <= 1; B++ ){
		            	  for (int C=0; C <= 1; C++ ){
		            		  for (int D=0; D <= 1; D++ ){
		                    String a = (A==1)? "a = 1": "a = 0" ;
		                    String b = (B==1)? "b = 1": "b = 0";
		                    String c = (C==1)? "c = 1": "c = 0";
		                    String d = (D==1)? "d = 1": "d = 0";


		            		String userVar[] = {a,b,c,d};
		            		
		            		for (String s : userVar) {
		            		    
		            			engine.eval(s);
		            			
		            		}
		            		
//			                  System.out.println(A + " " + B + " " + C + " " + D + " | " + engine.eval(equationPanel.getEquationString()));   
		            		  OutputPanel.output.append((A + "  " + B + "  " + C + "  " + D + " | "  + engine.eval(equationPanel.getEquationString())));       
			                  OutputPanel.output.append("\n");
			                  
		            		  }

		            	  }
		            }
			
		}
		else if(num == 5){
			
			OutputPanel.output.append("A B C D  E | K");
			OutputPanel.output.append("\n");
			
			   for (int A =0; A <= 1; A++ ) 
		            for (int B=0; B <= 1; B++ ){
		            	  for (int C=0; C <= 1; C++ ){
		            		  for (int D=0; D <= 1; D++ ){
			            		  for (int E=0; E <= 1; E++ ){

		                    String a = (A==1)? "a = 1": "a = 0" ;
		                    String b = (B==1)? "b = 1": "b = 0";
		                    String c = (C==1)? "c = 1": "c = 0";
		                    String d = (D==1)? "d = 1": "d = 0";
		                    String e = (E==1)? "e = 1": "e = 0";

		            		String userVar[] = {a,b,c,d,e};
		            		
		            		for (String s : userVar) {
		            		    
		            			engine.eval(s);
		            			
		            		}
		            		
//			                  System.out.println(A + " " + B + " " + C + " " + D + " " + E + " | " + engine.eval(equationPanel.getEquationString()));   
		            		  OutputPanel.output.append((A + "  " + B + "  " + C + "  " + D + "  " + E + " | " + engine.eval(equationPanel.getEquationString())));       
			                  OutputPanel.output.append("\n");
			                  
		            		  
			            		  }
			            		  
		            	  }}}}
		
		else if(num == 6){
			
			OutputPanel.output.append("A B C D  E  F | K");
			OutputPanel.output.append("\n");
			
			   for (int A =0; A <= 1; A++ ) 
		            for (int B=0; B <= 1; B++ ){
		            	  for (int C=0; C <= 1; C++ ){
		            		  for (int D=0; D <= 1; D++ ){
			            		  for (int E=0; E <= 1; E++ ){
				            		  for (int F=0; F <= 1; F++ ){


		                    String a = (A==1)? "a = 1": "a = 0" ;
		                    String b = (B==1)? "b = 1": "b = 0";
		                    String c = (C==1)? "c = 1": "c = 0";
		                    String d = (D==1)? "d = 1": "d = 0";
		                    String e = (E==1)? "e = 1": "e = 0";
		                    String f = (F==1)? "f = 1": "f = 0";


		            		String userVar[] = {a,b,c,d,e,f};
		            		
		            		for (String s : userVar) {
		            		    
		            			engine.eval(s);
		            			
		            		}
		            		
//			                  System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " | " + engine.eval(equationPanel.getEquationString()));   
		            		  OutputPanel.output.append((A + "  " + B + "  " + C + "  " + D + "  " + E + "  " + F + " | "  + engine.eval(equationPanel.getEquationString())));       
			                  OutputPanel.output.append("\n");
		            		  }

		            	  }
		            }
		       }
		     }
		}
		
		
		
	}

}

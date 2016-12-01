package GUI;

public class enableDisable {

	
	public void enableVariables(){
		
		
	 	switch(equationPanel.getCount()){
    	case 0 : 
    	
        	equationPanel.getEquationButtons(6).setEnabled(true);

        	equationPanel.getEquationButtons(0).setEnabled(true);

    		break; 
    	case 1 :
    		
        	equationPanel.getEquationButtons(6).setEnabled(true);

    		for(int i = 0; i <= 1; i++){
    			equationPanel.getEquationButtons(i).setEnabled(true);
            	
            	}
    		break;
    	case 2 : 
    		
        	equationPanel.getEquationButtons(6).setEnabled(true);

    		for(int i = 0; i <= 2; i++){
    			equationPanel.getEquationButtons(i).setEnabled(true);
            	}
    		break; 
    	case 3 : 
    		
    		equationPanel.getEquationButtons(6).setEnabled(true);

    		for(int i = 0; i <= 3; i++){
    			equationPanel.getEquationButtons(i).setEnabled(true);
            	}
    		break;
    	case 4 :
    		
        	equationPanel.getEquationButtons(6).setEnabled(true);

    		for(int i = 0; i <= 4; i++){
    			equationPanel.getEquationButtons(i).setEnabled(true);
            	}
    		break; 
    	case 5 : 
    		
        	equationPanel.getEquationButtons(6).setEnabled(true);

    		for(int i = 0; i <= 5; i++){
    			equationPanel.getEquationButtons(i).setEnabled(true);
            	}
    		break;
    		
    		default: 
            	equationPanel.getEquationButtons(0).setEnabled(true);
            	equationPanel.getEquationButtons(6).setEnabled(true);

    		
    	
    	}
		
	}
	
	public void diableVariables(){
		for(int i = 0; i <= 6; i++){
        	equationPanel.getEquationButtons(i).setEnabled(false);
        	}
 	}
	
	public void disableOperators(){
		
		
		for(int i = 7; i <= 11; i++){
			
			equationPanel.getEquationButtons(i).setEnabled(false);
			
		}
		equationPanel.getEquationButtons(10).setEnabled(false);

	}
	
	public void enableOperators(){
		
		equationPanel.getEquationButtons(10).setEnabled(false);

		
		for(int i = 7; i <= 11; i++){
			
			equationPanel.getEquationButtons(i).setEnabled(true);
			
		}
		equationPanel.getEquationButtons(10).setEnabled(false);

	}
	
	public void dissableAll(){
		
		for(int i = 7; i <= 13; i++){
			
			equationPanel.getEquationButtons(i).setEnabled(false);
			
		}
		
	}
	
}

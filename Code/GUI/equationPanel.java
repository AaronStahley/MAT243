package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Eval.Evaluation;

public class equationPanel extends JPanel{
	
    private ImageIcon variablesIcon = new ImageIcon(this.getClass().getResource("/resources/VariablesLabel.png"));
    
    private ImageIcon A_Variable = new ImageIcon(this.getClass().getResource("/resources/A_Variable.png"));
    private ImageIcon A_Variable_Hover = new ImageIcon(this.getClass().getResource("/resources/A_Variable_Hover.png"));

    private ImageIcon B_Variable = new ImageIcon(this.getClass().getResource("/resources/B_Variable.png"));
    private ImageIcon B_Variable_Hover = new ImageIcon(this.getClass().getResource("/resources/B_Variable_Hover.png"));
    
    private ImageIcon C_Variable = new ImageIcon(this.getClass().getResource("/resources/C_Variable.png"));
    private ImageIcon C_Variable_Hover = new ImageIcon(this.getClass().getResource("/resources/C_Variable_Hover.png"));
    
    private ImageIcon D_Variable = new ImageIcon(this.getClass().getResource("/resources/D_Variable.png"));
    private ImageIcon D_Variable_Hover = new ImageIcon(this.getClass().getResource("/resources/D_Variable_Hover.png"));
    
    private ImageIcon E_Variable = new ImageIcon(this.getClass().getResource("/resources/E_Variable.png"));
    private ImageIcon E_Variable_Hover = new ImageIcon(this.getClass().getResource("/resources/E_Variable_Hover.png"));
    
    private ImageIcon F_Variable = new ImageIcon(this.getClass().getResource("/resources/F_Variable.png"));
    private ImageIcon F_Variable_Hover = new ImageIcon(this.getClass().getResource("/resources/F_Variable_Hover.png"));
    
    private ImageIcon Not_Gate = new ImageIcon(this.getClass().getResource("/resources/Not_Gate.png"));
    private ImageIcon Not_Gate_Hover = new ImageIcon(this.getClass().getResource("/resources/Not_Gate_Hover.png"));
    
    private ImageIcon And_Gate = new ImageIcon(this.getClass().getResource("/resources/And_Gate.png"));
    private ImageIcon And_Gate_Hover = new ImageIcon(this.getClass().getResource("/resources/And_Gate_Hover.png"));
    
    private ImageIcon Or_Gate = new ImageIcon(this.getClass().getResource("/resources/Or_Gate.png"));
    private ImageIcon Or_Gate_Hover = new ImageIcon(this.getClass().getResource("/resources/Or_Gate_Hover.png"));
    
    private ImageIcon XOR_Gate = new ImageIcon(this.getClass().getResource("/resources/XOR_Gate.png"));
    private ImageIcon XOR_Gate_Hover = new ImageIcon(this.getClass().getResource("/resources/XOR_Gate_Hover.png"));
    
    private ImageIcon Implies = new ImageIcon(this.getClass().getResource("/resources/Implies.png"));
    private ImageIcon Implies_Hover = new ImageIcon(this.getClass().getResource("/resources/Implies_Hover.png"));

    private ImageIcon Equivalance = new ImageIcon(this.getClass().getResource("/resources/Equivalace.png"));
    private ImageIcon Equivalance_Hover = new ImageIcon(this.getClass().getResource("/resources/Equivalace_Hover.png"));
    
    private ImageIcon Parenthesis_Left = new ImageIcon(this.getClass().getResource("/resources/Parenthesis_Left.png"));
    private ImageIcon Parenthesis_Left_Hover = new ImageIcon(this.getClass().getResource("/resources/Parenthesis_Left_Hover.png"));
    
    private ImageIcon Parenthesis_Right = new ImageIcon(this.getClass().getResource("/resources/Parenthesis_Right.png"));
    private ImageIcon Parenthesis_Right_Hover = new ImageIcon(this.getClass().getResource("/resources/Parenthesis_Right_Hover.png"));
    
    private ImageIcon Clear = new ImageIcon(this.getClass().getResource("/resources/Clear.png"));
    private ImageIcon Clear_Hover = new ImageIcon(this.getClass().getResource("/resources/Clear_Hover.png"));
    
    private ImageIcon Create = new ImageIcon(this.getClass().getResource("/resources/Create.png"));
    private ImageIcon Create_Hover = new ImageIcon(this.getClass().getResource("/resources/Create_Hover.png"));
        
    
    private static int count = 0; 
	
	private JComboBox numberOfVarCB;
	private JLabel numberOfVarLabel; 
	private static JTextField equationTF; 
	
	private static JButton[] equationButtons; 
	private JButton clearButton;
	private JButton generateButton;
	
	private enableDisable ed = new enableDisable();
	
	
	public equationPanel(){
		

		
		setLayout(null); 
		
		String[] vars = {"1","2","3","4","5","6"};
		
		this.numberOfVarLabel = new JLabel();
		this.numberOfVarLabel.setBounds(200, 40, 260, 40);
		this.numberOfVarLabel.setIcon(variablesIcon);
		add(numberOfVarLabel); 

		
		this.numberOfVarCB = new JComboBox(vars);
		this.numberOfVarCB.setBounds(477, 40, 117, 40);
		//this.numberOfVarCB.setFont(new Font("TimesRoman", Font.PLAIN, 16));
		this.numberOfVarCB.setSelectedIndex(0);
		add(numberOfVarCB);
		
		equationTF = new JTextField();
		equationTF.setBounds(105, 190, 590, 50);
		equationTF.setFont(new Font("TimesRoman", Font.PLAIN, 24));
		equationTF.setEditable(false);
		add(equationTF);
		
		this.clearButton = new JButton();
		this.clearButton.setBounds(315, 452, 172, 65);
		 this.clearButton.setBackground(null);
		 this.clearButton.setContentAreaFilled(false);	 
		 this.clearButton.setBorderPainted(false);
		 this.clearButton.setOpaque(false);
		this.clearButton.setIcon(this.Clear);
		this.numberOfVarCB.setSelectedIndex(0);

		this.clearButton.setRolloverIcon(this.Clear_Hover);
		add(clearButton);
		
		clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	equationPanel.getEquationTF().setText("");
            	OutputPanel.output.setText(null);
            	numberOfVarCB.setSelectedIndex(0);
            	count = 0; 
            	
            	equationButtons[13].setEnabled(false);
        		equationButtons[12].setEnabled(true);
            	
            	ed.enableVariables();
            	ed.disableOperators();
            	
            	generateButton.setEnabled(true);

            }
        });
		
		this.generateButton = new JButton();
		this.generateButton.setBounds(525, 452, 172, 65);
		this.generateButton.setBackground(null);
		this.generateButton.setContentAreaFilled(false);	 
		this.generateButton.setBorderPainted(false);
		this.generateButton.setOpaque(false);
		this.generateButton.setIcon(this.Create);
		this.generateButton.setRolloverIcon(this.Create_Hover);
		add(generateButton);
		
		
		// All the equation button attributes. 
		equationButtons = new JButton[14]; 
		
		for(int i = 0; i < equationButtons.length; i++){
			equationButtons[i] = new JButton(); 
		}
		
		for(int i = 0; i < equationButtons.length; i++){
			 equationButtons[i].setBackground(null);
			 equationButtons[i].setContentAreaFilled(false);	 
			 equationButtons[i].setBorderPainted(false);
			 equationButtons[i].setOpaque(false);
		}

		
		equationButtons[0].setBounds(105,268,65,65);
		equationButtons[0].setIcon(this.A_Variable);
		equationButtons[0].setRolloverIcon(A_Variable_Hover);
				
		equationButtons[1].setBounds(210,268,65,65);
		equationButtons[1].setIcon(this.B_Variable);
		equationButtons[1].setRolloverIcon(B_Variable_Hover);
		
		equationButtons[2].setBounds(315,268,65,65);
		equationButtons[2].setIcon(this.C_Variable);
		equationButtons[2].setRolloverIcon(C_Variable_Hover);
		
		equationButtons[3].setBounds(420,268,65,65);
		equationButtons[3].setIcon(this.D_Variable);
		equationButtons[3].setRolloverIcon(D_Variable_Hover);
		
		equationButtons[4].setBounds(525,268,65,65);
		equationButtons[4].setIcon(this.E_Variable);
		equationButtons[4].setRolloverIcon(E_Variable_Hover);
		
		equationButtons[5].setBounds(630,268,65,65);
		equationButtons[5].setIcon(this.F_Variable);
		equationButtons[5].setRolloverIcon(F_Variable_Hover);
		
		equationButtons[6].setBounds(105,360,65,65);
		equationButtons[6].setIcon(this.Not_Gate);
		equationButtons[6].setRolloverIcon(Not_Gate_Hover);
		
		equationButtons[7].setBounds(210,360,65,65);
		equationButtons[7].setIcon(this.And_Gate);
		equationButtons[7].setRolloverIcon(And_Gate_Hover);
		
		equationButtons[8].setBounds(315,360,65,65);
		equationButtons[8].setIcon(this.Or_Gate);
		equationButtons[8].setRolloverIcon(Or_Gate_Hover);
		
		equationButtons[9].setBounds(420,360,65,65);
		equationButtons[9].setIcon(this.XOR_Gate);
		equationButtons[9].setRolloverIcon(XOR_Gate_Hover);
		
		equationButtons[10].setBounds(525,360,65,65);
		equationButtons[10].setIcon(this.Implies);
		equationButtons[10].setEnabled(false);
		equationButtons[10].setRolloverIcon(Implies_Hover);
		
		equationButtons[11].setBounds(630,360,65,65);
		equationButtons[11].setIcon(this.Equivalance);
		equationButtons[11].setRolloverIcon(this.Equivalance_Hover);
		
		equationButtons[12].setBounds(105,452,65,65);
		equationButtons[12].setIcon(this.Parenthesis_Left);
		equationButtons[12].setRolloverIcon(this.Parenthesis_Left_Hover);
		
		equationButtons[13].setBounds(210,452,65,65);
		equationButtons[13].setIcon(this.Parenthesis_Right);
		equationButtons[13].setRolloverIcon(this.Parenthesis_Right_Hover);		
		
		
		for(int i = 0; i < equationButtons.length; i++){
			add(equationButtons[i]);
		}
		
	
		// Disables all buttons except the variable A at the start.
		for(int i = 1; i < equationButtons.length; i++){
        	equationButtons[i].setEnabled(false);
		}
	
		equationButtons[12].setEnabled(true);
		equationButtons[6].setEnabled(true);
		
		
		this.numberOfVarCB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String num  = (String)numberOfVarCB.getSelectedItem(); 
            	switch(num){
            	
            	case "1": 
            		count = 0; 
           
                    	equationButtons[0].setEnabled(true);
        			
            		
            		for(int i = 1; i <= 5; i++){
                    	equationButtons[i].setEnabled(false);
            		}
            		break; 
            	case "2":
            		
            		count = 1; 

            		for(int i = 0; i <= 1; i++){
                    	equationButtons[i].setEnabled(true);
        			}
            		
            		for(int i = 2; i <= 5; i++){
                    	equationButtons[i].setEnabled(false);
        			}
            		break;
            	case "3":
            		
            		count = 2; 

            		
            		for(int i = 0; i <= 2; i++){
                    	equationButtons[i].setEnabled(true);
        			}
            		
            		for(int i = 3; i <= 5; i++){
                    	equationButtons[i].setEnabled(false);
        			}
            		break;
            	case "4":
            		
            		count = 3; 

            		for(int i = 0; i <= 3; i++){
                    	equationButtons[i].setEnabled(true);
        			}
            		
            		for(int i = 4; i <= 5; i++){
                    	equationButtons[i].setEnabled(false);
            		}
            		break;
            	case "5":
            		
            		count = 4; 

            		for(int i = 0; i <= 4; i++){
                    	equationButtons[i].setEnabled(true);
        			}
            		
            		for(int i = 5; i <= 5; i++){
                    	equationButtons[i].setEnabled(false);
        			}
            		break;
            	case "6": 
            		
            		count = 5; 
            		
            		for(int i = 0; i <= 5; i++){
                    	equationButtons[i].setEnabled(true);
        			}
            		break; 
            	}
      
            }
        });
		
		ed.disableOperators();

		equationButtons[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "A");
            	
            	
            	ed.diableVariables();
            	ed.enableOperators();
           
            }
        });
		
		equationButtons[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "B");
            	
            	ed.diableVariables();
            	ed.enableOperators();

            }
        });
		
		equationButtons[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "C");
            	
            	ed.diableVariables();
            	ed.enableOperators();

            }
        });
		
		equationButtons[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "D");

            	ed.diableVariables();
            	ed.enableOperators();

            }
        });
		
		equationButtons[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "E");

            	ed.diableVariables();
            	ed.enableOperators();

            }
        });
		
		equationButtons[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "F");

            	ed.diableVariables();
            	ed.enableOperators();

            }
        });
		
		equationButtons[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "¬");
            	
            	ed.enableVariables();
            	ed.disableOperators();

        	
            }
        });
		
		equationButtons[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "∧");
            	
            	ed.enableVariables();
            	ed.disableOperators();

            }
        });
		
		equationButtons[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "∨");
            	
            	ed.enableVariables();
            	ed.disableOperators();
        	
            }
        });
		
		equationButtons[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "⊕");
            	
            	ed.enableVariables();
            	ed.disableOperators();

        	
            }
        });
		
		equationButtons[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "→");
            	
            	ed.enableVariables();
            	ed.disableOperators();
        	
            }
        });
		
		equationButtons[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "↔");
            	
            	ed.enableVariables();
            	ed.disableOperators();

            }
        });
		
		equationButtons[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + "(");  
            	
        		equationButtons[12].setEnabled(false);
        		equationButtons[13].setEnabled(true);


            }
        });
		
		equationButtons[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	equationPanel.getEquationTF().setText(equationPanel.getEquationTF().getText() + ")");
            	
        		equationButtons[13].setEnabled(false);
        		equationButtons[12].setEnabled(true);


            }
        });
		
		generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	//main.output.setEnabled(true);
//            	main m = new main();
            	
//            	m.getOutput().setEnabled(true);
            	
            	generateButton.setEnabled(false);
            	ed.dissableAll();
           
            	int num = numberOfVarCB.getSelectedIndex();
            	
            	try {
            		switch(num){
            		case 0 : Evaluation.evaluate(1);
            			break;
            		case 1 : Evaluation.evaluate(2);
        			break;
            		case 2 : Evaluation.evaluate(3);
        			break;
            		case 3 : Evaluation.evaluate(4);
        			break;
            		case 4 : Evaluation.evaluate(5);
        			break;
            		case 5 : Evaluation.evaluate(6);
        			break;
            			
            		}
            		
      				} catch (ScriptException e1) {
					e1.printStackTrace();
				}            
            	
           
            }});
	
	}
	
	
	public static JTextField getEquationTF() {
		return equationTF;
	}
	
	public static char[] getEquation() {
		
		
		char[] equation = equationTF.getText().toCharArray();
		
		return equation;
	}

	public static JButton getEquationButtons(int index) {
		return equationButtons[index];
	}
	
	public static int getCount(){
		return count; 
	}
	
	public char[] returnEquationArray(String equation){
		
		char[] eqautionArray = equation.toCharArray();
		
		return eqautionArray;
	}
	
	public static String getEquationString(){
		
		
		String eq = ""; 
		 
		
		for(int i = 0; i < getEquation().length; i++){
			
			switch(getEquation()[i]){
			
			case 'A' : eq = eq + " a ";
				break;
			case 'B' : eq = eq + " b ";
				break;
			case 'C' : eq = eq + " c ";
				break;
			case 'D' : eq = eq + " d ";
				break;
			case 'E' : eq = eq + " e ";
				break;
			case 'F' : eq = eq + " f ";
				break;
			case '¬' : eq = eq + " ! ";
				break;
			case '∧' : eq = eq + " & ";
				break;
			case '∨' : eq = eq + " | ";
				break;
			case '⊕' : eq = eq + " ^ ";
				break;
			case '↔' : eq = eq + " == ";
				break; 

				

			}
			
		}
		
		return eq;
	}
	


}

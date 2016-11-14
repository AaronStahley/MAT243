package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
    
    

	
	private JComboBox numberOfVarCB;
	private JLabel numberOfVarLabel; 
	private JTextField equationTF; 
	
	private JButton[] equationButtons; 
	private JButton clearButton;
	private JButton generateButton;
	
	@SuppressWarnings("deprecation")
	public equationPanel(){
		
		setLayout(null); 
		
		String[] vars = {"1","2","3","4","5","6"};
		
		this.numberOfVarLabel = new JLabel();
		this.numberOfVarLabel.setBounds(200, 40, 260, 40);
		this.numberOfVarLabel.setIcon(variablesIcon);
		add(numberOfVarLabel); 

		
		this.numberOfVarCB = new JComboBox(vars);
		this.numberOfVarCB.setBounds(477, 40, 117, 40);
	//	numberOfVar.setSelectedIndex(9);
		add(numberOfVarCB); 
		
		this.equationTF = new JTextField();
		this.equationTF.setBounds(105, 190, 590, 50);
		this.equationTF.setEditable(false);
		add(equationTF);
		
		this.clearButton = new JButton();
		this.clearButton.setBounds(315, 452, 172, 65);
		 this.clearButton.setBackground(null);
		 this.clearButton.setContentAreaFilled(false);	 
		 this.clearButton.setBorderPainted(false);
		 this.clearButton.setOpaque(false);
		this.clearButton.setIcon(this.Clear);
		this.clearButton.setRolloverIcon(this.Clear_Hover);
		add(clearButton);
		
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
		this.equationButtons = new JButton[14]; 
		
		for(int i = 0; i < this.equationButtons.length; i++){
			this.equationButtons[i] = new JButton(); 
		}
		
		for(int i = 0; i < this.equationButtons.length; i++){
			 this.equationButtons[i].setBackground(null);
			 this.equationButtons[i].setContentAreaFilled(false);	 
			 this.equationButtons[i].setBorderPainted(false);
			 this.equationButtons[i].setOpaque(false);
		}

		
		this.equationButtons[0].setBounds(105,268,65,65);
		this.equationButtons[0].setIcon(this.A_Variable);
		this.equationButtons[0].setRolloverIcon(A_Variable_Hover);
				
		this.equationButtons[1].setBounds(210,268,65,65);
		this.equationButtons[1].setIcon(this.B_Variable);
		this.equationButtons[1].setRolloverIcon(B_Variable_Hover);
		
		this.equationButtons[2].setBounds(315,268,65,65);
		this.equationButtons[2].setIcon(this.C_Variable);
		this.equationButtons[2].setRolloverIcon(C_Variable_Hover);
		
		this.equationButtons[3].setBounds(420,268,65,65);
		this.equationButtons[3].setIcon(this.D_Variable);
		this.equationButtons[3].setRolloverIcon(D_Variable_Hover);
		
		this.equationButtons[4].setBounds(525,268,65,65);
		this.equationButtons[4].setIcon(this.E_Variable);
		this.equationButtons[4].setRolloverIcon(E_Variable_Hover);
		
		this.equationButtons[5].setBounds(630,268,65,65);
		this.equationButtons[5].setIcon(this.F_Variable);
		this.equationButtons[5].setRolloverIcon(F_Variable_Hover);
		
		this.equationButtons[6].setBounds(105,360,65,65);
		this.equationButtons[6].setIcon(this.Not_Gate);
		this.equationButtons[6].setRolloverIcon(Not_Gate_Hover);
		
		this.equationButtons[7].setBounds(210,360,65,65);
		this.equationButtons[7].setIcon(this.And_Gate);
		this.equationButtons[7].setRolloverIcon(And_Gate_Hover);
		
		this.equationButtons[8].setBounds(315,360,65,65);
		this.equationButtons[8].setIcon(this.Or_Gate);
		this.equationButtons[8].setRolloverIcon(Or_Gate_Hover);
		
		this.equationButtons[9].setBounds(420,360,65,65);
		this.equationButtons[9].setIcon(this.XOR_Gate);
		this.equationButtons[9].setRolloverIcon(XOR_Gate_Hover);
		
		this.equationButtons[10].setBounds(525,360,65,65);
		this.equationButtons[10].setIcon(this.Implies);
		this.equationButtons[10].setRolloverIcon(Implies_Hover);
		
		this.equationButtons[11].setBounds(630,360,65,65);
		this.equationButtons[11].setIcon(this.Equivalance);
		this.equationButtons[11].setRolloverIcon(this.Equivalance_Hover);
		
		this.equationButtons[12].setBounds(105,452,65,65);
		this.equationButtons[12].setIcon(this.Parenthesis_Left);
		this.equationButtons[12].setRolloverIcon(this.Parenthesis_Left_Hover);
		
		this.equationButtons[13].setBounds(210,452,65,65);
		this.equationButtons[13].setIcon(this.Parenthesis_Right);
		this.equationButtons[13].setRolloverIcon(this.Parenthesis_Right_Hover);		
		
		
		for(int i = 0; i < this.equationButtons.length; i++){
			add(equationButtons[i]);
		}

		
		
		
		
	}
	
	

}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
	boolean isoperatorcliked=false;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	String oldValue;
	String oprator;
	
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300, 150);
		displayLabel =new JLabel("");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30, 430, 80, 80);
		zeroButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(130, 430, 80, 80);
		dotButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(430, 430, 150, 80);
		clearButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			if(isoperatorcliked) {
				displayLabel.setText("7");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==eightButton) {
			if(isoperatorcliked) {
				displayLabel.setText("8");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}

			
		}else if(e.getSource()==nineButton) {
			if(isoperatorcliked) {
				displayLabel.setText("9");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource()==fourButton) {
			if(isoperatorcliked) {
				displayLabel.setText("4");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource()==fiveButton) {
			if(isoperatorcliked) {
				displayLabel.setText("5");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource()==sixButton) {
			if(isoperatorcliked) {
				displayLabel.setText("6");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==oneButton) {
			if(isoperatorcliked) {
				displayLabel.setText("1");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource()==twoButton) {
			if(isoperatorcliked) {
				displayLabel.setText("2");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource()==threeButton) {
			if(isoperatorcliked) {
				displayLabel.setText("3");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==zeroButton) {
			if(isoperatorcliked) {
				displayLabel.setText("0");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==dotButton) {
			if(isoperatorcliked) {
				displayLabel.setText(".");
				isoperatorcliked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
			
		}else if(e.getSource()==equalButton) {
			String newvValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newvValue);
			
			
			if(oprator=="+") {
				
				
				float result=oldValueF+newValueF;
				displayLabel.setText(result+"");

			}
			if(oprator=="-") {
				
				
				float result=oldValueF-newValueF;
				displayLabel.setText(result+"");

			}
			if(oprator=="x") {
				
				
				float result=oldValueF*newValueF;
				displayLabel.setText(result+"");

			}
			if(oprator=="/") {
				
				
				float result=oldValueF/newValueF;
				displayLabel.setText(result+"");

			}
			
			
		}
		else if(e.getSource()==divButton) {
			
			isoperatorcliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("/");
			oprator= displayLabel.getText();
			
			
		}else if(e.getSource()==mulButton) {
			
			isoperatorcliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("x");
			oprator= displayLabel.getText();
			
		}else if(e.getSource()==minusButton) {
			
			isoperatorcliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("-");
			oprator= displayLabel.getText();
			
		}else if(e.getSource()==plusButton) {
			
			isoperatorcliked=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("+");
			oprator= displayLabel.getText();
			
			
			
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
			
		}
		
	}
}

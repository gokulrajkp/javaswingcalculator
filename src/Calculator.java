import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
	
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
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			displayLabel.setText("7");
			
		}else if(e.getSource()==eightButton) {
			displayLabel.setText("8");
			
		}else if(e.getSource()==nineButton) {
			displayLabel.setText("9");
			
		}else if(e.getSource()==fourButton) {
			displayLabel.setText("4");
			
		}else if(e.getSource()==fiveButton) {
			displayLabel.setText("5");
			
		}else if(e.getSource()==sixButton) {
			displayLabel.setText("6");
			
		}else if(e.getSource()==oneButton) {
			displayLabel.setText("1");
			
		}else if(e.getSource()==twoButton) {
			displayLabel.setText("2");
			
		}else if(e.getSource()==threeButton) {
			displayLabel.setText("3");
			
		}else if(e.getSource()==zeroButton) {
			displayLabel.setText("0");
			
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(".");
			
		}else if(e.getSource()==equalButton) {
			displayLabel.setText("=");
			
		}
		else if(e.getSource()==divButton) {
			displayLabel.setText("/");
			
		}else if(e.getSource()==mulButton) {
			displayLabel.setText("x");
			
		}else if(e.getSource()==minusButton) {
			displayLabel.setText("-");
			
		}else if(e.getSource()==plusButton) {
			displayLabel.setText("+");
			
		}
		
	}
}

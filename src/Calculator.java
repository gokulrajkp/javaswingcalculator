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
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(nineButton);
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(sixButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(threeButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(30, 430, 80, 80);
		zeroButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(zeroButton);
		
		JButton dotButton=new JButton("8");
		dotButton.setBounds(130, 430, 80, 80);
		dotButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(dotButton);
		
		JButton equalButton=new JButton("9");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(equalButton);
		
		JButton divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(divButton);
		
		JButton mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(mulButton);
		
		JButton minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(minusButton);
		
		JButton plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("ARIAL",Font.PLAIN,40));
		jf.add(plusButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		displayLabel.setText("7");
		
	}
}

package bhogal.cipher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class CipherView extends JFrame {
	private CipherController c1;
	private CipherModel m1;
	
	private Label l;
	private JTextField jt;
	private JTextArea ja, ja2;
	private JPanel p1,p2,p3,p4;
	private JPanel p11,p12;
	private JPanel p21,p22;
	private JPanel p31,p32;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg1;
	private JButton b1,b2,b3,b4,b5,b6;
	private Border border;
	//Konstruktor
	public CipherView(CipherModel m, CipherController c) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.m1 = m;
		this.c1 = c;
		//
		this.setSize(800, 450);
		this.setResizable(false);
		this.setTitle("Cipher");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); 
		this.setLayout(new GridLayout(3,1));
		//Defining
		this.l = new Label("secret Alphabet / shift Value");
		this.jt = new JTextField(20);
		this.ja = new JTextArea(8,35);
		this.ja2 = new JTextArea(8,35);
		
		this.p1 = new JPanel();
		this.p2 = new JPanel();
		this.p3 = new JPanel();
		
		this.b1 = new JButton("Submit");
		this.b2 = new JButton("Reset");
		this.b3 = new JButton("Encode");
		this.b4 = new JButton("Reset");
		this.b5 = new JButton("Decode");
		this.b6 = new JButton("Reset");
		this.rb1 = new JRadioButton("SHIFT");
		this.rb2 = new JRadioButton("SUB");
		this.bg1 = new ButtonGroup();
		this.bg1.add(this.rb1);
		this.bg1.add(this.rb2);
		
		this.p11 = new JPanel();
		this.p12 = new JPanel();
		
		this.p21 = new JPanel();
		this.p22 = new JPanel();
		
		this.p31 = new JPanel();
		this.p32 = new JPanel();
		
		this.border = BorderFactory.createLineBorder(Color.BLACK);
		this.jt.setBorder(border);
		this.ja.setBorder(border);
		this.ja2.setBorder(border);
		//
		this.l.setAlignment(Label.CENTER);
		this.p1.setSize(800, 150);
		this.p2.setSize(800, 150);
		this.p3.setSize(800, 150);
		
		this.p11.setSize(800, 100);
		this.p12.setSize(800, 100);
		
		this.p21.setSize(800, 100);
		this.p22.setSize(800, 100);
		
		this.p31.setSize(800, 100);
		this.p32.setSize(800, 100);
		
		this.p1.setLayout(new GridLayout(1,2));
		this.p2.setLayout(new GridLayout(1,2));
		this.p3.setLayout(new GridLayout(1,2));
		this.p11.setLayout(new GridLayout(2,1));
		this.p12.setLayout(new GridLayout(5,1));
		this.p22.setLayout(new GridLayout(3,1));
		this.p32.setLayout(new GridLayout(3,1));
		
		this.ja.setWrapStyleWord(true);
		this.ja.setLineWrap(true);
		
		this.b1.addActionListener(this.c1);
		this.b2.addActionListener(this.c1);
		this.b3.addActionListener(this.c1);
		this.b4.addActionListener(this.c1);
		this.b5.addActionListener(this.c1);
		this.b6.addActionListener(this.c1);
		
		
		this.ja.setEnabled(false);
		this.ja.setBackground(Color.gray);
		this.ja2.setEnabled(false);
		this.ja2.setBackground(Color.gray);
		
		this.ja2.setWrapStyleWord(true);
		this.ja2.setLineWrap(true);
		
		//adding
		this.p11.add(this.rb1);
		this.p11.add(this.rb2);
		this.p12.add(this.l);
		this.p12.add(this.jt);
		this.p12.add(this.b1);
		this.p12.add(this.b2);
		this.p1.add(this.p11);
		this.p1.add(this.p12);
		
		this.p21.add(this.ja);
		this.p22.add(this.b3);
		this.p22.add(this.b4);
		
		this.p2.add(this.p21);
		this.p2.add(this.p22);
		
		this.p31.add(this.ja2);
		this.p32.add(this.b5);
		this.p32.add(this.b6);
		
		this.p3.add(this.p31);
		this.p3.add(this.p32);
		
		this.add(this.p1);
		this.add(this.p2);
		this.add(this.p3);
		
		this.setVisible(true);
	}
	
	public void b2Reset(){
		this.jt.setText("");
	}
	
	public void b4Reset(){
		this.ja.setText("");
	}
	
	public void b6Reset(){
		this.ja2.setText("");
	}
	
	public void changeMod() throws NumberFormatException, exceptions {
		if(this.rb1.isSelected() == true) {
			this.m1.typeChange("shift", this.jt.getText());
		}else {
			this.m1.typeChange("sub", this.jt.getText());
		}
		this.ja.setEnabled(true);
		this.ja.setBackground(Color.white);
		this.ja2.setEnabled(true);
		this.ja2.setBackground(Color.white);
	}
	
	public void blockText() {
		this.ja.setEnabled(false);
		this.ja.setBackground(Color.gray);
		this.ja2.setEnabled(false);
		this.ja2.setBackground(Color.gray);
	}
	
	public void Decrypt() {
		String placeholder = this.m1.decrypt(this.ja2.getText());
		this.ja.setText(placeholder);
		
	}
	
	public void Encrypt() {
		String placeholder = this.m1.encrypt(this.ja.getText());
		this.ja2.setText(placeholder);
	}
	
	public void exceptionMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public boolean isB1(ActionEvent e) {
		if(this.b1 == e.getSource()) {
			return true;
		}else {
			return false;
		}
	}	
	
	public boolean isB2(ActionEvent e) {
		if(this.b2 == e.getSource()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isB3(ActionEvent e) {
		if(this.b3 == e.getSource()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isB4(ActionEvent e) {
		if(this.b4 == e.getSource()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean isB5(ActionEvent e) {
		if(this.b5 == e.getSource()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isB6(ActionEvent e) {
		if(this.b6 == e.getSource()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void refresh() {
		this.repaint();
	}
}

package bhogal.cipher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CipherView extends JFrame {
	private CipherController c1;
	private MonoAlphabeticCypher m1;
	private CipherPanel p1;
	
	private JButton decrypt, encrypt, secret;
	private JRadioButton radio0;
	private JPanel inputpanel, decryptpanel, encryptpanel;
	private Container incon, decon, encon;
	//Konstruktor
	public CipherView(MonoAlphabeticCypher m, CipherController c) {
		this.c1 = c;
		this.m1 = m;
		this.decrypt = new JButton("Decrypt");
		this.encrypt = new JButton("Encrypt");
		this.secret = new JButton("decrypt");
		
		
		this.setTitle("Verschüsselung 1.2");
		
		
		this.inputpanel = new JPanel();
		this.decryptpanel = new JPanel();
		
		
		
		this.setTitle("Verschüsselung");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void refresh() {
		this.repaint();
	}
}

package bhogal.cipher;

import java.awt.*;
import java.awt.ActiveEvent.*;
import java.awt.event.*;

import java.awt.event.ActionListener;

public class CipherController implements ActionListener{

	private CipherModel m1;
	private CipherView v1;
	
	
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(this.v1.isB1(e)) {
			try {
				try {
					v1.changeMod();
				} catch (exceptions e1) {
				
					e1.printStackTrace();
				}
			} catch (NumberFormatException e1) {
				v1.exceptionMessage(e1.toString());
				v1.blockText();
			}
			v1.refresh();
		}
		if(this.v1.isB2(e)) {
			v1.b2Reset();
			v1.refresh();
		}
		if(this.v1.isB3(e)) {
			v1.Encrypt();
			v1.refresh();
		}
		if(this.v1.isB4(e)) {
			v1.b4Reset();
			v1.refresh();
		}
		if(this.v1.isB5(e)) {
			v1.Decrypt();
			v1.refresh();
		}
		if(this.v1.isB6(e)) {
			v1.b6Reset();
			v1.refresh();
		}
		
	}
	
	public CipherController() {
		this.m1 = new CipherModel();
		this.v1 = new CipherView(this.m1, this);
		
		
	}


}

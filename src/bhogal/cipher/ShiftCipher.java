package bhogal.cipher;

public class ShiftCipher extends MonoAlphabeticCypher {
	
	public ShiftCipher(int value) throws exceptions {
		int svalue = value;
		String alphabet= "abcdefghijklmnopqrstuvwxyzäöüß";
		String salphabet = "";
		
		if (value > 29 || value < 1) {
			throw new exceptions("Üngültige Zahl");	
		}
		for (int i =0; i < alphabet.length(); i++) {
			int switched = i + svalue;
			if ( switched > 29) {
				switched = switched -30;
				
			}
			salphabet = salphabet + alphabet.charAt(switched);
		}
	
		
		super.setSecretAlphabet(salphabet);
	}
	
	
	public void setShiftValue(int value) throws exceptions {
		int sValue = value;
		
		String alphabet1 ="abcdefghijklmnopqrstuvwxyzäöüß";
		String secretAlphabet1 = "";
		
		if (value > 29 && value < 1) {
			throw new exceptions("exception");
		}
		for (int i = 0; i < alphabet1.length(); i++) {
			int switches = i + sValue;
			if (switches > 29) {
				switches = switches - 30;
			}
			secretAlphabet1 += alphabet1.charAt(switches);
		}
		super.setSecretAlphabet(secretAlphabet1);
	}
}

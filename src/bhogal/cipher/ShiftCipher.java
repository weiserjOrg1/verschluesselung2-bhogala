package bhogal.cipher;

public class ShiftCipher {
	public ShiftCipher(int value) {
		this.setShiftValue(value);
	}
	
	public void setShiftValue(int value) {
		String alphabet1 ="abcdefghijklmnopqrstuvwxyzäöüß";
		String secretAlphabet1 = "";
		value = value % 30;
		for (int i = 0; i < alphabet1.length(); i++) {
			secretAlphabet1 = alphabet1.charAt(i) + secretAlphabet1;
		
		}
	}
}

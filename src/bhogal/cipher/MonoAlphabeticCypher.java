/**
 * MonoAlphabeticCypher 
 * encrypts, decrypts and checks the secretAlphabet
 * @author Arjun Bhogal
 * @version 2018-11-10
 */
package bhogal.cipher;

public class MonoAlphabeticCypher implements Cipher {
	private String secretAlphabet; // Constant
	
	//Constructor sets the secretAlphabet to default
	public MonoAlphabeticCypher() {
		this.secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	}
	
	// get-Method
	public String getSecretAlphabet(){
		return this.secretAlphabet;
	}
	
	//sets the secretAlphabet to new secretAlphabet
	protected void setSecretAlphabet(String secretAlphabet) {
		try {
			this.secretAlphabet = checkSecretAlphabet(secretAlphabet);
		}catch(exceptions e) {
			System.out.println(e.toString());
		}
	}
	
	/* decrypts the secretAlphabet with 
	 * use of 2 help strings the first one is the
	 * default alphabet and the 2nd one checks if there are
	 * invalid characters which will be ignored by the method
	 */
	public String decrypt(String text) {
		String hilfe= "abcdefghijklmnopqrstuvwxyzäöüß";
		text = text.toLowerCase();
		String decrypttxt = "";
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int bhilfe = this.secretAlphabet.indexOf(c);
			if (bhilfe == -1) {
				decrypttxt = decrypttxt + c;	
			}else{
				decrypttxt = decrypttxt + hilfe.charAt(bhilfe);
			}
		}		
		return decrypttxt;
	}
	
	/* encrypts the alphabet with the help of the secretAlphabet
	 */
	public String encrypt(String text) {
		text = text.toLowerCase();
		String hilfe= "abcdefghijklmnopqrstuvwxyzäöüß";
		String encrypttxt = "";
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int ahilfe = hilfe.indexOf(c);
			if (ahilfe == -1) {
				encrypttxt = encrypttxt + c;
			}else {
				encrypttxt = encrypttxt + this.secretAlphabet.charAt(ahilfe);
			}
		}
		return encrypttxt;
	}
	
	
	public String checkSecretAlphabet(String secretAlph) throws exceptions {
		secretAlph = secretAlph.toLowerCase(); //String is set to lower case
		//30 character long alphabet check
		if(secretAlph.length() > 30 || secretAlph.length() < 30) {
			throw new exceptions("Alphabet is too long or too short!");
		}
		
		//1* characters check
		for (int i = 0; i < secretAlph.length(); i++) {
			char c = secretAlph.charAt(i);
			if (secretAlph.indexOf(c) == secretAlph.lastIndexOf(c)) {
			}else {
				throw new exceptions("wrong character in use!");
			}
		}
		
		//invalid characters check
		for(int i = 0; i < 30; i++) {
            char letter = secretAlph.charAt(i);
            if((letter > 'a'-1 && letter < 'z'+1) || letter == 'ä' || letter == 'ö' || letter == 'ü' || letter=='ß') {

            }else {
                throw new exceptions("The alphabet must not contain any special characters");
            }
        }
		return secretAlph;
	}
}

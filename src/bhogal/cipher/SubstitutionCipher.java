/**
 * SubstitutionCipher extends MonoAlphabeticCypher
 * sets the secretAlphabet
 * @author Arjun Bhogal
 * @version 2018-11-10
 */
package bhogal.cipher;

public class SubstitutionCipher extends MonoAlphabeticCypher {
	
	//Constructor
	public SubstitutionCipher(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet);
	}
	
	public void setSecretAlphabet(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet); //sets the secretAlphabet
	}
	
}

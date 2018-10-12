/**
 * Chipher is the Interface that is used to set the rules
 * @author Arjun Bhogal
 * @version 2018-11-10
 */
package bhogal.cipher;

public interface Cipher {
	
	public String encrypt(String text); // Setting the rule to encrpyt the text
	public String decrypt(String text); // Setting the rule to decrypt the text 
	
}

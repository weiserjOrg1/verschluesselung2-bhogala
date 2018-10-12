/**
 * trycipher = testclass
 * @author Arjun Bhogal
 * @version 2018-11-10
 */
package bhogal.cipher;

public class trycipher {

	public static void main(String[] args) {
		SubstitutionCipher c1 = new SubstitutionCipher("abcdefopqrstuvwxyzäöüßghijklmn");
		
		System.out.println(c1.encrypt("arjun bhogal")); // encrypting 
		System.out.println(c1.decrypt(c1.encrypt("arjun bhogal"))); // decrypting
	}

}

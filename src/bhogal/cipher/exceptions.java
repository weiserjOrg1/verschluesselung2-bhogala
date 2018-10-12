/**
 * Exceptions
 * @author Arjun Bhogal
 * @version 2018-11-10
 */
package bhogal.cipher;

public class exceptions extends Exception{
	
	public exceptions() {
		super("SecretMessage is unacceptable.");
	}
	//default exception
	public exceptions(String alert) {
		super(alert);
	}
	//1st exception
	
}

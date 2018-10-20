package bhogal.cipher;

public class CipherModel {

	private MonoAlphabeticCypher m;
	private String type;
	
	public CipherModel() {
		this.type = "mono";
		this.m = new MonoAlphabeticCypher();
	}
	
	
	public void typeChange (String type, String p)throws NumberFormatException, exceptions { // exception 
		switch(type) {
		case "shift" :
			this.m = new MonoAlphabeticCypher();
			this.m = new ShiftCipher(Integer.parseInt(p));
			this.type = "shift";
			break;
		case "subst" :
			this.m = new MonoAlphabeticCypher();
			this.m = new SubstitutionCipher(p);
			this.type = "shift";
			break;
			}
	}
	
	public String decrypt(String txt) {
		return this.m.decrypt(txt);
	}
	public String encrypt(String text) {
		return this.m.encrypt(text);
	}
}

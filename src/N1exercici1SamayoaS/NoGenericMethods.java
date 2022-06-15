package N1exercici1SamayoaS;

public class NoGenericMethods {
	
	private String nom;
	private String cognom;
	private int edat;
	
	public NoGenericMethods(String nom, String cognom, int edat) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}
	public NoGenericMethods(int edat, String nom, String cognom) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}
	public NoGenericMethods(String nom, int edat, String cognom) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "  Lista-> nom: " + nom +"   Cognom: " + cognom +"   Edat:" +edat;
	}
	
	
}

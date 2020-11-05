class Navn{
	private String navn;
	private String etternavn;

	public Navn(String navn, String etternavn){
		this.navn = navn;
		this.etternavn = etternavn;
	}

	public void setFornavn(String newValue){
		String nyttFornavn = new String(newValue);
	}
	public void setEtternavn(String newValue){
		String nyttEtternavn = new String(newValue);
	}

	public String getFornavn(){
		return navn;
	}
	public String getEtternavn(){
			return etternavn;
	}

	public boolean equals(Object obj){
		Navn testPerson = (Navn) obj;
		if(this.getFornavn().equals(testPerson.getFornavn()) || this.getEtternavn().equals(testPerson.getEtternavn())){
			return true;
		}
		return false;
	}

	public String toString(){
		return navn + " " + etternavn;
	}
}

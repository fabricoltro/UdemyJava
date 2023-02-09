package modulo2;

public enum AB_Continenes {
AFRICA(53),
EUROPA(46),
ASIA(44),
AMERICA(34),
OCEANIA(14);
	
	private final int paises;
	
	AB_Continenes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return this.paises;
	}
	
}

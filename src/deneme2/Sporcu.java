package deneme2;

public abstract class Sporcu {
	
	//Deðiþkenler
	private String sporcuIsim, sporcuTakim, dosyayolu;
	private boolean kartKullanildiMi;
	private int beceri1, beceri2, beceri3, sporcuID;

	//Constructors
	public Sporcu(String sporcuIsim, String sporcuTakim, int beceri1, int beceri2, int beceri3, String dosyayolu, int sporcuID, boolean kartKullanildiMi) {
		this.sporcuIsim=sporcuIsim;
		this.sporcuTakim=sporcuTakim;
		this.beceri1=beceri1;
		this.beceri2=beceri2;
		this.beceri3=beceri3;
		this.dosyayolu=dosyayolu;
		this.sporcuID=sporcuID;
		this.kartKullanildiMi=kartKullanildiMi;

	}
	public Sporcu(){
		
	}

	//Getters and Setters
	public int getSporcuID() {
		return sporcuID;
	}
	public void setSporcuID(int sporcuID) {
		this.sporcuID = sporcuID;
	}

	public String getSporcuIsim() {
		return sporcuIsim;
	}
	public void setSporcuIsim(String sporcuIsim) {
		this.sporcuIsim = sporcuIsim;
	}

	public String getSporcuTakim() {
		return sporcuTakim;
	}
	public void setSporcuTakim(String sporcuTakim) {
		this.sporcuTakim = sporcuTakim;
	}

	public String getDosyayolu() {
		return dosyayolu;
	}
	public void setDosyayolu(String dosyayolu) {
		this.dosyayolu = dosyayolu;
	}

	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	
	public int getBeceri1() {
		return beceri1;
	}
	public void setBeceri1(int beceri1) {
		this.beceri1 = beceri1;
	}

	public int getBeceri2() {
		return beceri2;
	}
	public void setBeceri2(int beceri2) {
		this.beceri2 = beceri2;
	}

	public int getBeceri3() {
		return beceri3;
	}
	public void setBeceri3(int beceri3) {
		this.beceri3 = beceri3;
	}

	//Fonksiyonlar
	public int sporcuPuaniGoster() {
		//Puanlar kart resmi üzerinde yer almaktadýr.
		return 0;
	}
	
}

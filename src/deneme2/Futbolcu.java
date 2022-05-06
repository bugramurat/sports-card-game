package deneme2;

import javax.swing.ImageIcon;

public class Futbolcu extends Sporcu implements Metotlar {

	// Deiiikenler
	private String futbolcuAdi, futbolcuTakim, dosyayolu;
	private int penalti, serbestVurus, kaleciKarsi, futbolcuID;
	private boolean kartKullanildiMi;
	private ImageIcon icon = new ImageIcon(dosyayolu);

	// Constructors
	public Futbolcu(String futbolcuAdi, String futbolcuTakim, String dosyayolu, int penalti, int serbestVurus,
			int kaleciKarsi, boolean kartKullanildiMi, int futbolcuID) {
		super(futbolcuAdi, futbolcuTakim, penalti, serbestVurus, kaleciKarsi, dosyayolu, futbolcuID, kartKullanildiMi);
	}

	public Futbolcu() {
		super();
	}

	// Getters and Setters
	public String getDosyayolu() {
		return dosyayolu;
	}

	public void setDosyayolu(String dosyayolu) {
		this.dosyayolu = dosyayolu;
	}

	public int getFutbolcuID() {
		return futbolcuID;
	}

	public void setFutbolcuID(int futbolcuID) {
		this.futbolcuID = futbolcuID;
	}

	public String getFutbolcuAdi() {
		return futbolcuAdi;
	}

	public void setFutbolcuAdi(String futbolcuAdi) {
		this.futbolcuAdi = futbolcuAdi;
	}

	public String getFutbolcuTakim() {
		return futbolcuTakim;
	}

	public void setFutbolcuTakim(String futbolcuTakim) {
		this.futbolcuTakim = futbolcuTakim;
	}

	public int getpenalti() {
		return penalti;
	}

	public void setpenalti(int penalti) {
		this.penalti = penalti;
	}

	public int getSerbestVurus() {
		return serbestVurus;
	}

	public void setSerbestVurus(int serbestVurus) {
		this.serbestVurus = serbestVurus;
	}

	public int getKaleciKarsi() {
		return kaleciKarsi;
	}

	public void setKaleciKarsi(int kaleciKarsi) {
		this.kaleciKarsi = kaleciKarsi;
	}

	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}

	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}

	// Fonksiyonlar
	@Override
	public int sporcuPuaniGoster() {
		// Puanlar kart resmi izerinde yer almaktadir.
		return 0;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

}

package deneme2;

import javax.swing.ImageIcon;

public class Basketbolcu extends Sporcu implements Metotlar {

	//Deðiþkenler
	private String basketbolcuAdi, basketbolcuTakim, dosyayolu;
	private int ikilik, ucluk, serbestAtis, basketbolcuID;
	private boolean kartKullanildiMi;
	private ImageIcon icon=new ImageIcon(dosyayolu);
	
	//Constructors
	public Basketbolcu(String basketbolcuAdi, String basketbolcuTakim, String dosyayolu, int ikilik, int ucluk, int serbestAtis, boolean kartKullanildiMi, int basketbolcuID) {
		super(basketbolcuAdi,basketbolcuTakim,ikilik,ucluk,serbestAtis,dosyayolu,basketbolcuID,kartKullanildiMi);
	}
	public Basketbolcu() {
		super();
	}
	
	//Getters and Setters
	public String getDosyayolu() {
		return dosyayolu;
	}
	public void setDosyayolu(String dosyayolu) {
		this.dosyayolu = dosyayolu;
	}

	public int getBasketbolcuID() {
		return basketbolcuID;
	}
	public void setBasketbolcuID(int basketbolcuID) {
		this.basketbolcuID = basketbolcuID;
	}
	
	public String getBasketbolcuAdi() {
		return basketbolcuAdi;
	}
	public void setBasketbolcuAdi(String basketbolcuAdi) {
		this.basketbolcuAdi = basketbolcuAdi;
	}
	
	public String getBasketbolcuTakim() {
		return basketbolcuTakim;
	}
	public void setBasketbolcuTakim(String basketbolcuTakim) {
		this.basketbolcuTakim = basketbolcuTakim;
	}
	
	public int getIkilik() {
		return ikilik;
	}
	public void setIkilik(int ikilik) {
		this.ikilik = ikilik;
	}

	public int getUcluk() {
		return ucluk;
	}
	public void setUcluk(int ucluk) {
		this.ucluk = ucluk;
	}

	public int getSerbestAtis() {
		return serbestAtis;
	}
	public void setSerbestAtis(int serbestAtis) {
		this.serbestAtis = serbestAtis;
	}

	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}

	//Fonksiyonlar
	@Override
	public int sporcuPuaniGoster() {
		//Puanlar kart resmi üzerinde yer almaktadýr.
		return 0;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
}

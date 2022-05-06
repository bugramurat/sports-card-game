package deneme2;

import java.util.ArrayList;

public class Kullanici extends Oyuncu implements Metotlar2 {

	// Deiiikenler
	private String kullaniciAdi = "Kullanici";
	private int kullaniciID = 1;
	public static ArrayList<Sporcu> kartListesi = new ArrayList<Sporcu>();
	static ArrayList<Integer> kullaniciSkor = new ArrayList<Integer>();

	// Constructors
	public Kullanici(int oyuncuID, String oyuncuAdi, int kullaniciID, String kullaniciAdi,
			ArrayList<Integer> kullaniciSkor, ArrayList<Sporcu> kartListesi) {
		super(oyuncuID, oyuncuAdi, kullaniciSkor, kartListesi);
		this.kullaniciAdi = kullaniciAdi;
		this.kullaniciID = kullaniciID;
		Kullanici.kullaniciSkor = kullaniciSkor;
		Kullanici.kartListesi = kartListesi;
	}

	// Getters and Setters
	public ArrayList<Sporcu> getKartListesi() {
		return kartListesi;
	}

	public void setKartListesi(ArrayList<Sporcu> kartListesi) {
		Kullanici.kartListesi = kartListesi;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public int getKullaniciID() {
		return kullaniciID;
	}

	public void setKullaniciID(int kullaniciID) {
		this.kullaniciID = kullaniciID;
	}

	public ArrayList<Integer> getSkor() {
		return kullaniciSkor;
	}

	public void setSkor(ArrayList<Integer> kullaniciSkor) {
		Kullanici.kullaniciSkor = kullaniciSkor;
	}

	// Fonksiyonlar
	@Override
	public int kartSec() {
		// Kullanici button'lara tiklayarak kart seiiyor
		return 0;
	}

}

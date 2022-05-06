package deneme2;

import java.util.ArrayList;

public abstract class Oyuncu implements Metotlar2 {

	//Deðiþkenler
	private String oyuncuAdi;
	private int oyuncuID;
	private ArrayList<Sporcu> kartListesi=new ArrayList<Sporcu>();
	private ArrayList<Integer> Skor=new ArrayList<Integer>();
	
	//Constructors
	public Oyuncu(int oyuncuID, String oyuncuAdi, ArrayList<Integer> Skor, ArrayList<Sporcu> kartListesi) {
		super();
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
		this.Skor = Skor;
		this.kartListesi = kartListesi;
	}
	public Oyuncu() {
		super();
	}
	
	//Getters and Setters
	public ArrayList<Sporcu> getKartListesi() {
		return kartListesi;
	}
	public void setKartListesi(ArrayList<Sporcu> kartListesi) {
		this.kartListesi = kartListesi;
	}
	
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}

	public int getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(int oyuncuID) {
		this.oyuncuID = oyuncuID;
	}

	public ArrayList<Integer> getSkor() {
		return Skor;
	}
	public void setSkor(ArrayList<Integer> skor) {
		this.Skor = skor;
	}

	//Fonksiyonlar
	public int kartSec(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int skorGoster(int Skor) {
		//Skorlar JFrame kütüphanesindeki label'lar ile sürekli güncelleniyor
		return Skor;
	}
	
}

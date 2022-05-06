package deneme2;

import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu implements Metotlar2 {

	//Deðiþkenler
	private String computerAdi="Bilgisayar";
	private int computerID=0;
	public static ArrayList<Sporcu> kartListesi=new ArrayList<Sporcu>();
	static ArrayList<Integer> computerSkor=new ArrayList<Integer>();
	
	//Constructors
	public Bilgisayar(int oyuncuID, String oyuncuAdi, int computerID, String computerAdi, ArrayList<Integer> computerSkor, ArrayList<Sporcu> kartListesi) {
		super(oyuncuID, oyuncuAdi, computerSkor, kartListesi);
		this.computerID = computerID;
		this.computerAdi = computerAdi;
		Bilgisayar.computerSkor = computerSkor;
		Bilgisayar.kartListesi = kartListesi;
	}

	//Getters and Setters
	public ArrayList<Sporcu> getKartListesi() {
		return kartListesi;
	}
	public void setKartListesi(ArrayList<Sporcu> kartListesi) {
		Bilgisayar.kartListesi = kartListesi;
	}

	public String getComputerAdi() {
		return computerAdi;
	}
	public void setComputerAdi(String computerAdi) {
		this.computerAdi = computerAdi;
	}

	public int getComputerID() {
		return computerID;
	}
	public void setComputerID(int computerID) {
		this.computerID = computerID;
	}

	public ArrayList<Integer> getSkor() {
		return computerSkor;
	}
	public void setComputerSkor(ArrayList<Integer> computerSkor) {
		Bilgisayar.computerSkor = computerSkor;
	}

	//Fonksiyonlar
	@Override
	public int kartSec(int futbolcuMu) {
		int a=0;
		Random r = new Random();
		if(futbolcuMu==1) {
			a=r.nextInt(8);
		}
		else {
			a=8+(r.nextInt(8));
		}
		
		return a;
	}

	@Override
	public int kartSec() {
		// TODO Auto-generated method stub
		return 0;
	}

}

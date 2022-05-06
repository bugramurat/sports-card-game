package deneme2;

import java.util.ArrayList;
import java.util.Random;

public class Test extends Sporcu implements Metotlar3 {

	static void kartDagit(ArrayList<Futbolcu> futbol, ArrayList<Basketbolcu> basket) {
		ArrayList<Integer> uretildi = new ArrayList<>();
		int i = 0, a;

		while (i < 4) {
			Random r = new Random();
			a = r.nextInt(8);
			if (uretildi.contains(a)) {
				continue;
			} else {
				Bilgisayar.kartListesi.add(futbol.get(a));
				uretildi.add(a);
				i = uretildi.size();
			}
		}

		while (i < 8) {
			Random r = new Random();
			a = r.nextInt(8);
			if (uretildi.contains(a)) {
				continue;
			} else {
				Kullanici.kartListesi.add(futbol.get(a));
				uretildi.add(a);
				i = uretildi.size();
			}
		}

		i = 0;
		uretildi.clear();

		while (i < 4) {
			Random r = new Random();
			a = r.nextInt(8);
			if (uretildi.contains(a)) {
				continue;
			} else {
				Bilgisayar.kartListesi.add(basket.get(a));
				uretildi.add(a);
				i = uretildi.size();
			}
		}

		while (i < 8) {
			Random r = new Random();
			a = r.nextInt(8);
			if (uretildi.contains(a)) {
				continue;
			} else {
				Kullanici.kartListesi.add(basket.get(a));
				uretildi.add(a);
				i = uretildi.size();
			}
		}
	}

	// Kartlarin Tanitilmasi
	String sporcuIsim, sporcuTakim, dosyayolu;
	boolean kartKullanildiMi;
	int beceri1, beceri2, beceri3, a = 0, i = 0;

	static String[] paths = { "card_1.png", "card_2.png", "card_3.png", "card_4.png", "card_5.png", "card_6.png",
			"card_7.png", "card_8.png", "card_9.png", "card_10.png", "card_11.png", "card_12.png", "card_13.png",
			"card_14.png", "card_15.png", "card_16.png" };

	static ArrayList<Futbolcu> futbol = new ArrayList<Futbolcu>();
	static ArrayList<Basketbolcu> basket = new ArrayList<Basketbolcu>();
	static Sporcu f1 = new Futbolcu("Cristiano Ronaldo", "Juventus", paths[0], 90, 99, 90, false, 0);
	static Sporcu f2 = new Futbolcu("Lionel Messi", "FC Barcelona", paths[1], 99, 90, 95, false, 1);
	static Sporcu f3 = new Futbolcu("Neymar JR", "Paris Saint-Germain FC", paths[2], 95, 90, 99, false, 2);
	static Sporcu f4 = new Futbolcu("Burak Yilmaz", "Lille OSC", paths[3], 10, 10, 10, false, 3);
	static Sporcu f5 = new Futbolcu("Arjen Robben", "FC Groningen", paths[4], 95, 90, 85, false, 4);
	static Sporcu f6 = new Futbolcu("Thomas Muller", "FC Bayern Minchen", paths[5], 95, 90, 90, false, 5);
	static Sporcu f7 = new Futbolcu("Angel di Maria", "Paris Saint-Germain FC", paths[6], 90, 90, 85, false, 6);
	static Sporcu f8 = new Futbolcu("Antoine Griezmann", "FC Barcelona", paths[7], 99, 85, 90, false, 7);
	static Sporcu b1 = new Basketbolcu("Kobe Bryant", "Los Angeles Lakers", paths[8], 90, 99, 95, false, 8);
	static Sporcu b2 = new Basketbolcu("LeBron James", "Los Angeles Lakers", paths[9], 95, 90, 99, false, 9);
	static Sporcu b3 = new Basketbolcu("Michael Jordan", "Chicago Bulls", paths[10], 99, 90, 95, false, 10);
	static Sporcu b4 = new Basketbolcu("Magic Johnson", "Los Angeles Lakers", paths[11], 90, 99, 85, false, 11);
	static Sporcu b5 = new Basketbolcu("Shaquille O'Neal", "Los Angeles Lakers", paths[12], 85, 95, 95, false, 12);
	static Sporcu b6 = new Basketbolcu("Larry Bird", "Boston Celtics", paths[13], 95, 85, 90, false, 13);
	static Sporcu b7 = new Basketbolcu("Luka Doncic", "Dallas Mavericks", paths[14], 80, 90, 95, false, 14);
	static Sporcu b8 = new Basketbolcu("Nikola Jokic", "Denver Nuggets", paths[15], 90, 85, 90, false, 15);

	public static void main(String[] args) {
		futbol.add((Futbolcu) f1);
		futbol.add((Futbolcu) f2);
		futbol.add((Futbolcu) f3);
		futbol.add((Futbolcu) f4);
		futbol.add((Futbolcu) f5);
		futbol.add((Futbolcu) f6);
		futbol.add((Futbolcu) f7);
		futbol.add((Futbolcu) f8);
		basket.add((Basketbolcu) b1);
		basket.add((Basketbolcu) b2);
		basket.add((Basketbolcu) b3);
		basket.add((Basketbolcu) b4);
		basket.add((Basketbolcu) b5);
		basket.add((Basketbolcu) b6);
		basket.add((Basketbolcu) b7);
		basket.add((Basketbolcu) b8);

		// Skorlarin null olmamasi iiin 0 ataniyor
		Kullanici.kullaniciSkor.add(0);
		Bilgisayar.computerSkor.add(0);

		// Kartlar daiitiliyor
		kartDagit(futbol, basket);

		// Arayiz tasarim kitiphanesi aiiliyor
		AnaMenu menu = new AnaMenu();
		menu.setVisible(true);
	}

	public static int bilgisayarKartSeciyor(int futbolcuMu) {
		int i = 0, b = 0;
		ArrayList<Integer> computerSkor = new ArrayList<Integer>();

		Bilgisayar hesap = new Bilgisayar(0, "Bilgisayar", 0, "Bilgisayar", computerSkor, Bilgisayar.kartListesi);

		while (b < 1) {
			if (futbolcuMu == 1) {
				i = hesap.kartSec(1);
			} else {
				i = hesap.kartSec(0);
			}

			for (Sporcu bilgisayar : Bilgisayar.kartListesi) {
				if (i == bilgisayar.getSporcuID()) {
					if (bilgisayar.isKartKullanildiMi()) {
						b = 0;
					} else {
						bilgisayar.setKartKullanildiMi(true);
						return i;
					}
				} else {
					b = 0;
				}
			}
		}
		return i;
	}

	@Override
	public void kartDagit() {
		// TODO Auto-generated method stub

	}

}

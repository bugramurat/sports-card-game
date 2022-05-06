package deneme2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class AnaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaMenu frame = new AnaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void clickingButton(int buttonID, ArrayList<JButton> buttonList) {
		buttonList.get(buttonID).setBounds(555, 340, 96, 132);
		for (Sporcu kullanici : Kullanici.kartListesi) {
			if (kullanici.getSporcuID() == buttonID) {
				kullanici.setKartKullanildiMi(true);
			}
		}
		buttonList.get(buttonID).setEnabled(false);
	}

	/**
	 * Create the frame.
	 */
	public AnaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final ArrayList<Integer> buttonCheckKullanici = new ArrayList<>();
		final ArrayList<Integer> buttonCheckBilgisayar = new ArrayList<>();
		final int[] karsilastir = new int[1];
		final int[] kullaniciKartSecsin = new int[1];
		kullaniciKartSecsin[0] = 1;
		final int[] pcHangiKart = new int[1];
		pcHangiKart[0] = 0;

		final JButton nextBUTTON = new JButton("");
		nextBUTTON.setIcon(new ImageIcon(getClass().getClassLoader().getResource("button.png")));
		nextBUTTON.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("button.png")));
		nextBUTTON.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("buttonSELECTED.png")));

		// Kartlarin Buttonlara Baðlanmasi
		final int i[] = new int[1];
		i[0] = 0;
		final ArrayList<JButton> buttonList = new ArrayList<>();
		final String[] paths = { "card_1.png", "card_2.png", "card_3.png", "card_4.png", "card_5.png", "card_6.png",
				"card_7.png", "card_8.png", "card_9.png", "card_10.png", "card_11.png", "card_12.png", "card_13.png",
				"card_14.png", "card_15.png", "card_16.png" };
		for (i[0] = 0; i[0] < 16; i[0]++) {
			ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource(paths[i[0]]));
			ImageIcon disabledImage = new ImageIcon(getClass().getClassLoader().getResource("cardback.png"));
			final JButton button = new JButton(image);
			button.setDisabledIcon(disabledImage);
			if (i[0] < 8) {
				button.setBounds(130 + (i[0] * 120), 67, 96, 132);
			} else {
				button.setBounds(130 + ((i[0] - 8) * 120), 226, 96, 132);
			}
			contentPane.add(button);
			button.setVisible(false);
			button.setEnabled(false);
			buttonList.add(button);
		}

		// Kullanicinin Kart Seçmesi (Button Clicks)
		buttonList.get(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(0) && kullaniciKartSecsin[0] == 1) {
					clickingButton(0, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(1).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(1) && kullaniciKartSecsin[0] == 1) {
					clickingButton(1, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(2).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(2) && kullaniciKartSecsin[0] == 1) {
					clickingButton(2, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(3).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(3) && kullaniciKartSecsin[0] == 1) {
					clickingButton(3, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(4).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(4) && kullaniciKartSecsin[0] == 1) {
					clickingButton(4, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(5).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(5) && kullaniciKartSecsin[0] == 1) {
					clickingButton(5, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(6).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(6) && kullaniciKartSecsin[0] == 1) {
					clickingButton(6, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(7).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(7) && kullaniciKartSecsin[0] == 1) {
					clickingButton(7, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(1);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(8).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(8) && kullaniciKartSecsin[0] == 1) {
					clickingButton(8, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(9).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(9) && kullaniciKartSecsin[0] == 1) {
					clickingButton(9, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(10).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(10) && kullaniciKartSecsin[0] == 1) {
					clickingButton(10, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(11).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(11) && kullaniciKartSecsin[0] == 1) {
					clickingButton(11, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(12).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(12) && kullaniciKartSecsin[0] == 1) {
					clickingButton(12, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(13).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(13) && kullaniciKartSecsin[0] == 1) {
					clickingButton(13, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(14).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(14) && kullaniciKartSecsin[0] == 1) {
					clickingButton(14, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});
		buttonList.get(15).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonCheckKullanici.contains(15) && kullaniciKartSecsin[0] == 1) {
					clickingButton(15, buttonList);
				}

				pcHangiKart[0] = Test.bilgisayarKartSeciyor(0);
				nextBUTTON.setEnabled(true);
				karsilastir[0] = 1;
				kullaniciKartSecsin[0] = 0;
			}
		});

		final int[] nextTour = new int[1];
		nextTour[0] = 0;
		final int[] pcSkor = new int[2];
		pcSkor[0] = 0;
		final int[] plyrSkor = new int[2];
		plyrSkor[0] = 0;
		final int[] finished = new int[1];
		finished[0] = 0;

		final JLabel computerSkor = new JLabel("Bilgisayar " + String.valueOf(pcSkor[0]));
		computerSkor.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		computerSkor.setForeground(Color.WHITE);
		computerSkor.setBounds(928, 143, 183, 49);
		contentPane.add(computerSkor);
		computerSkor.setVisible(false);

		final JLabel playerSkor = new JLabel("Kullanici " + String.valueOf(plyrSkor[0]));
		playerSkor.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		playerSkor.setForeground(Color.WHITE);
		playerSkor.setBounds(928, 457, 168, 39);
		contentPane.add(playerSkor);
		playerSkor.setVisible(false);

		final JLabel oyunSonu = new JLabel("New label");
		oyunSonu.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		oyunSonu.setForeground(Color.WHITE);
		oyunSonu.setBounds(490, 280, 255, 39);
		contentPane.add(oyunSonu);
		oyunSonu.setVisible(false);

		final JLabel selectedSkill = new JLabel("New label");
		selectedSkill.setFont(new Font("Tw Cen MT", Font.ITALIC, 30));
		selectedSkill.setForeground(Color.WHITE);
		selectedSkill.setBounds(107, 275, 311, 49);
		contentPane.add(selectedSkill);
		selectedSkill.setVisible(false);

		final JLabel winScore = new JLabel("New label");
		winScore.setVerticalAlignment(SwingConstants.TOP);
		winScore.setForeground(Color.WHITE);
		winScore.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		winScore.setBounds(107, 344, 496, 39);
		contentPane.add(winScore);
		winScore.setVisible(false);

		final JLabel winScore2 = new JLabel("New label");
		winScore2.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		winScore2.setForeground(Color.WHITE);
		winScore2.setBounds(107, 378, 368, 33);
		contentPane.add(winScore2);
		winScore2.setVisible(false);

		JLabel by = new JLabel("by lemonperi");
		by.setHorizontalAlignment(SwingConstants.CENTER);
		by.setForeground(new Color(255, 0, 255));
		by.setFont(new Font("Century Gothic", Font.ITALIC, 14));
		by.setBounds(27, 554, 147, 49);
		contentPane.add(by);

		final JLabel namePc = new JLabel("New label");
		namePc.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		namePc.setForeground(Color.WHITE);
		namePc.setBounds(700, 202, 255, 33);
		contentPane.add(namePc);
		namePc.setVisible(false);

		final JLabel teamPc = new JLabel("New label");
		teamPc.setForeground(Color.WHITE);
		teamPc.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		teamPc.setBounds(700, 223, 255, 33);
		contentPane.add(teamPc);
		teamPc.setVisible(false);

		final JLabel namePlyr = new JLabel("New label");
		namePlyr.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		namePlyr.setForeground(Color.WHITE);
		namePlyr.setBounds(700, 345, 255, 33);
		contentPane.add(namePlyr);
		namePlyr.setVisible(false);

		final JLabel teamPlyr = new JLabel("New label");
		teamPlyr.setForeground(Color.WHITE);
		teamPlyr.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		teamPlyr.setBounds(700, 366, 255, 33);
		contentPane.add(teamPlyr);
		teamPlyr.setVisible(false);

		final JLabel up = new JLabel("\u039B");
		up.setFont(new Font("Arial", Font.BOLD, 30));
		up.setForeground(Color.GREEN);
		contentPane.add(up);
		up.setVisible(false);

		nextBUTTON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nextTour[0] == 0) {
					selectedSkill.setVisible(false);
					winScore.setVisible(false);
					winScore2.setVisible(false);

					namePc.setVisible(false);
					teamPc.setVisible(false);
					namePlyr.setVisible(false);
					teamPlyr.setVisible(false);

					computerSkor.setVisible(true);
					playerSkor.setVisible(true);
					up.setVisible(false);

					// Oyuncularin Kartlarinin Dizilmesi
					for (i[0] = 0; i[0] < 16; i[0]++) {
						for (Sporcu kullanici : Kullanici.kartListesi) {
							if (i[0] == kullanici.getSporcuID()) {
								if (kullanici.isKartKullanildiMi()) {
									buttonList.get(i[0]).setVisible(false);
								} else {
									buttonList.get(i[0]).setBounds(60 + (buttonCheckKullanici.size() * 100), 500, 96,
											132);
									ImageIcon image = new ImageIcon(
											getClass().getClassLoader().getResource(paths[i[0]]));
									buttonList.get(i[0]).setDisabledIcon(image);
									buttonList.get(i[0]).setEnabled(true);
									buttonCheckKullanici.add(i[0]);
								}
							}
						}
						for (Sporcu bilgisayar : Bilgisayar.kartListesi) {
							if (i[0] == bilgisayar.getSporcuID()) {
								if (bilgisayar.isKartKullanildiMi()) {
									buttonList.get(i[0]).setVisible(false);
								} else {
									buttonList.get(i[0]).setBounds(60 + (buttonCheckBilgisayar.size() * 100), 30, 96,
											132);
									buttonCheckBilgisayar.add(i[0]);
								}
							}
						}
					}

					nextTour[0] = 1;
					nextBUTTON.setBounds(950, 278, 100, 80);
					if (finished[0] == 8) {
						nextBUTTON.setEnabled(true);
					} else {
						nextBUTTON.setEnabled(false);
					}
				} else if (karsilastir[0] == 1) {

					for (i[0] = 0; i[0] < 16; i[0]++) {
						if (pcHangiKart[0] == i[0]) {
							buttonList.get(i[0]).setBounds(555, 195, 96, 132);
							ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource(paths[i[0]]));
							buttonList.get(i[0]).setDisabledIcon(image);
						}
					}

					int a = 0, b = 0, tutSkor = 0, esitMi = 0;
					combat: {
						while (a < 1) {
							for (Sporcu bilgisayar : Bilgisayar.kartListesi) {
								if (bilgisayar.isKartKullanildiMi()
										&& buttonCheckBilgisayar.contains(bilgisayar.getSporcuID())) {
									for (Sporcu kullanici : Kullanici.kartListesi) {
										if (kullanici.isKartKullanildiMi()
												&& buttonCheckKullanici.contains(kullanici.getSporcuID())) {
											Random s = new Random();
											b = s.nextInt(3);
											namePc.setText(bilgisayar.getSporcuIsim());
											teamPc.setText(bilgisayar.getSporcuTakim());
											namePlyr.setText(kullanici.getSporcuIsim());
											teamPlyr.setText(kullanici.getSporcuTakim());
											namePc.setVisible(true);
											teamPc.setVisible(true);
											namePlyr.setVisible(true);
											teamPlyr.setVisible(true);
											if (b == 0) {
												winScore2.setVisible(false);
												winScore.setVisible(true);
												selectedSkill.setVisible(true);
												selectedSkill.setText("seçilen beceri -1-");
												if (bilgisayar.getBeceri1() > kullanici.getBeceri1()) {

													winScore.setForeground(Color.RED);
													winScore.setText("Bilgisayar eli kazandi");

													if (Bilgisayar.computerSkor.size() > 0) {
														tutSkor = Bilgisayar.computerSkor.get(0);
													} else {
														Bilgisayar.computerSkor.add(pcSkor[0]);
														tutSkor = Bilgisayar.computerSkor.get(0);
													}

													Bilgisayar.computerSkor.set(0, tutSkor + 10);
													a++;
													break combat;
												} else if (bilgisayar.getBeceri1() < kullanici.getBeceri1()) {

													winScore.setForeground(Color.GREEN);
													winScore.setText("Kullanici eli kazandi");

													if (Kullanici.kullaniciSkor.size() > 0) {
														tutSkor = Kullanici.kullaniciSkor.get(0);
													} else {
														Kullanici.kullaniciSkor.add(plyrSkor[0]);
														tutSkor = Kullanici.kullaniciSkor.get(0);
													}

													Kullanici.kullaniciSkor.set(0, tutSkor + 10);
													a++;
													break combat;
												} else {
													winScore.setForeground(Color.WHITE);
													winScore.setText("El berabere,");
													winScore2.setVisible(true);
													winScore2.setText("yeniden rastgele beceri seçiyoruz...");

													esitMi = 1;
													a++;
													break combat;
												}
											} else if (b == 1) {
												winScore2.setVisible(false);
												winScore.setVisible(true);
												selectedSkill.setVisible(true);
												selectedSkill.setText("seçilen beceri -2-");
												if (bilgisayar.getBeceri2() > kullanici.getBeceri2()) {

													winScore.setForeground(Color.RED);
													winScore.setText("Bilgisayar eli kazandi");

													if (Bilgisayar.computerSkor.size() > 0) {
														tutSkor = Bilgisayar.computerSkor.get(0);
													} else {
														Bilgisayar.computerSkor.add(pcSkor[0]);
														tutSkor = Bilgisayar.computerSkor.get(0);
													}

													Bilgisayar.computerSkor.set(0, tutSkor + 10);
													a++;
													break combat;
												} else if (bilgisayar.getBeceri2() < kullanici.getBeceri2()) {

													winScore.setForeground(Color.GREEN);
													winScore.setText("Kullanici eli kazandi");

													if (Kullanici.kullaniciSkor.size() > 0) {
														tutSkor = Kullanici.kullaniciSkor.get(0);
													} else {
														Kullanici.kullaniciSkor.add(plyrSkor[0]);
														tutSkor = Kullanici.kullaniciSkor.get(0);
													}

													Kullanici.kullaniciSkor.set(0, tutSkor + 10);
													a++;
													break combat;
												} else {
													winScore.setForeground(Color.WHITE);
													winScore.setText("El berabere,");
													winScore2.setVisible(true);
													winScore2.setText("yeniden rastgele beceri seçiyoruz...");

													esitMi = 1;
													a++;
													break combat;
												}
											} else if (b == 2) {
												winScore2.setVisible(false);
												winScore.setVisible(true);
												selectedSkill.setVisible(true);
												selectedSkill.setText("seçilen beceri -3-");
												if (bilgisayar.getBeceri3() > kullanici.getBeceri3()) {

													winScore.setForeground(Color.RED);
													winScore.setText("Bilgisayar eli kazandi");

													if (Bilgisayar.computerSkor.size() > 0) {
														tutSkor = Bilgisayar.computerSkor.get(0);
													} else {
														Bilgisayar.computerSkor.add(pcSkor[0]);
														tutSkor = Bilgisayar.computerSkor.get(0);
													}

													Bilgisayar.computerSkor.set(0, tutSkor + 10);
													a++;
													break combat;
												} else if (bilgisayar.getBeceri3() < kullanici.getBeceri3()) {

													winScore.setForeground(Color.GREEN);
													winScore.setText("Kullanici eli kazandi");

													if (Kullanici.kullaniciSkor.size() > 0) {
														tutSkor = Kullanici.kullaniciSkor.get(0);
													} else {
														Kullanici.kullaniciSkor.add(plyrSkor[0]);
														tutSkor = Kullanici.kullaniciSkor.get(0);
													}

													Kullanici.kullaniciSkor.set(0, tutSkor + 10);
													a++;
													break combat;
												} else {

													winScore.setForeground(Color.WHITE);
													winScore.setText("El berabere,");
													winScore2.setVisible(true);
													winScore2.setText("yeniden rastgele beceri seçiyoruz...");

													esitMi = 1;
													a++;
													break combat;
												}
											}
										}
									}
								}
							}
						}
					}

					if (esitMi == 0) {
						if (Bilgisayar.computerSkor.size() > 0) {
							pcSkor[0] = Bilgisayar.computerSkor.get(0);
						} else {
							Bilgisayar.computerSkor.add(pcSkor[0]);
							pcSkor[0] = Bilgisayar.computerSkor.get(0);
						}
						if (Kullanici.kullaniciSkor.size() > 0) {
							plyrSkor[0] = Kullanici.kullaniciSkor.get(0);
						} else {
							Kullanici.kullaniciSkor.add(plyrSkor[0]);
							plyrSkor[0] = Kullanici.kullaniciSkor.get(0);
						}
						if (winScore.getForeground() == Color.RED) {
							up.setVisible(true);
							up.setBounds(1095, 148, 54, 39);
						} else if (winScore.getForeground() == Color.GREEN) {
							up.setVisible(true);
							up.setBounds(1065, 457, 54, 39);
						}
						computerSkor.setText("Bilgisayar " + String.valueOf(pcSkor[0]));
						playerSkor.setText("Oyuncu " + String.valueOf(plyrSkor[0]));

						buttonCheckBilgisayar.clear();
						buttonCheckKullanici.clear();

						karsilastir[0] = 0;
						kullaniciKartSecsin[0] = 1;
						nextTour[0] = 0;
						finished[0]++;
					} else {
						esitMi = 0;
					}

				} else if (finished[0] == 8) {
					oyunSonu.setVisible(true);
					if (Bilgisayar.computerSkor.get(0) > Kullanici.kullaniciSkor.get(0)) {
						oyunSonu.setText("Bilgisayar kazandi.");
					} else if (Bilgisayar.computerSkor.get(0) < Kullanici.kullaniciSkor.get(0)) {
						oyunSonu.setText("Kullanici kazandi.");
					} else {
						oyunSonu.setText("Berabere sonlandi.");
					}
					nextBUTTON.setVisible(false);
					playerSkor.setVisible(false);
					computerSkor.setVisible(false);
					up.setVisible(false);
					final int renk[] = new int[1];
					renk[0] = 0;
					Timer timer = null;
					timer = new Timer(100, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (renk[0] % 7 == 0) {
								oyunSonu.setForeground(Color.RED);
							}
							if (renk[0] % 7 == 1) {
								oyunSonu.setForeground(Color.ORANGE);
							}
							if (renk[0] % 7 == 2) {
								oyunSonu.setForeground(Color.YELLOW);
							}
							if (renk[0] % 7 == 3) {
								oyunSonu.setForeground(Color.GREEN);
							}
							if (renk[0] % 7 == 4) {
								oyunSonu.setForeground(Color.BLUE);
							}
							if (renk[0] % 7 == 5) {
								oyunSonu.setForeground(Color.MAGENTA);
							}
							if (renk[0] % 7 == 6) {
								oyunSonu.setForeground(Color.getHSBColor(255, 105, 180));
							}
							renk[0]++;
						}
					});
					timer.start();
				}

			}
		});
		nextBUTTON.setBounds(551, 455, 100, 80);
		contentPane.add(nextBUTTON);
		nextBUTTON.setVisible(false);

		final JButton start = new JButton("");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setVisible(false);

				for (i[0] = 0; i[0] < 16; i[0]++) {
					buttonList.get(i[0]).setVisible(true);
				}

				nextBUTTON.setVisible(true);
			}
		});
		start.setIcon(new ImageIcon(getClass().getClassLoader().getResource("start.png")));
		start.setBounds(475, 368, 240, 120);
		contentPane.add(start);

		JLabel anamenu = new JLabel("");
		anamenu.setIcon(new ImageIcon(getClass().getClassLoader().getResource("anamenu.png")));
		anamenu.setBounds(0, 0, 1200, 725);
		contentPane.add(anamenu);
	}
}

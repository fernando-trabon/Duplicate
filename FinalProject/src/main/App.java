package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import main.player.exeptions.CardException;
import main.playingObject.Table;

public class App {

	public static void main(String[] args) {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		Table table = new Table();

		while ((!table.getCardDeck().getCardDeck().isEmpty())
				&& ((!table.getPc().getMyCards().isEmpty()) || (!table.getUser().getMyCards().isEmpty()))) {

			if (table.isWhoMove()) {
				int lich = 0;

				while (lich < 6) {

					lich++;
					System.out.println("-----------------------------------------------------");
					try {
						table.getUser().action(table, sc);

					} catch (IOException | CardException e) {
						System.err.println(e);
					}

					try {
						if (table.getPc().action(table, sc)) {

							table.clearWorkingField();

							table.setWhoMove(!table.isWhoMove());
							break;
						} else {
							continue;
						}
					} catch (CardException e) {
						System.err.println(e);
					}
				}
				table.moveToTrash();

				table.setWhoMove(!table.isWhoMove());
				table.draw();
				System.out.println("-----------------------------------------------------");

			} else {
				int lich = 0;

				while (lich < 6) {
					lich++;
					System.out.println("-----------------------------------------------------");

					try {
						if (!table.getPc().action(table, sc)) {
							break;
						}else {
							continue;
						}
					} catch (CardException e) {
						System.err.println(e);
					}

					try {
						table.getUser().action(table, sc);
					} catch (IOException | CardException e) {
						System.err.println(e);
					}

				}

				table.moveToTrash();
				table.setWhoMove(!table.isWhoMove());

				table.draw();
				System.out.println("-----------------------------------------------------");
			}
		}

		if (table.getPc().getMyCards().isEmpty()) {
			System.out.println("PC - WIN");
		} else {
			System.out.println("User - WIN");
		}
	}

}

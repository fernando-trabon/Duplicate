package main.player;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import main.player.exeptions.CardException;
import main.playingObject.Card;
import main.playingObject.Table;

public class User extends Player {

	public User(List<Card> inputCardSet) {
//		this.myCards.addAll(inputCardSet);
		this.setMyCards(inputCardSet);
	}

	public boolean action(Table table, BufferedReader sc) throws IOException, CardException {

		String pattern = "[0-9]{1,2}";

		Pattern p = Pattern.compile(pattern);

		String command = "    ";
		boolean actionFailed = true;

		while ((command.equals("    ")) 
				|| ((!command.substring(0, 4).equalsIgnoreCase("put "))
						&& (!command.substring(0, 4).equalsIgnoreCase("take"))
						&& (!command.substring(0, 4).equalsIgnoreCase("pass")))) {

			System.out.println(table);
			System.out.println("------------------------------------------------------");
			System.out.println("Type PUT to launch putting the card on the table, then write id of card you want to interact with.");
			System.out.println("For example: Put 22. Mean put on the table card with id 22.");
			System.out.println("Type TAKE to take cards from the working area, in case you havent other choise.");
			System.out.println("Type PASS to finist atacking player, in case you havent other choise.");
			System.out.println("The entered command is independent of the register.");
			System.out.println("------------------------------------------------------");
			System.out.println("Enter command");

			command = sc.readLine();

			if (command.length() < 4) {
				command = "    ";
			}

			if ((command.equals("    ")) || ((!command.substring(0, 4).equalsIgnoreCase("put "))
					&& (!command.substring(0, 4).equalsIgnoreCase("take"))
					&& (!command.substring(0, 4).equalsIgnoreCase("pass")))) {
				System.out.println("Unknown command");
			}
		}
		System.out.println("------------------------------------------------------");
		

		if (command.substring(0, 4).equalsIgnoreCase("put ")) {
			
			Matcher m = p.matcher(command.toLowerCase());
			m.find();
			
			int idCardOfInterest = Integer.parseInt(command.substring(m.start(), m.end()));
			
			putCardToTable(table, table.isWhoMove(), idCardOfInterest);
//			Act to put some card;
			actionFailed = false;
		} else {
			if (command.substring(0, 4).equalsIgnoreCase("take")) {

				takeCardFromTable(table);
				table.draw();
//				Act to take cards from working area on the table
				actionFailed = false;
			} else {
				if (command.substring(0, 4).equalsIgnoreCase("pass")) {
					actionFailed = true;
//					Act to pass the current attack
				}
			}
		}

		return actionFailed;
		// Here is finish of the move from user
	}

	private void putCardToTable(Table table, boolean whoMove, int idCardOfInterest) throws CardException {
		Card c = new Card(idCardOfInterest);
		boolean contain = false;
		int index = 0;
		for (int i = 0; i<this.myCards.size(); i++) {
			if (myCards.get(i).getId() == idCardOfInterest) {
				contain = true;
				index = i;
			}
		}
		if (contain) {
		if (!whoMove) {
			int i = table.getWorkingField().size() -1;
			
			if (i<0) {
				i = 0;
			}
			
			if (!table.getWorkingField().get(i).isBeaten()) {
				c = getMyCards().get(index);
				table.getWorkingField().get(i).setBeatenByCard(c);
				myCards.remove(index);
			}
		} else {
			c = getMyCards().get(index);
			table.addWorkingField(c);
			myCards.remove(index);
		}
		
		}else {
			throw new CardException("There is no card you specified among yours cards");
		}
	}

	private void takeCardFromTable(Table table) throws CardException{
		if (!table.getWorkingField().isEmpty()) {
				for (Card card : table.getWorkingField()) {
					getMyCards().add(card);
					if (card.isBeaten()) {
						getMyCards().add(card.getBeatenByCard());
					}
				}
			table.clearWorkingField();
		}else {
			throw new CardException("Working area is empty");
		}
	}

	

	
}

package main.player;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.player.exeptions.CardException;
import main.playingObject.Card;
import main.playingObject.Table;
import main.playingObject.CardValues;

public class PC extends Player {

	public PC(List<Card> inputCardSet) {
		this.setMyCards(inputCardSet);

	}

	public boolean action(Table table, BufferedReader sc) throws CardException {

		boolean actionFailed = true;

		List<Card> tmpCardsList = table.getWorkingField();

		if (table.isWhoMove()) {
			System.out.println("Defence");

			if (!tmpCardsList.get(tmpCardsList.size() - 1).isBeaten()) {
				int indexOfInterest = tmpCardsList.size() - 1;
				for (int i = 0; i<table.getWorkingField().size(); i++) {
					if (!table.getWorkingField().get(i).isBeaten()) {
						indexOfInterest = i;
					}
				}
				
				int trumpSign = table.getTrumpSign();
				List<Card> tmpListCardsBeatenBy = tmpCardsList.get(indexOfInterest).beatsByCards(trumpSign);
				
				System.out.println(tmpListCardsBeatenBy);
				
				Set<Card> tmp = new HashSet<Card>();
				
				for (int i = 0; i<tmpListCardsBeatenBy.size(); i++) {
					for (int j = 0; j<this.myCards.size(); j++) {
						if (tmpListCardsBeatenBy.get(i).getId() == this.myCards.get(j).getId()) {
							tmp.add(new Card(tmpListCardsBeatenBy.get(i).getId()));
						}
					}
					
				}
				
				tmpListCardsBeatenBy.clear();
				tmpListCardsBeatenBy = new ArrayList<Card>(tmp);
				
				System.out.println(tmpListCardsBeatenBy);
				
				if (tmpListCardsBeatenBy.isEmpty()) {
					takeCardFromTable(table);
					System.out.println("PC: I have no choise");
					actionFailed = true;
				} else {
					Card card = cardWithSmallestID(tmpListCardsBeatenBy);
					tmpCardsList.get(indexOfInterest).setBeatenByCard(card);
					tmpCardsList.get(indexOfInterest).setBeaten();
					actionFailed = false;
					myCards.remove(card);
					System.out.println("PC: I put " + card);
				}
			}
			// pc deffence
		} else {
			System.out.println("Atack");

			if (tmpCardsList.isEmpty()) {
				Card card = chooseCardForFirstMoove(table);

				tmpCardsList.add(card);
				System.out.println("PC: I put " + card);
				List<Card> tmpList = new ArrayList<Card>();
				
				for (Card c : myCards) {
					if (card.getId() != c.getId()) {
						tmpList.add(c);
					}
				}

				myCards.clear();
				myCards = tmpList;

				actionFailed = false;
				
			} else {
				List<Card> temporary = setOfSuitableCards(table);
				temporary.retainAll(myCards);
				if (temporary.isEmpty()) {
					actionFailed = true;
				} else {
					Card tmp = cardWithSmallestID(temporary);
					tmpCardsList.add(tmp);
					myCards.remove(tmp);
				}
			}
			// pc attack
		}
		table.clearWorkingField();
		table.setWorkingField(tmpCardsList);

		return actionFailed;
	}

	private Card cardWithSmallestID(List<Card> inputList) {
		int minId = inputList.get(0).getId();
		for (int i = 0; i < inputList.size(); i++) {
			if (inputList.get(i).getId() < minId) {
				minId = inputList.get(i).getId();
			}
		}
		return new Card(minId);
	}

	private Card chooseCardForFirstMoove(Table table) {

		Card card;
		int min = myCards.get(0).getId();

		for (int i = 0; i < myCards.size(); i++) {
			if ((min > myCards.get(i).getId()) && (myCards.get(i).getId() % 4 != table.getTrumpSign())) {
				min = myCards.get(i).getId();
			}
		}

		card = new Card(min);
		myCards.remove(card);
		return card;
	}

	private List<Card> setOfSuitableCards(Table table) {
		List<Card> tmpCardSet = table.getWorkingField();
		Set<CardValues> tmpCardValuesSet = setOfValues(table.getWorkingField());

		Card tmpCard;
		
//		Set<Integer> idDoNotToUse = new HashSet<Integer>();
//		
//		for (Card card : tmpCardSet) {
//			idDoNotToUse.add(card.getId());
//			if (card.isBeaten()) {
//				idDoNotToUse.add(card.getBeatenByCard().getId());
//			}
//		}

		for (int i = 0; i < 36; i++) {
			tmpCard = new Card(i);
			
			boolean contain = true;
			for (Card card : this.myCards) {
				if (card.getId() == i) {
					contain = false;
				}
			}
			
			if ((!contain)&&(tmpCardValuesSet.contains(tmpCard.getCardValue()))) {
				tmpCardSet.add(tmpCard);
			}
		}

		return tmpCardSet;
	}

	private Set<CardValues> setOfValues(List<Card> inputList) {
		Set<CardValues> tmp = new HashSet<CardValues>();

		for (Card card : inputList) {
			tmp.add(card.getCardValue());
			if (card.isBeaten()) {
				tmp.add(card.getBeatenByCard().getCardValue());
			}
		}
		return tmp;
	}

	private void takeCardFromTable(Table table) throws CardException {
		if (!table.getWorkingField().isEmpty()) {
			for (Card card : table.getWorkingField()) {
				getMyCards().add(card);
				if (card.isBeaten()) {
					getMyCards().add(card.getBeatenByCard());
				}
			}
			table.clearWorkingField();
		} else {
			throw new CardException("Working area is empty");
		}
	}
}

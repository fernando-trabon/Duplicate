package main.player;

import java.util.List;

import main.playingObject.Card;
import main.playingObject.interfaces.PlayerInterface;

public abstract class Player implements PlayerInterface{
	protected List<Card> myCards;

	public List<Card> getMyCards() {
		return myCards;
	}

	public void setMyCards(List<Card> myInputCards) {
		this.myCards = myInputCards;
	}

	public void addCards(Card cardToBeAdded) {
		myCards.add(cardToBeAdded);
	}

	@Override
	public String toString() {
		StringBuilder tmp = new StringBuilder("Cards[");

		for (int i = 0; i < myCards.size(); i++) {
			tmp.append(myCards.get(i) + "; ");
		}

		tmp.append("]");

		return tmp.toString();
	}
	public boolean action() {
		return true;
	};
}

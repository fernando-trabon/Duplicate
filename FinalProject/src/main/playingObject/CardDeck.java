
package main.playingObject;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import main.playingObject.interfaces.CardDeckInterface;

/**
 * A class that describes a card deck
 * 
 * @version 1.0 6 November 2017
 * @author Alex
 *
 */

public class CardDeck implements CardDeckInterface {

	/** Variable that contain all card deck after it`s creating */
	private ArrayList<Card> cardDeck;
	/** Variable that serve to hold type of card which is trump */
	private int trumpSignature;

	/**
	 * Getter to the field trumpSignature
	 * 
	 * @return trump sign
	 */
	public int getTrumpSignature() {
		return trumpSignature;
	}

	/**
	 * Getter to the field cardDeck
	 * 
	 * @return Card deck
	 */
	public ArrayList<Card> getCardDeck() {
		return cardDeck;
	}

	/**
	 * Setter to the field cardDeck. It is needless during the game time. Using only
	 * for tests
	 * 
	 * @param getCardDeck
	 */
	public void setCardDeck(ArrayList<Card> getCardDeck) {
		this.cardDeck = getCardDeck;
	}

	/**
	 * Constructor to the class CardDeck. Creates a set cardDeck in a random manner
	 */
	public CardDeck() {
		List<Card> cards = new ArrayList<Card>();

		for (int i = 0; i < 36; i++) {
			cards.add(new Card(i));
		}

		this.cardDeck = new ArrayList<Card>();
		int itemOfInterest;

		Random random = new Random();

		for (int i = 0; i < 36; i++) {
			itemOfInterest = random.nextInt(cards.size());
			cardDeck.add(cards.get(itemOfInterest));
			cards.remove(cards.get(itemOfInterest));
		}

		trumpSignature = cardDeck.get(cardDeck.size() - 1).getId() % 4;

	}

	/**
	 * Method to receive next card from the card deck, also removing this card from
	 * the card deck
	 * 
	 * 
	 * @return card
	 */
	@Override
	public Card getNextCard() {
		Card tmp = cardDeck.get(0);
		cardDeck.remove(tmp);

		return tmp;
	}

	/**
	 * Method to check if card deck is already empty
	 * 
	 * @return true - if card deck is empty
	 */
	@Override
	public boolean isEmpty() {
		return cardDeck.size() == 0;
	}
}

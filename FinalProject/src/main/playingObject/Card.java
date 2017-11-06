
package main.playingObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that describes a gambling card
 * 
 * @version 1.0 6 November 2017
 * @author Alex
 *
 */

public class Card {

	/**
	 * Variable that describes id of a separate game card. Used for further
	 * operations in this class and beyond
	 */
	private int id;
	/** Variable that describes type of a separate game card using enum */
	private CardTypes cardType;
	/** Variable that describes value of a separate game card using enum */
	private CardValues cardValue;
	/** Variable that describes if the separate game card was beaten */
	private boolean beaten;
	/** Variable that contain a game card that beaten this one */
	private Card beatenByCard;

	/**
	 * Getter to the field id
	 * 
	 * @return id of card (return int)
	 */
	public int getId() {
		return id;
	}

	/**
	 * Getter to the field cardType
	 * 
	 * @return enum CardType
	 */
	public CardTypes getCardType() {
		return cardType;
	}

	/**
	 * Getter to the field cardValue
	 * 
	 * @return enum CardValue
	 */
	public CardValues getCardValue() {
		return cardValue;
	}

	/**
	 * Getter to the field beaten
	 * 
	 * @return true - if card was beaten
	 */
	public boolean isBeaten() {
		return beaten;
	}

	/**
	 * Setter to the field. Set field beaten to true
	 */
	public void setBeaten() {
		this.beaten = true;
	}

	/**
	 * Getter to the field beatenByCard
	 * 
	 * @return Card - which contain in the field beatenByCard
	 */
	public Card getBeatenByCard() {
		return beatenByCard;
	}

	/**
	 * Setter to the field beatenByCard and it set the field beaten to true
	 * 
	 * @param beatenByCard
	 *            - card which must be writen in the field beatenByCard
	 */
	public void setBeatenByCard(Card beatenByCard) {
		this.beatenByCard = beatenByCard;
		this.beaten = true;
	}

	/**
	 * Empty constructor
	 */
	public Card() {
	}

	/**
	 * Constructor to the type of Card using field id
	 * 
	 * @param id
	 */
	public Card(int id) {

		this.id = id;

		switch (id % 4) {
		case 0:
			this.cardType = CardTypes.Hearts;
			break;
		case 1:
			this.cardType = CardTypes.Tiles;
			break;
		case 2:
			this.cardType = CardTypes.Clovers;
			break;
		case 3:
			this.cardType = CardTypes.Pikes;
			break;
		}

		switch (id / 4) {
		case 0:
			this.cardValue = CardValues.six;
			break;
		case 1:
			this.cardValue = CardValues.seven;
			break;
		case 2:
			this.cardValue = CardValues.eight;
			break;
		case 3:
			this.cardValue = CardValues.nine;
			break;
		case 4:
			this.cardValue = CardValues.ten;
			break;
		case 5:
			this.cardValue = CardValues.J;
			break;
		case 6:
			this.cardValue = CardValues.Q;
			break;
		case 7:
			this.cardValue = CardValues.K;
			break;
		case 8:
			this.cardValue = CardValues.A;
			break;
		}

		this.beaten = false;

		this.beatenByCard = null;

	}

	@Override
	public String toString() {
		if (!beaten) {
			return "[id=" + id + ", cardType=" + cardType + ", cardValue=" + cardValue + "]";
		} else {
			return "[id=" + id + ", cardType=" + cardType + ", cardValue=" + cardValue + "]-BEATEN BY" + beatenByCard;
		}

	}

	/**
	 * Retunt the list of cards, which can beat selected card
	 * 
	 * @param trumpSignature
	 *            - It is necessary for the computer to distinguish between trump
	 *            cards and not trump cards
	 * @return
	 */
	public List<Card> beatsByCards(int trumpSignature) {
		List<Card> set = new ArrayList<Card>();
		int typeSignature = this.id % 4;
		int valueSignature = this.id / 4;

		for (int i = 0; i < 36; i++) {
			if (((i % 4 == typeSignature) && (i / 4 > valueSignature))
					|| ((typeSignature != trumpSignature) && (i % 4 == trumpSignature))) {
				set.add(new Card(i));
			}
		}

		return set;
	}

	/**
	 * Return the list of cards, which selected card can beat
	 * 
	 * @param trumpSignature
	 *            - It is necessary for the computer to distinguish between trump
	 *            cards and not trump cards
	 * @return
	 */
	public List<Card> cardsCanBeBeaten(int trumpSignature) {
		Set<Card> list = new HashSet<Card>();
		int typeSignature = this.id % 4;
		int valueSignature = this.id / 4;

		for (int i = 0; i < 36; i++) {
			if ((i % 4 == typeSignature) && (i / 4 < valueSignature)) {
				list.add(new Card(i));
			}
		}

		if (typeSignature == trumpSignature) {
			for (int i = 0; i < 36; i++) {
				if ((i % 4 != typeSignature)) {
					list.add(new Card(i));
				}
			}
		}

		return new ArrayList<Card>(list);
	}
}

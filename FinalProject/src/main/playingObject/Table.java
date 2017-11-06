package main.playingObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.player.PC;
import main.player.User;

/**
 * A class that describes a playing table for the game
 * 
 * @version 1.0 6 November 2017
 * @author Alex
 *
 */
public class Table {

	/** Field that contain pc of Type PC */
	private PC pc;
	/** Field that contain user of type User */
	private User user;
	/** Field that contain card Deck for this play */
	private CardDeck cardDeck;
	/**
	 * Field that contain all card that was used during the game, and was
	 * successfully beaten
	 */
	private Set<Card> trash;
	/** Field that contain working field - the area where the game on */
	private Set<Card> workingField;
	/** Field that help during the game. true - user atack, pc - deffending */
	private boolean whoMove;// true - user`s move, false - pc`s move
	/** Field that contain trump signature to select who will move first */
	private int trumpSign;

	/**
	 * Getter to the field cardDeck
	 * 
	 * @return CardDeck
	 */
	public CardDeck getCardDeck() {
		return cardDeck;
	}

	/**
	 * Getter to the field pc
	 * 
	 * @returnPC
	 */
	public PC getPc() {
		return pc;
	}

	/**
	 * Getter to the field user
	 * 
	 * @return User
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Getter to the field whoMoves
	 * 
	 * @return true - if it is users move
	 */
	public boolean isWhoMove() {
		return whoMove;
	}

	/**
	 * Seter to the field whoMove
	 * 
	 * @param whoMove
	 *            - the value you want to give the field
	 */
	public void setWhoMove(boolean whoMove) {
		this.whoMove = whoMove;
	}

	/**
	 * Getter to the working field
	 * 
	 * @return cards which lay on the table, but it don`t return card which beaten
	 *         this cards
	 */
	public List<Card> getWorkingField() {
		List<Card> tmpList = new ArrayList<Card>();
		for (Card tmp : workingField) {
			tmpList.add(tmp);
			if (tmp.isBeaten()) {
				tmpList.add(tmp.getBeatenByCard());
			}

		}
		return tmpList;
	}

	/**
	 * Method to clean working field
	 */
	public void clearWorkingField() {
		workingField.clear();
	}

	public void setWorkingField(List<Card> newWorkingField) {
		this.workingField = new HashSet<Card>(newWorkingField);
	}

	/**
	 * Method which add card to the working field
	 * 
	 * @param card
	 *            - which card you want to put on the table
	 */
	public void addWorkingField(Card card) {
		this.workingField.add(card);
	}

	/**
	 * 
	 * @return contain card whish was moved to trash
	 */
	public Set<Card> getTrash() {
		return trash;
	}

	public int getTrumpSign() {
		return trumpSign;
	}

	/**
	 * Constructor to the class Table. Using to start new game
	 */
	public Table() {
		this.cardDeck = new CardDeck();
		this.trash = new HashSet<Card>();
		this.workingField = new HashSet<Card>();
		this.pc = new PC(draw(true));
		this.user = new User(draw(false));
		this.trumpSign = cardDeck.getTrumpSignature();
		this.whoMove = whoMovesFirst();
	}

	/**
	 * Method for constructor to give each player for 6 playing cards
	 * 
	 * @param visible
	 * @return
	 */
	private List<Card> draw(boolean visible) {
		List<Card> tmp = new ArrayList<Card>();
		Card tmpCard;

		for (int i = 0; i < 6; i++) {
			tmpCard = cardDeck.getNextCard();
			tmp.add(tmpCard);
		}

		return tmp;
	}

	/**
	 * Method that is used in the end of each playing situation during the game, so
	 * that players have at least 6 cards until the deck is empty
	 */
	public void draw() {
		if (pc.getMyCards().size() < 6) {
			int end = 6 - pc.getMyCards().size();
			for (int i = 0; i < end; i++) {
				pc.addCards(cardDeck.getNextCard());
			}
		}

		if (user.getMyCards().size() < 6) {
			int end = 6 - user.getMyCards().size();
			for (int i = 0; i < end; i++) {
				user.addCards(cardDeck.getNextCard());
			}
		}
	}

	/**
	 * Method to select who moves first
	 * 
	 * @return true - if it is users move
	 */
	private boolean whoMovesFirst() {
		return lowestTrumpId(user.getMyCards()) < lowestTrumpId(pc.getMyCards());
	}

	/**
	 * Method to help choose who moves first
	 * @param list - a list that needs to be processed
	 * @return lowest id in specified list
	 */
	private int lowestTrumpId(List<Card> list) {
		int tmp = 35;

		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getId() % 4 == trumpSign) && (list.get(i).getId() < tmp)) {
				tmp = list.get(i).getId();
			}

		}

		return tmp;
	}

	/**
	 * Method which move all beaten cards from table to trash 
	 */
	public void moveToTrash() {
		boolean doMyJob = true;

		for (Card tmp : workingField) {
			doMyJob = doMyJob && tmp.isBeaten();
		}

		if (doMyJob) {
			for (Card card : workingField) {
				trash.add(card.getBeatenByCard());
				trash.add(card);
			}

			workingField.clear();
		}
	}

	@Override
	public String toString() {
		CardTypes trumpType = null;

		switch (trumpSign) {
		case 0:
			trumpType = CardTypes.Hearts;
			break;
		case 1:
			trumpType = CardTypes.Tiles;
			break;
		case 2:
			trumpType = CardTypes.Clovers;
			break;
		case 3:
			trumpType = CardTypes.Pikes;
			break;
		}

		String whoMoveStr = whoMove ? "User" : "PC";

		return "\nPC: " + pc + "\nUSER: " + user + "\n---------------------------" + "\nworkingField=" + workingField
				+ "\nwhoMove=" + whoMoveStr + "\nTrump: " + trumpType + "\nTrash" + trash;
	}

}

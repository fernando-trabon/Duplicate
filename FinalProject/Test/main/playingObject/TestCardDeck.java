package main.playingObject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestCardDeck {

	@Test
	public void testGetNextCard() {
		CardDeck cardDeck = new CardDeck();

		List<Card> tmpList = cardDeck.getCardDeck();

		assertTrue(tmpList.get(0).equals(cardDeck.getNextCard()));
	}

	@Test
	public void testIsEmpty() {
		CardDeck cardDeck = new CardDeck();

		int end = cardDeck.getCardDeck().size();
		for (int i = 0; i<end; i++) {
			cardDeck.getNextCard();
		}

		assertTrue(cardDeck.isEmpty());
	}

}

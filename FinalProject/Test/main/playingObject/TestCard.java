package main.playingObject;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestCard {

	@Test
	public void testBeatsByCards() {
		Card card1 = new Card(31);
		Card card2 = new Card(35);
		
		List<Card> tmp = card1.beatsByCards(3);
		boolean release = false;
		
		for (Card card : tmp) {
			if (card.getId() == card2.getId()) {
				release = true;
			}
		}
		
		assertTrue(release);
	}		


	@Test
	public void testCardsCanBeBeaten() {
		Card card1 = new Card(1);
		Card card2 = new Card(5);
		
		List<Card> tmp = card2.cardsCanBeBeaten(0);
		boolean release = false;
		for (Card card : tmp) {
			if (card.getId() == card1.getId()) {
				release = true;
			}
		}
		
		assertTrue(release);
	}

}

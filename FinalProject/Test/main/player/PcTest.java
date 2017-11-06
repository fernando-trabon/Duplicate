package main.player;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

import main.player.exeptions.CardException;
import main.playingObject.Card;
import main.playingObject.Table;

public class PcTest {

	@Test
	public void testActionTableBufferedReader() {
		Table table = new Table();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		table.getPc().myCards.clear();
		table.setWhoMove(true);
		
		table.addWorkingField(new Card(0));
		Card card = new Card(4);
		table.getPc().myCards.add(new Card(4));
		System.out.println(table);
		
		try {
			table.getPc().action(table, sc);
		} catch (CardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(table);
		assertTrue(table.getWorkingField().get(0).getBeatenByCard().equals(card));
		
	}

}

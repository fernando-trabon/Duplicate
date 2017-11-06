package main.playingObject.interfaces;

import java.io.BufferedReader;
import java.io.IOException;

import main.player.exeptions.CardException;
import main.playingObject.Table;

public interface PlayerInterface {
	public boolean action(Table table, BufferedReader sc) throws IOException, CardException;
}

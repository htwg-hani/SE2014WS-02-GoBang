package de.htwg.gobang.controller;

import de.htwg.gobang.entities.GameField;
import de.htwg.gobang.entities.GameToken;

public class GbLogic {
	
	private GameField myField;
	private GameToken player1;
	private GameToken player2;
	private GameToken cPlayer;
	private int lastX;
	private int lastY;
	private int counter;
	private int size;
	private char status;
	
	public GbLogic(GameToken p1, GameToken p2){
		myField = new GameField();
		player1 = p1;
		player2 = p2;
		counter = 0;
		cPlayer = player1;
		size = myField.getFieldSize() + 1;
		lastX = 1;
		lastY = 1;
	}
	
	public char setToken(int x, int y)
	{
		if (x > size || x < 0 || y > size || y < 0)
		{
			return 'f';
		}
		status = myField.putStone(x, y, cPlayer);
		if (status == 'f' || status == 'b')
		{
			return status;
		}
		counter++;
		changePlayer(counter);
		lastX = x;
		lastY = y;
		return status;
	}
	
	private void changePlayer(int counter)
	{
		if (counter %2 == 0)
		{
			cPlayer = player1;
		}
		else
		{
			cPlayer = player2;
		}
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	public GameToken getcPlayer()
	{
		return cPlayer;
	}
	
	public boolean removeToken()
	{
		status = myField.removeToken(lastX, lastY);
		if (status == 'f')
		{
			return false;
		}
		counter--;
		changePlayer(counter);
		return true;
	}
}

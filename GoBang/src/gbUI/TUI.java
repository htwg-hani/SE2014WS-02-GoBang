package gbUI;

import gbData.tokenO;
import gbData.gameToken;
import gbData.tokenX;
import gbGame.GbLogic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
	
	gameToken player1;
	gameToken player2;
	GbLogic myGame;
	
	private static final Scanner scan = new Scanner(System.in); 
	static int choice;
	
	public static void main(String[] args) {
			welcome();
			
			while(true){
				try {
					switch(choice = scan.nextInt()) {
					case 1:
						field();
						break;
					case 2:
						help();
						welcome();
						break;
					case 3:
						System.exit(0);
						break;
					default:
						System.out.println("Please choose 1, 2 or 3");
						welcome();
						break;
					} 
					
				} catch (InputMismatchException x) {
					System.err.println("Wrong input type. Please choose 1, 2 or 3");
					welcome();
					break;
					}
			}
	}
			
	private static void help() {
		System.out.println("Go Bang is a strategy board game for two players from Japane. "
				+ "\nIt is played on a board of 19 x 19 fields. The players aim to align five "
				+ "\nstones of the same colour suite in vertical, horizontal or diagonal lines. ");
		System.out.println();
	}

	private static void welcome() {
		System.out.println("Welcome to GoBang");
		System.out.println("1: start new game");
		System.out.println("2: help");
		System.out.println("3: quit");
		
	}

	private static void field() {
		
	}

	private void newGame(){
		player1 = new tokenX();
		player2 = new tokenO();
		myGame = new GbLogic(player1, player2);
	}

}

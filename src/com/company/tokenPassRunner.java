package com.company;

public class tokenPassRunner {

    public static void main(String[] args) {
	// write your code here
        TokenPass testGame = new TokenPass(5);
        int[] testBoard = testGame.getBoard();
        System.out.println("Constructed a testBoard");
        for(int i=0; i<testBoard.length;i++){
            System.out.print(testBoard[i]+" ");
        }
        System.out.println();
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player " + testGame.getCurrentPlayer()+": ");
        for(int i=0; i<testBoard.length; i++){
            System.out.print(testBoard[i]+" ");
        }
    }
}

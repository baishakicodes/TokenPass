package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount){
        board =  new int[playerCount];
        this.currentPlayer = (int)(Math.random()*playerCount);
        for(int i=0; i<board.length; i++){
            board[i]=(int)(Math.random()*10)+1;
        }
    }

    public int[] getBoard() {
        return board;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
    public void distributeCurrentPlayerTokens(){
        int c=currentPlayer;
        for(int i=0; i<board.length;i++){
            if(i==currentPlayer&&(i!=0)){
                while(board[i]!=0){
                    board[c+1]++;
                    board[i]--;
                    c++;
                    if(c==board.length-1){
                        c=0;
                        while(board[i]!=0){
                            board[c]++;
                            board[i]--;
                            c++;
                        }
                    }
                }
            }
            if(i==currentPlayer && (i==board.length-1)){
                c=0;
                while(board[i]!=0){
                   board[c]++;
                   board[i]--;
                   c++;
                }
            }
        }
    }
}

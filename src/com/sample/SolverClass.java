package com.sample;

import java.util.Arrays;

public class SolverClass {
    public boolean isSafe(int[] board,int row,int col){

        for(int i=0 ;i<col ;i++)
            if(board[i] == row || (board[i]+i) == (row+col) || (board[i]-i) == (row-col))
                return false;

        return true;
    }

    public boolean runNQueen(int[] board,int N,int col){
        if(col >= N)
            return true;

        for(int i=0 ;i<N ;i++){

            if(isSafe(board,i,col)){
                board[col] = i;
                if(runNQueen(board,N,col+1) == true)
                    return true;

                board[col]=-1;
            }
        }
        return  false;
    }
    public void displayBoard(int[] board){
        for (int i:
             board) {
            System.out.print(i+" ");
        }
    }
}

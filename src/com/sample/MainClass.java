package com.sample;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        SolverClass solver = new SolverClass();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Queen");
        int N = scan.nextInt();
        int[] board = new int[N];
        Arrays.fill(board,-1);
        if(solver.runNQueen(board,N,0)){
            solver.displayBoard(board);
        }
        else
            System.out.println("Solution isn't possible!!");
    }
}

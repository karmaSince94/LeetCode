package com.vinay.practice.lc;

import java.util.ArrayList;
import java.util.List;

public class TheMazeBasics {

	public static void main(String[] args) {

		System.out.println(count(3,3));
		
		path("", 3, 3);
		
		System.out.println(pathRet("", 3, 3));
		
		System.out.println();
		
		System.out.println(countPathDiagonal(3,3));
		System.out.println(pathRetDiagonal("", 3, 3));
		
		System.out.println();
		boolean[][] board3 = {
	                {true, true, true},
	                {true, false, true},
	                {true, true, true}
	        };
		
		boolean[][] board4 = {
                {true, true, true, true},
                {true, false, true, true},
                {true, true, false, true},
                {true, true, true, true}
        };
		
		pathRestrictions(board4, "", 0, 0);
		System.out.println(printPathRestrictions(board4, "", 0, 0));
		// System.out.println(pathDiagonalRestrictions(board, "", 3, 3, 0, 0));
		
		System.out.println();
		System.out.println("Printing path with diagonal and restrictions");
		System.out.println(printPathDiagonalRestrictions(board4, "", 0, 0));
		

	}
	
	// how many ways we can travel from starting point to ending point of the maze but not diagonal 
	// (you can only go right and down)
	static int count(int r, int c) {
		
		if(r == 1 || c == 1) {
			return 1;
		}
		
		int left = count(r-1, c);
		int right = count(r, c-1);
		
		return left+right;
		
		
	}
	
	static void path(String p, int r, int c) {
		
		if(r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		
		if(r > 1) {
			path(p+"D", r-1, c);
		}
		
		if(c > 1) {
			path(p+"R", r, c-1);
		}
		
		
	}
	
	static List<String> pathRet(String p, int r, int c) {
		
		if(r == 1 && c == 1) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> path = new ArrayList<String>();
		
		if(r > 1) {
			path.addAll(pathRet(p+"D", r-1, c));
		}
		
		if(c > 1) {
			path.addAll(pathRet(p+"R", r, c-1));
		}
		
		return path;
		
	}
	
	
	static int countPathDiagonal(int r, int c) {
		
		if(r == 1 || c == 1) {
			return 1;
		}
		
		int diagonal = countPathDiagonal(r-1, c-1);
		int left = countPathDiagonal(r-1, c);
		int right = countPathDiagonal(r, c-1);
		
		return diagonal+left+right;
		
	}


	static List<String> pathRetDiagonal(String p, int r, int c) {
		
		if(r == 1 && c == 1) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> path = new ArrayList<String>();
		
		if(r > 1 && c > 1) {
			path.addAll(pathRetDiagonal(p+"D", r-1, c-1));
		}
		if(r > 1) {
			path.addAll(pathRetDiagonal(p+"V", r-1, c));
		}
		if(c > 1) {
			path.addAll(pathRetDiagonal(p+"H", r, c-1));
		}
		
		return path;
		
	}
	
	static void pathRestrictions(boolean[][] board, String p, int r, int c) {
		
		if(r == board.length-1 && c == board[0].length-1) {
			System.out.println(p);
			return;
		}
		
		if(!board[r][c])
			return;
		
		if(r < board.length-1) {
			pathRestrictions(board, p+"D", r+1, c);
		}
		
		if(c < board[0].length-1) {
			pathRestrictions(board, p+"R", r, c+1);
		}
		
		
	}
	
	static List<String> printPathRestrictions(boolean[][] board, String p, int r, int c) {
		
		if(r == board.length-1 && c == board[0].length-1) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> path = new ArrayList<String>();
		
		if(r < board.length-1 && board[r][c]) {
			path.addAll(printPathRestrictions(board, p+"D", r+1, c));
		}
		
		if(c < board[0].length-1 && board[r][c]) {
			path.addAll(printPathRestrictions(board, p+"R", r, c+1));
		}
		
		return path;
		
		
	}
	
	static List<String> printPathDiagonalRestrictions(boolean[][] board, String p, int r, int c) {
		
		if(r == board.length-1 && c == board[0].length-1 && board[r][c]) {
			List<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> path = new ArrayList<String>();
		
		if(r > board.length &&  c > board[0].length && board[r][c]) {
			path.addAll(printPathDiagonalRestrictions(board, p+"D", r+1, c+1));
		}
		
		if(r < board.length-1 && board[r][c]) {
			path.addAll(printPathDiagonalRestrictions(board, p+"V", r+1, c));
		}
		
		if(c < board[0].length-1 && board[r][c]) {
			path.addAll(printPathDiagonalRestrictions(board, p+"H", r, c+1));
		}
		
		return path;
		
		
	}

	
	
	
}

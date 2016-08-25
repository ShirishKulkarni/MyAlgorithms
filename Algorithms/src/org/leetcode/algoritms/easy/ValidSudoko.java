package org.leetcode.algoritms.easy;

public class ValidSudoko {

	public static void main(String[] args) {
		char[][] brd = new char[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0) {
					brd[i][j] = '1';
				}
				else{
					brd[i][j] = '.';
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
					System.out.print(brd[i][j]);
			}
			System.out.println();
		}

		System.out.println(">>" + isValidSudoku(brd));

	}

	public static boolean isValidSudoku(char[][] board) {

		boolean isValid = true;

		boolean[] horizLine = new boolean[9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (board[i][j]!='.'&& horizLine[getInt(board[i][j]) -1]) {
					return false;
				} else {
					horizLine[j] = true;
				}

			}
		}

		return isValid;

	}

	private static int getInt(char c) {
		
		return Integer.parseInt(c+"");
	}

}

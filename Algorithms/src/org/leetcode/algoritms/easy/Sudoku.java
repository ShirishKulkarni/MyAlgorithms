package org.leetcode.algoritms.easy;

public class Sudoku {

	public static void main(String[] args) {

	}

	public boolean isValidSudoku(char[][] board) {
		boolean isValid = false;
		boolean[] arr = new boolean[9];
		/**
		 * horizontal check
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (board[i][j] != '.') {
					if(arr[board[i][j]]==true){
						return false;
					}
						arr[board[i][j]]=true;
					
				}
			}
		}

		return isValid;

	}
}

package org.home.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    public static boolean solution(char[][] board) {
        Map<Integer, Set<Character>>  columns = new HashMap<>();
        Map<Integer, Set<Character>>  boxes = new HashMap<>();
        Set<Character> currentRow = new HashSet<>(9);
        int boxId = 1;

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                char currentValue = board[i][j];

                // Empty
                if ('.' != currentValue) {

                    // ROW check
                    if (!currentRow.add(currentValue)
                            // COLUMN check
                            || !columns.computeIfAbsent(j, k -> new HashSet<>()).add(currentValue)
                            // BOX check
                            || !boxes.computeIfAbsent(boxId, k -> new HashSet<>()).add(currentValue)) {
                        return false;
                    }

                }
                if ((j + 1) % 3 == 0) {
                    boxId++;
                }
            }
            boxId = 1;
            currentRow.clear();
            if ((i + 1) % 3 == 0) {
                boxes.clear();
            }
        }
        return true;
    }

    /**
     * NICE LEETCODE USER'S SOLUTION
     * From StefanPochmann
     */
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
        }
}

package com.uzfundit;

import com.uzfundit.chess.gui.Board;

public class Main {
    public static void main(String[] args) {
        Board board = Board.createBoard();
        board.display();

    }
}

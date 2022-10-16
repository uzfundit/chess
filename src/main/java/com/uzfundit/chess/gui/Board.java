package com.uzfundit.chess.gui;

import java.awt.*;

public class Board {
    private static final Dimension OUTER_FRAME_DIMENSION = new Dimension(600, 600);

    public static Board createBoard() {
        MenuBar menuBar = new MenuBar("File");
        ChessFrame chessFrame = new ChessFrame(OUTER_FRAME_DIMENSION, menuBar);
        return new Board(chessFrame);
    }

    private final ChessFrame chessFrame;

    private Board(ChessFrame chessFrame) {
        this.chessFrame = chessFrame;
    }

    public void display() {
        chessFrame.display();
    }
}

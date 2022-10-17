package com.uzfundit.chess.gui;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final Dimension OUTER_FRAME_DIMENSION = new Dimension(600, 600);
    private static final Dimension BOARD_PANEL_DIMENSION = new Dimension(400, 350);
    private static final Dimension TILE_PANEL_DIMENSION = new Dimension(10, 10);

    public static Board createBoard() {
        MenuBar menuBar = new MenuBar("File");
        List<TilePanel> tiles = createTiles();
        BoardPanel boardPanel = new BoardPanel(BOARD_PANEL_DIMENSION, tiles);
        ChessFrame chessFrame = new ChessFrame(OUTER_FRAME_DIMENSION, menuBar, boardPanel);
        return new Board(chessFrame);
    }

    private static List<TilePanel> createTiles() {
        List<TilePanel> tilePanels = new ArrayList<>(64);
        for (int i = 0; i < BoardUtils.NUM_OF_TILES; i++) {
            TilePanel tilePanel = new TilePanel(i, TILE_PANEL_DIMENSION);
            tilePanels.add(tilePanel);
        }
        return tilePanels;
    }

    private final ChessFrame chessFrame;

    private Board(ChessFrame chessFrame) {
        this.chessFrame = chessFrame;
    }

    public void display() {
        chessFrame.display();
    }
}

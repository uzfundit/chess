package com.uzfundit.chess.gui;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final Dimension OUTER_FRAME_DIMENSION = new Dimension(600, 600);
    private static final Dimension TOP_TILE_DIMENSION = new Dimension(350, 50);
    private static final Dimension LEFT_TILE_DIMENSION = new Dimension(50, 350);
    private static final Dimension BOARD_PANEL_DIMENSION = new Dimension(400, 350);
    private static final Dimension TILE_PANEL_DIMENSION = new Dimension(10, 10);

    public static Board createBoard() {
        MenuBar menuBar = new MenuBar("File");
        List<TilePanel> tiles = createTiles();
        List<TilePanel> topTiles = createTopTiles();
        List<TilePanel> leftTiles = createLeftTiles();
        BoardPanel boardPanel = new BoardPanel(BOARD_PANEL_DIMENSION, tiles);
        Top_AND_Bottom_Panel topPanel = new Top_AND_Bottom_Panel(TOP_TILE_DIMENSION, topTiles);
        Top_AND_Bottom_Panel bottomPanel = new Top_AND_Bottom_Panel(TOP_TILE_DIMENSION, topTiles);
        Left_AND_Right_Panel leftPanel = new Left_AND_Right_Panel(LEFT_TILE_DIMENSION, leftTiles);
        Left_AND_Right_Panel rightPanel = new Left_AND_Right_Panel(LEFT_TILE_DIMENSION, leftTiles);
        ChessFrame chessFrame = new ChessFrame(OUTER_FRAME_DIMENSION, menuBar, boardPanel, topPanel, bottomPanel, leftPanel, rightPanel);
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
    private static List<TilePanel> createTopTiles() {
        List<TilePanel> tilePanels = new ArrayList<>(10);
        for (int i = 0; i < BoardUtils.NUM_OF_TILES; i++) {
            TilePanel tilePanel = new TilePanel(i, TILE_PANEL_DIMENSION);
            tilePanels.add(tilePanel);
        }
        return tilePanels;
    }

    private static List<TilePanel> createLeftTiles() {
        List<TilePanel> tilePanels = new ArrayList<>(8);
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
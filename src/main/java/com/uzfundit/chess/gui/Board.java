package com.uzfundit.chess.gui;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final Dimension OUTER_FRAME_DIMENSION = new Dimension(900, 900);
    private static final Dimension TOP_TILE_DIMENSION = new Dimension(500, 50);
    private static final Dimension LEFT_TILE_DIMENSION = new Dimension(50, 400);
    private static final Dimension BOARD_PANEL_DIMENSION = new Dimension(400, 400);
    private static final Dimension TILE_PANEL_DIMENSION = new Dimension(10, 10);

    public static Board createBoard() {
        MenuBar menuBar = new MenuBar("File");
        List<TilePanel> tiles = createTiles();
        List<TilePanel> topTiles = createTopTiles();
        List<TilePanel> bottomTiles = createBottomTiles();
        List<TilePanel> leftTiles = createLeftTiles();
        List<TilePanel> rightTiles = createRightTiles();

        BoardPanel boardPanel = new BoardPanel(BOARD_PANEL_DIMENSION, tiles);
        TopPanel topPanel = new TopPanel(TOP_TILE_DIMENSION, topTiles);
        BottomPanel bottomPanel = new BottomPanel(TOP_TILE_DIMENSION, bottomTiles);
        LeftPanel leftPanel = new LeftPanel(LEFT_TILE_DIMENSION, leftTiles);
        RightPanel rightPanel = new RightPanel(LEFT_TILE_DIMENSION, rightTiles);

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
        for (int i = 0; i < 10; i++) {
            TilePanel tilePanel = new TilePanel(i, TILE_PANEL_DIMENSION);
            tilePanels.add(tilePanel);
        }
        return tilePanels;
    }

    private static List<TilePanel> createBottomTiles() {
        List<TilePanel> tilePanels = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            TilePanel tilePanel = new TilePanel(i, TILE_PANEL_DIMENSION);
            tilePanels.add(tilePanel);
        }
        return tilePanels;
    }

    private static List<TilePanel> createLeftTiles() {
        List<TilePanel> tilePanels = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            TilePanel tilePanel = new TilePanel(i, TILE_PANEL_DIMENSION);
            tilePanels.add(tilePanel);
        }
        return tilePanels;
    }

    private static List<TilePanel> createRightTiles() {
        List<TilePanel> tilePanels = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
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
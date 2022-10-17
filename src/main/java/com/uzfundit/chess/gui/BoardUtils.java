package com.uzfundit.chess.gui;

public class BoardUtils {
    public static final int NUM_OF_TILES = 64;
    public static final int NUM_OF_COLS = 8;
    public static final int NUM_OF_ROWS = 8;

    public static int calcTileRow(int tileId) {
        return tileId / NUM_OF_ROWS;
    }

    public static int calcTileColumn(int tileId) {
        int row = calcTileRow(tileId);
        return tileId - (row * NUM_OF_ROWS);
    }

    public static boolean isLightColor(int tileId) {
        int row = calcTileRow(tileId);
        int col = calcTileColumn(tileId);

        return (row + col) % 2 == 0;
    }
}

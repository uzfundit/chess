package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;

public class TilePanel extends JPanel {
    private static final Color LIGHT_COLOR = Color.LIGHT_GRAY;
    private static final Color DARK_COLOR = Color.DARK_GRAY;

    private final int tileId;
    private final Dimension dimension;
    public TilePanel(int tileId, Dimension dimension) {
        this.tileId = tileId;
        this.dimension = dimension;

    }

    public void display() {
        this.setPreferredSize(dimension);
        assignTileColor();
    }

    private void assignTileColor() {
        boolean  isLightColor = BoardUtils.isLightColor(tileId);
        Color bgColor = isLightColor ? LIGHT_COLOR : DARK_COLOR;
        setColor(bgColor);
    }

    private void setColor(Color color) {
        this.setBackground(color);
    }
}

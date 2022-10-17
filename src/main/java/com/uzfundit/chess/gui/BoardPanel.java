package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BoardPanel extends JPanel {
    private final Dimension dimension;
    private final List<TilePanel> tiles;

    public BoardPanel(Dimension dimension, List<TilePanel> tiles) {
        super(new GridLayout(8,8));
        this.dimension = dimension;
        this.tiles = tiles;
    }

    public void display() {
        this.setPreferredSize(dimension);

        for(TilePanel tilePanel : tiles) {
            add(tilePanel);
            tilePanel.display();
        }

        this.validate();
    }
}

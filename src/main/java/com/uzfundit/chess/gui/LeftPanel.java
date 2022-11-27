package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class LeftPanel extends JPanel{
    private final Dimension dimension;
    private final java.util.List<TilePanel> tiles;
    public static int count = 0;

    public LeftPanel(Dimension dimension, List<TilePanel> tiles) {
        super(new GridLayout(8,1));
        this.dimension = dimension;
        this.tiles = tiles;
    }

    public void display() {
        this.setPreferredSize(dimension);

        for(TilePanel tilePanel : tiles) {
            add(tilePanel);
            tilePanel.displayLeftDigits();
            count++;
        }

        this.validate();
    }
}

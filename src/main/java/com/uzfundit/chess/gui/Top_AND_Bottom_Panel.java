package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Top_AND_Bottom_Panel extends JPanel {
    private final Dimension dimension;
    private final List<TilePanel> tiles;

    public Top_AND_Bottom_Panel(Dimension dimension, List<TilePanel> tiles) {
        super(new GridLayout(1,10));
        this.dimension = dimension;
        this.tiles = tiles;
    }

    public void display() {
        this.setPreferredSize(dimension);

        for(TilePanel tilePanel : tiles) {
            add(tilePanel);
            tilePanel.displaySigns();
        }

        this.validate();
    }
}

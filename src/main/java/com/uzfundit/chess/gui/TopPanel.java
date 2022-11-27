package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TopPanel extends JPanel {
    private final Dimension dimension;
    private final List<TilePanel> tiles;
    public static int count = 0;

    public TopPanel(Dimension dimension, List<TilePanel> tiles) {
        super(new GridLayout(1,8));
        this.dimension = dimension;
        this.tiles = tiles;
    }

    public void display() {
        this.setPreferredSize(dimension);

        for(TilePanel tilePanel : tiles) {
            add(tilePanel);
            tilePanel.displayTopLetters();
            count++;
        }

        this.validate();
    }
}

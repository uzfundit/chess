package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;

public class TilePanel extends JPanel {
    private static final Color LIGHT_COLOR = new Color(255, 178, 102);
    private static final Color DARK_COLOR = new Color(81, 22, 0);

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
    public void displayTopLetters() {
        this.setPreferredSize(dimension);
        String s = "";

        switch (TopPanel.count) {
            case 1: s = "A     "; break;
            case 2: s = "B     "; break;
            case 3: s = "  C   "; break;
            case 4: s = "D"; break;
            case 5: s = "E"; break;
            case 6: s = "  F"; break;
            case 7: s = "   G"; break;
            case 8: s = "     H"; break;
        }

        JLabel label = new JLabel(s, JLabel.CENTER);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        this.add(BorderLayout.NORTH, label);
        setColor(new Color(155, 103, 0));
    }
    public void displayBottomLetters() {
        this.setPreferredSize(dimension);
        String s = "";

        switch (BottomPanel.count) {
            case 1: s = "A     "; break;
            case 2: s = "B     "; break;
            case 3: s = "  C   "; break;
            case 4: s = "D"; break;
            case 5: s = "E"; break;
            case 6: s = "  F"; break;
            case 7: s = "   G"; break;
            case 8: s = "     H"; break;
        }

        JLabel label = new JLabel(s);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
        this.add(BorderLayout.SOUTH, label);
        setColor(new Color(155, 103, 0));
    }
    public void displayLeftDigits() {
        this.setPreferredSize(dimension);
        String s1 = "";

        switch (LeftPanel.count) {
            case 0: s1 = "8"; break;
            case 1: s1 = "7"; break;
            case 2: s1 = "6"; break;
            case 3: s1 = "5"; break;
            case 4: s1 = "4"; break;
            case 5: s1 = "3"; break;
            case 6: s1 = "2"; break;
            case 7: s1 = "1"; break;
        }

        JLabel label = new JLabel(s1);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.add(BorderLayout.WEST, label);
        setColor(new Color(155, 103, 0));
    }

    public void displayRightDigits() {
        this.setPreferredSize(dimension);
        String s1 = "";

        switch (RightPanel.count) {
            case 0: s1 = "1"; break;
            case 1: s1 = "2"; break;
            case 2: s1 = "3"; break;
            case 3: s1 = "4"; break;
            case 4: s1 = "5"; break;
            case 5: s1 = "6"; break;
            case 6: s1 = "7"; break;
            case 7: s1 = "8"; break;
        }
        JLabel label = new JLabel(s1);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        this.add(BorderLayout.EAST, label);
        setColor(new Color(155, 103, 0));
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

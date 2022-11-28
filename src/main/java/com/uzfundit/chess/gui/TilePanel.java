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
        String[] s = new String[8];

        switch (TopPanel.count) {
            case 1: s[0] = "A"; break;
            case 2: s[1] = "B"; break;
            case 3: s[2] = "C"; break;
            case 4: s[3] = "D"; break;
            case 5: s[4] = "E"; break;
            case 6: s[5] = "F"; break;
            case 7: s[6] = "G"; break;
            case 8: s[7] = "H"; break;
        }
        JLabel label;
        for(int i = 0; i < 8; i++) {
            label = getjLabel(s, i);
            label.setAlignmentX(CENTER_ALIGNMENT);
        }


        setColor(new Color(155, 103, 0));
    }
    public void displayBottomLetters() {
        this.setPreferredSize(dimension);
        String[] s = new String[8];

        switch (BottomPanel.count) {
            case 1: s[0] = "A"; break;
            case 2: s[1] = "B"; break;
            case 3: s[2] = "C"; break;
            case 4: s[3] = "D"; break;
            case 5: s[4] = "E"; break;
            case 6: s[5] = "F"; break;
            case 7: s[6] = "G"; break;
            case 8: s[7] = "H"; break;
        }
        JLabel label;
        for(int i = 0; i < 8; i++) {
            label = getjLabel(s, i);
            label.setAlignmentX(CENTER_ALIGNMENT);
        }

        setColor(new Color(155, 103, 0));
    }

    private JLabel getjLabel(String[] s, int i) {
        JLabel label = new JLabel(s[i], JLabel.CENTER);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        this.add(BorderLayout.NORTH, label);
        return label;
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
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel(s1);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
        this.add(BorderLayout.WEST, label);
        label.setAlignmentY(CENTER_ALIGNMENT);
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
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel(s1, JLabel.CENTER);
        Font fnt = new Font("Calibri",Font.BOLD,20);
        label.setFont(fnt);
        label.setForeground(Color.lightGray);
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

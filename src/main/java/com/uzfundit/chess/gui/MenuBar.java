package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {
    private final String title;

    public MenuBar(String title) {
        this.title = title;
    }

    public void populateMenuBar() {
        JMenu menu = new JMenu(title);
        JMenuItem openPGN = new JMenuItem("Load PNG File");
        openPGN.addActionListener(this);
        menu.add(openPGN);
        this.add(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Open up png file");
    }
}

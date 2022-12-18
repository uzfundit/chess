package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener {
    private final String title;
    private final String title2;

    public MenuBar(String title, String title2) {
        this.title = title;
        this.title2 = title2;
    }

    public void populateMenuBar() {
        JMenu menu = new JMenu(title);
        JMenu menu2 = new JMenu(title2);
        JMenuItem openPGN = new JMenuItem("Load PNG File");
        JMenuItem openPGN2 = new JMenuItem("Start");
        openPGN.addActionListener(this);
        openPGN2.addActionListener(this);
        menu2.add(openPGN2);
        menu.add(openPGN);
        this.add(menu);
        this.add(menu2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Open up png file");
    }
}

package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChessFrame extends JFrame implements WindowListener {

    private final Dimension dimension;
    private final MenuBar menuBar;

    public ChessFrame(Dimension dimension, MenuBar menuBar) {
        this.dimension = dimension;
        this.menuBar = menuBar;
        this.setJMenuBar(menuBar);
    }

    public void display() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(dimension);
        this.addWindowListener(this);
        this.setJMenuBar(menuBar);
        menuBar.populateMenuBar();
        this.setVisible(true);
    }


    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Chess Window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Chess Window Closed");
        System.out.println("Shutting down...");
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}

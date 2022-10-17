package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChessFrame extends JFrame implements WindowListener {

    private final Dimension dimension;
    private final MenuBar menuBar;
    private final BoardPanel boardPanel;

    public ChessFrame(Dimension dimension, MenuBar menuBar, BoardPanel boardPanel) {
        this.dimension = dimension;
        this.menuBar = menuBar;
        this.boardPanel = boardPanel;
    }

    public void display() {
        setSelf();
        setMenuBar();
        setBoardPanel();
        this.setVisible(true);
    }

    private void setSelf() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(dimension);
        this.addWindowListener(this);
    }

    private void setMenuBar() {
        this.setJMenuBar(menuBar);
        menuBar.populateMenuBar();
    }

    private void setBoardPanel() {
        this.add(boardPanel, BorderLayout.CENTER);
        boardPanel.display();
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

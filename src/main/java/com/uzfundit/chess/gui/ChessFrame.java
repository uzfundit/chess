package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChessFrame extends JFrame implements WindowListener {

    private final Dimension dimension;
    private final MenuBar menuBar;
    private final BoardPanel boardPanel;
    private final TopPanel topPanel;
    private final BottomPanel bottomPanel;
    private final LeftPanel leftPanel;
    private final RightPanel rightPanel;

    public ChessFrame(Dimension dimension, MenuBar menuBar, BoardPanel boardPanel, TopPanel topPanel, BottomPanel bottomPanel, LeftPanel leftPanel, RightPanel rightPanel) {
        this.dimension = dimension;
        this.menuBar = menuBar;
        this.boardPanel = boardPanel;
        this.topPanel = topPanel;
        this.bottomPanel = bottomPanel;
        this.leftPanel = leftPanel;
        this.rightPanel = rightPanel;
    }

    public void display() {
        setSelf();
        setMenuBar();
        setBoardPanel();
        setTopPanel();
        setBottomPanel();
        setLeftPanel();
        setRightPanel();
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

    private void setTopPanel() {
        this.add(topPanel, BorderLayout.NORTH);
        topPanel.display();
    }
    private void setBottomPanel() {
        this.add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.display();
    }
    private void setLeftPanel() {
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        this.add(leftPanel, BorderLayout.WEST);
        leftPanel.display();
    }
    private void setRightPanel() {
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        this.add(rightPanel, BorderLayout.EAST);
        rightPanel.display();
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
package com.uzfundit.chess.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChessFrame extends JFrame implements WindowListener {

    private final Dimension dimension;
    private final MenuBar menuBar;
    private final BoardPanel boardPanel;
    private final Top_AND_Bottom_Panel topPanel;
    private final Top_AND_Bottom_Panel bottomPanel;
    private final Left_AND_Right_Panel leftPanel;
    private final Left_AND_Right_Panel rightPanel;

    public ChessFrame(Dimension dimension, MenuBar menuBar, BoardPanel boardPanel, Top_AND_Bottom_Panel topPanel, Top_AND_Bottom_Panel bottomPanel, Left_AND_Right_Panel leftPanel, Left_AND_Right_Panel rightPanel) {
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
        this.add(leftPanel, BorderLayout.WEST);
        leftPanel.display();
    }
    private void setRightPanel() {
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
package org.mmteam.creatta.gui;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private JDesktopPane desktopPane;
    private JMenuBar menuBar;
    private JMenu mnFichier;
    private JMenuItem menuQuitter;

    /**
     * Create the application.
     */
    public MainWindow() {
        // TODO
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        // TODO another issue
        this.setBounds(100, 100, 450, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(getDesktopPane(), BorderLayout.CENTER);
        setJMenuBar(getMenuBar_1());
    }

    private JDesktopPane getDesktopPane() {
        if (desktopPane == null) {
            desktopPane = new JDesktopPane();
        }
        return desktopPane;
    }

    private JMenuBar getMenuBar_1() {
        // TODO another issue 2
        if (menuBar == null) {
            menuBar = new JMenuBar();
            menuBar.add(getMnFichier());
        }
        return menuBar;
    }

    private JMenu getMnFichier() {
        // TODO another issue 3
        if (mnFichier == null) {
            mnFichier = new JMenu("Fichier");
            mnFichier.add(getMenuQuitter());
        }
        return mnFichier;
    }

    public JMenuItem getMenuQuitter() {
        if (menuQuitter == null) {
            menuQuitter = new JMenuItem("Quitter");
        }
        return menuQuitter;
    }
}

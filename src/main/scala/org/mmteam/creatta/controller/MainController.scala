package org.mmteam.creatta.controller

import scala.swing._
import org.mmteam.creatta.gui.MainWindow

class MainController {
    
    val quitAction = Action("Quitter") {
        println("on quitte l'application")
    }
    
    def exec() {
        val mainWindow = new MainWindow()
        if (mainWindow.getSize() == new Dimension(0,0)) mainWindow.pack()
        mainWindow.getMenuQuitter.addActionListener(quitAction.peer)
        mainWindow.setVisible(true)
    }

}
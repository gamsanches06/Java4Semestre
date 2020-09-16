/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Giovani
 */
public class DesktopFrame extends JFrame {

    private JDesktopPane theDesktop;

    public DesktopFrame() {
        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu("Add");
        JMenuItem newFrame = new JMenuItem("Internal Frame");

        addMenu.add(newFrame);
        bar.add(addMenu);
        setJMenuBar(bar);

        theDesktop = new JDesktopPane();
        add(theDesktop);

        newFrame.addActionListener(
                new ActionListener() {
                    public void actionPerformed( ActionEvent event){
                        JInternalFrame frame = new JInternalFrame("Internal Frame", true, true, true, true);
                        
                        MyJPanel panel = new MyJPanel();
                        frame.add( panel, BorderLayout.CENTER);
                        frame.pack();
                        
                        theDesktop.add( frame );
                        frame.setVisible(true);
                        
                    }
        }
        );
    }// fim do construtor desktopframe

    class MyJPanel extends JPanel{
        private   Random Generator = new Random();
        private ImageIcon picture;
        private String[] images = { "yellowflowers.png", "purpleflowers.png", "redflowers.png", "redflowers2.png", "lavenderflowers.png" };
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

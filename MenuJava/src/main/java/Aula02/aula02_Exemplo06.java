/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Giovani
 */
public class aula02_Exemplo06 extends JFrame {

    private String details; // representa��o String
    private JLabel statusBar; // JLabel que aparece na parte inferior da janela

    // construtor configura String de barra de t�tulo e registra o listener de mouse
    public aula02_Exemplo06() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // adicioa handler
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } // fim do construtor MouseDetailsFrame

    // classe interna para tratar eventos de mouse
    private class MouseClickHandler extends MouseAdapter {
        // trata evento de clique de mouse e determina qual bot�o foi pressionado

        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX(); // obt�m posi��o x do mouse
            int yPos = event.getY(); // obt�m posi��o y do mouse

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if (event.isMetaDown()) // bot�o direito do mouse
            {
                details += " with right mouse button";
            } else if (event.isAltDown()) // bot�o do meio do mouse
            {
                details += " with center mouse button";
            } else // bot�o esquerdo do mouse
            {
                details += " with left mouse button";
            }

            switch (event.getButton()) {
                case 3:
                    details += "With right mouse button";
                    break;
                case 2:
                    details += "With center mouse button";
                    break;
                default:
                    details += "With left mouse button";
                    break;
            }

            statusBar.setText(details); // exibe mensagem em statusBar
        } // fim do m�todo mouseClicked
    } // fim da classe interna private MouseClickHandler
    
} // fim da classe MouseDetailsFrame

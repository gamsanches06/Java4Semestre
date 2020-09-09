/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Giovani
 */
public class aula02_Exemplo10 {

    public static void main(String args[]) {
        // cria o JFrame
        JFrame application = new JFrame("A simple paint program");

        aula02_Exemplo09 paintPanel = new aula02_Exemplo09(); // cria o painel de pintura
        application.add(paintPanel, BorderLayout.CENTER); // no centro

        // cria um rótulo e o coloca em SOUTH do BorderLayout
        application.add(new JLabel("Drag the mouse to draw"),
                BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        application.setSize(400, 200); // configura o tamanho do frame
        application.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe Painter

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import javax.swing.JFrame;

/**
 *
 * @author Giovani
 */
public class aula02_Exemplo07 {

    public static void main(String args[]) {
        aula02_Exemplo08 mouseTrackerFrame = new aula02_Exemplo08();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100); // configura o tamanho do frame
        mouseTrackerFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe MouseTracker

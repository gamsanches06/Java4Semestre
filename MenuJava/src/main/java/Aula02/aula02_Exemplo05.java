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
public class aula02_Exemplo05 {

    public static void main(String args[]) {
        aula02_Exemplo06 mouseDetailsFrame = new aula02_Exemplo06();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 150); // configura o tamanho do frame
        mouseDetailsFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe MouseDetails


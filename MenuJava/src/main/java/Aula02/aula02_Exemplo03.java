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
public class aula02_Exemplo03 {

    public static void main(String[] args) {
        aula02_Exemplo04 keyDemoFrame = new aula02_Exemplo04();
        keyDemoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        keyDemoFrame.setSize(350, 100); // configura o tamanho do frame
        keyDemoFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe KeyDemo


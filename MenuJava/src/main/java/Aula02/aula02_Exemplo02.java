/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import javax.swing.JFrame;
import Aula02.aula02_Exemplo01;

/**
 *
 * @author Giovani
 */
public class aula02_Exemplo02{
    

    public static void main(String args[]) {
        aula02_Exemplo01 desktopFrame = new aula02_Exemplo01();
        desktopFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        desktopFrame.setSize(600, 480); // configura o tamanho do frame
        desktopFrame.setVisible(true); // exibe o frame
    } // fim de main

}

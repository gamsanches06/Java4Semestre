/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

import javax.swing.JFrame;

/**
 *
 * @author Yago
 */
public class PopupTest {

    public static void main(String[] args) {

        PopupFrame popupFrame = new PopupFrame();
        popupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popupFrame.setSize(300, 200);
        popupFrame.setVisible(true);
    }
}

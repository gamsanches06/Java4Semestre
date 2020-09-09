/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author prof. Célio R. Castelano
 */
public class aula1_Exemplo2 extends JFrame {
    String firstNumber;
    String secondNumber;
    int NUMBER1;

    public aula1_Exemplo2() {
        firstNumber = JOptionPane.showInputDialog(this, "Entre com o Primeiro número:");
        secondNumber = JOptionPane.showInputDialog(this, "Entre com o Segundo Número:");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(this, "A soma dos número é: " + sum);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        aula1_Exemplo2 obj = new aula1_Exemplo2();
        System.out.println("Saiu do construtor");
    }
}
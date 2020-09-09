/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

import java.awt.*;
import javax.swing.*;

public class aula1_Exemplo1 extends JFrame {

    // 1) Declara��o dos componentes Swing
    private JLabel lblTitulo, lblRA, lblNome;
    private JTextField edtRA, edtNome;

    public  aula1_Exemplo1() {
        setTitle("Exemplo de Componentes Swing em Java"); // t�tulo do frame
        setPreferredSize(new Dimension(600, 277)); // ajuste do tamanho e layout
        setLayout(null); // aqui a definicao para utilizacao de layout absoluto
        
        // 2
        criarComponentes(); // instancia componentes (objetos Swing);
        
        // 3
        configurarPosicoes(); // configura as posices dos componentes;
        
        //4
        adicionarComponentes(); // adiciona componentes no frame

        pack(); // reorganiza os componentes (objetos) no frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true); // deixa o frame vis�vel
    }

    // 2) inst�ncia dos componentes
    public void criarComponentes() {
        lblTitulo = new JLabel("Utiliza��o de Componentes Swing em Java");
        lblRA = new JLabel("R.A."); // Label do R.A.
        edtRA = new JTextField(); // TextField do R.A.
        lblNome = new JLabel("Nome"); // Label do Nome
        edtNome = new JTextField(50); // TextField do Nome

    }

    // Configurar as posi��es de cada componente
    private void configurarPosicoes() {
        // Setbounds( posicao x, posicao y, largura, algura )
        lblTitulo.setBounds(115, 15, 350, 20);

        lblRA.setBounds(25, 55, 100, 25);
        lblNome.setBounds(15, 90, 100, 25);
        edtRA.setBounds(55, 55, 100, 25);
        edtNome.setBounds(55, 90, 375, 25);
    }

    // Adicionar cada componente no JFrame
    public void adicionarComponentes() {
        add(lblTitulo); // adiciona o Label do T�tulo no Frame
        add(lblRA); // adiciona o Label do RA no Frame
        add(lblNome); // adiciona o Label do Nome no Frame
        add(edtRA); // adiciona o TextField do RA no Frame
        add(edtNome); // adiciona o TextField do Nome no Frame
    }

    public static void main(String[] args) {
        aula1_Exemplo1 obj = new aula1_Exemplo1();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author prof. C�lio R. Castelano
 * 
 *    ORIENTA��ES PARA CRIA��O DE UMA GUI
 * 
 * 1) extender de JFrame 
 * 2) criar a estrutura de m�todos 
 *      2.1) m�todo instanciar
 *      2.2) m�todo posicionar 
 *      2.3) m�todo adicionar 
 * 3) criar o m�todo main 
 *      3.1) Instanciar um objeto da classe
 * 4) criar o construtor
 *      4.1) setTitle para definir o t�tulo do frame(janela)
 *      4.2) setLayout Null, para usar layout absoluto
 *      4.3) chamada para o m�todo instanciar
 *      4.4) chamada para o m�todo posicionar
 *      4.5) chamada para o m�todo adicionar
 *      4.6) setVisible - sem ele o frame n�o � exibido
 *      4.8) pack = reposiciona todos os componentes
 */
public class aula1_Exemplo3 extends JFrame {
    // declara�ao dos componentes

    private JLabel lblTitulo, lblRA, lblCurso, lblNome, lblSemestre;
    private JTextField edtRA, edtNome, edtCurso;
    private JComboBox boxSemestre;
    private JButton btnGravar, btnSair, btnCancelar;
    private String[] boxBimestreItems = {"Primeiro", "Segundo", "Terceiro", "Quarto"};

    public aula1_Exemplo3() {
        setTitle("Exemplo de Laioute Absoluto em Java");

        //ajuste do tamanho e layout
        setPreferredSize(new Dimension(456, 277));
        setLayout(null); // aqui a definicao para utilizacao de layout absoluto

        instanciar(); // instancia componentes (objetos Swing);

        posicionar(); // configura as posices dos componentes;

        adicionar(); // adiciona componentes no frame

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setVisible(true);
        pack(); // reorganiza os componentes (objetos) no frame
    }

    public void instanciar() {
        lblTitulo = new JLabel("Utiliza��o de Leioute Absoluto em Java");
        edtRA = new JTextField(5);
        edtNome = new JTextField(5);
        edtCurso = new JTextField(5);
        lblRA = new JLabel("R.A.");
        lblCurso = new JLabel("Curso");
        lblNome = new JLabel("Nome");
        lblSemestre = new JLabel("Semestre");
        boxSemestre = new JComboBox(boxBimestreItems);
        btnGravar = new JButton("Gravar");
        btnSair = new JButton("Sair");
        btnCancelar = new JButton("Cancelar");
    }

    public void posicionar() {
        //Configura a posicao dos objetos no frame
        // Setbounds( posicao x, posicao y, largura, algura )
        lblTitulo.setBounds(115, 15, 300, 20);
        lblRA.setBounds(25, 55, 100, 25);
        lblNome.setBounds(15, 90, 100, 25);
        lblCurso.setBounds(15, 125, 100, 25);
        lblSemestre.setBounds(270, 125, 80, 25);
        edtRA.setBounds(55, 55, 375, 25);
        edtNome.setBounds(55, 90, 375, 25);
        edtCurso.setBounds(55, 125, 200, 25);
        boxSemestre.setBounds(345, 125, 85, 25);
        btnGravar.setBounds(55, 190, 100, 25);
        btnCancelar.setBounds(175, 190, 100, 25);
        btnSair.setBounds(300, 190, 100, 25);
    }

    public void adicionar() {
        add(lblTitulo);
        add(edtRA);
        add(edtNome);
        add(edtCurso);
        add(lblRA);
        add(lblCurso);
        add(lblNome);
        add(lblSemestre);
        add(boxSemestre);
        add(btnGravar);
        add(btnSair);
        add(btnCancelar);
    }

    public static void main(String[] args) {
        aula1_Exemplo3 tela = new aula1_Exemplo3();
    }
}
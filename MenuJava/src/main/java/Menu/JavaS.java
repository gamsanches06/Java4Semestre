/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Giovani
 */
public class JavaS extends JFrame {

    private JLabel lblNome, lblTitulo, lblCPF;
    private JTextField edtNome, edtCPF;
    private JTextArea txtCompl;
    private JButton btnCorFundo;
    private JColorChooser  colorCor;

    public JavaS() {
        setTitle("Diversos componentes Swing");
        setPreferredSize(new Dimension(700, 500));
        setLayout(null);

        initComponent();
        addComponent();
        defPos();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void initComponent() {
        lblTitulo = new JLabel("Utilizando componentes swing");

        lblNome = new JLabel("Nome: ");
        edtNome = new JTextField(50);

        lblCPF = new JLabel("CPF: ");
        edtCPF = new JTextField(14);
        
        txtCompl = new JTextArea("Informação complementar");
        
        btnCorFundo = new JButton ("Cadastrar");
        
        colorCor = new JColorChooser ();
        
    }

    public void addComponent() {

        add(lblTitulo);
        add(lblNome);
        add(lblCPF);

        add(edtNome);
        add(edtCPF);
        
        add (txtCompl);
        
        add(btnCorFundo);
        
        add(colorCor);
        

    }

    private void defPos() {
        // Setbounds( posicao x, posicao y, largura, altura )

        lblTitulo.setBounds(115, 15, 225, 20);
        lblNome.setBounds(25, 55, 100, 25);
        lblCPF.setBounds(25, 90, 100, 25);

        edtNome.setBounds(65, 55, 375, 25);
        edtCPF.setBounds(65, 90, 375, 25);
        
        txtCompl.setBounds (55, 130, 200, 150);
        
        btnCorFundo.setBounds (525, 400, 150, 50);
        
        colorCor.setBounds (275, 150, 400, 230);

    }

    public static void main(String[] args) {
        JavaS obj = new JavaS();
    }

}

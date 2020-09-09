/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import Menu.Menu;


/**
 *
 * @author Giovani
 */
public class Exercicio1 extends JFrame{
        private JLabel lblCod, lblNome, lblPrecoCusto, lblPrecoVenda, lblLucro, lblICMS, lblTribut, lblCST, lblNFE, lblUnMed, lblMarca, lblOrigem, lblCategoria, lblCodBarras, lblObrigat;
        private JTextField edtCod, edtNome, edtPrecoCusto, edtPrecoVenda, edtLucro, edtICMS, edtTribut, edtNFE, edtCST, edtUnMed, edtCodBarras;
        private JComboBox boxMarca, boxCategoria, boxOrigem;
        private JToolBar barTop;
        private JButton addMarca, addCategoria, btnNovo, btnGravar, btnDesfazer, btnExcluir, btnPesquisar, btnSuporte;
        private JLabel lblNovo, lblGravar, lblDesfazer, lblExcluir, lblPesquisar, lblSuporte;
       
        //github learning
    
    
    
    
    public  Exercicio1() {
        setTitle("Cadastramento Rápido de Produtos");
        setPreferredSize(new Dimension(1000, 500));
        setLayout(null);

        CriarComponente();
        AdicionarComponente();
        ConfigurarPosicoes();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //eventoBox();
        //botao();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public void CriarComponente(){
        lblCod = new JLabel("Código");
        lblNome = new JLabel("Nome");
        lblPrecoCusto = new JLabel("Preço Custo");
        lblPrecoVenda = new JLabel("Preço de Venda");
        lblLucro = new JLabel("Lucro %");
        lblICMS = new JLabel("ICMS %");
        lblTribut = new JLabel("Subst. Tributária");
        lblCST = new JLabel("CST - NFE");
        lblNFE = new JLabel("NCM - NFE");
        lblUnMed = new JLabel("Unidade Medida");
        lblMarca = new JLabel("Marca");
        lblOrigem = new JLabel("Origem");
        lblCategoria = new JLabel("Categoria");
        lblCodBarras = new JLabel("Código de Barras");
        lblObrigat = new JLabel("Campos em vermelho são obrigatórios para emissão de NF-e");
        
        edtCod = new JTextField();
        edtNome = new JTextField();
        edtPrecoCusto = new JTextField();
        edtPrecoVenda = new JTextField();
        edtLucro = new JTextField();
        edtICMS = new JTextField();
        edtTribut = new JTextField();
        edtNFE = new JTextField();
        edtCST = new JTextField();
        edtUnMed = new JTextField();
        edtCodBarras = new JTextField();
        
        boxMarca = new JComboBox();
        boxCategoria = new JComboBox();
        boxOrigem = new JComboBox();
        
        barTop = new JToolBar();
        
        
        addMarca = new JButton();
        addCategoria = new JButton();
        btnNovo = new JButton();
        btnGravar = new JButton();
        btnDesfazer = new JButton();
        btnExcluir = new JButton();
        btnPesquisar = new JButton();
        btnSuporte = new JButton();
        
        lblNovo = new JLabel ("Novo [F5]");
        lblGravar = new JLabel ("Gravar [F6]");
        lblDesfazer = new JLabel ("Desfazer");
        lblExcluir = new JLabel ("Excluir");
        lblPesquisar = new JLabel ("Pesquisar");
        lblSuporte = new JLabel ("Suporte");
        
        
        
        
    }
    
    
    public void AdicionarComponente(){
        
        add(lblCod);
        add(lblNome);
        add(lblPrecoCusto);
        add(lblPrecoVenda);
        add(lblLucro);
        add(lblICMS);
        add(lblTribut);
        add(lblCST);
        add(lblNFE);
        add(lblUnMed);
        add(lblMarca);
        add(lblOrigem);
        add(lblCategoria);
        add(lblCodBarras);
        add(lblObrigat);
        
        
        add(edtCod);
        add(edtNome);
        add(edtPrecoCusto);
        add(edtPrecoVenda);
        add(edtLucro);
        add(edtICMS);
        add(edtCST);
        add(edtTribut);
        add(edtNFE);
        add(edtUnMed);
        add(edtCodBarras);
        add(edtTribut);
        
        
        add(boxMarca);
        add(boxCategoria);
        add(boxOrigem);
        
        //add(barTop);
        
        add(addCategoria);
        add(addMarca);
        add(btnNovo);
        add(btnGravar);
        add(btnDesfazer);
        add(btnExcluir);
        add(btnPesquisar);
        add(btnSuporte);
        
        
        
        add(lblNovo);
        add(lblGravar);
        add(lblDesfazer);
        add(lblExcluir);
        add(lblPesquisar);
        add(lblSuporte);
        
        
    }    
    
    public void ConfigurarPosicoes(){
        //setbounds (pos x, pos y, x, y)
        
       // barTop.setBounds(0, 0, 1000, 50);
        
        
        lblCod.setBounds(20, 100, 100, 20);
        lblCod.setForeground(Color.blue);
        edtCod.setBounds(20, 120, 150, 20);
        edtCod.setBackground(Color.yellow);
        edtCod.setText("15");
        edtCod.setEditable(false);
        
        
        lblNome.setBounds(20, 150, 350, 20);
        lblNome.setForeground(Color.red);
        edtNome.setBounds(20, 170, 700, 20);
        
        
        lblPrecoCusto.setBounds(20, 200, 80, 20);
        lblPrecoCusto.setForeground(Color.blue);
        edtPrecoCusto.setBounds(20, 220, 220, 20);
        
        
        lblLucro.setBounds(260, 200, 220, 20);
        lblLucro.setForeground(Color.blue);
        edtLucro.setBounds(260, 220, 220, 20);
        
        
        lblPrecoVenda.setBounds(500, 200, 220, 20);
        lblPrecoVenda.setForeground(Color.red);
        edtPrecoVenda.setBounds(500, 220, 220, 20);
        
        
        lblICMS.setBounds(20, 250, 160, 20);
        lblICMS.setForeground(Color.blue);
        edtICMS.setBounds(20, 270, 160, 20);
        
        
        lblTribut.setBounds(200, 250, 200, 20);
        lblTribut.setForeground(Color.blue);
        edtTribut.setBounds(200, 270, 200, 20);
        
        
        lblCST.setBounds(420, 250, 130, 20);
        lblCST.setForeground(Color.black);
        edtCST.setBounds(420, 270, 130, 20);
        
        
        lblNFE.setBounds(570, 250, 150, 20);
        lblNFE.setForeground(Color.red);
        edtNFE.setBounds(570, 270, 150, 20);
        
        
        
        lblUnMed.setBounds(740, 250, 140, 20);
        lblUnMed.setForeground(Color.red);
        edtUnMed.setBounds(740, 270, 140, 20);
        
        
       lblMarca.setBounds(20, 300, 370, 20);
       lblMarca.setForeground(Color.blue);
       boxMarca.setBounds(20, 320, 370, 20);
       
       
       lblCategoria.setBounds(460, 300, 370, 20);
       lblCategoria.setForeground(Color.blue);
       boxCategoria.setBounds(460, 320, 370, 20);
       
       
       lblOrigem.setBounds(20, 350, 420, 20); 
       lblOrigem.setForeground(Color.red);
       boxOrigem.setBounds(20, 370, 420, 20);
       
       
       lblCodBarras.setBounds(460, 350, 420, 20);
       lblCodBarras.setForeground(Color.black);
       edtCodBarras.setBounds(460, 370, 420, 20);
        
        
       lblObrigat.setBounds(620, 420, 400, 20);
       lblObrigat.setForeground(Color.red);
        

      
       
       
        btnNovo.setBounds(20, 5, 70, 70);
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png")));
        btnNovo.setMargin(new Insets(0, 0, 0, 0));
        btnNovo.setBorder(null);
        btnNovo.setOpaque(false);
        btnNovo.setContentAreaFilled(false);
        btnNovo.setBorderPainted(false);
        lblNovo.setBounds(35, 75, 60, 15);
        
        
        
        btnGravar.setBounds(198, 5, 70, 70);
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png")));
        btnGravar.setMargin(new Insets(0, 0, 0, 0));
        btnGravar.setBorder(null);
        btnGravar.setOpaque(false);
        btnGravar.setContentAreaFilled(false);
        btnGravar.setBorderPainted(false);
        lblGravar.setBounds(198, 75, 80, 15);
        
        
        
        btnDesfazer.setBounds(376, 5, 70, 70);
        btnDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo.png")));
        btnDesfazer.setMargin(new Insets(0, 0, 0, 0));
        btnDesfazer.setBorder(null);
        btnDesfazer.setOpaque(false);
        btnDesfazer.setContentAreaFilled(false);
        btnDesfazer.setBorderPainted(false);
        lblDesfazer.setBounds(385, 75, 60, 15);
        
        
        
        btnExcluir.setBounds(554, 5, 70, 70);
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash.png")));
        btnExcluir.setMargin(new Insets(0, 0, 0, 0));
        btnExcluir.setBorder(null);
        btnExcluir.setOpaque(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setBorderPainted(false);
        lblExcluir.setBounds(570, 75, 60, 15);
        
      
        btnPesquisar.setBounds(732, 5, 70, 70);
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png")));
        btnPesquisar.setMargin(new Insets(0, 0, 0, 0));
        btnPesquisar.setBorder(null);
        btnPesquisar.setOpaque(false);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setBorderPainted(false);
        lblPesquisar.setBounds(735, 75, 60, 15);
        
        
        
        btnSuporte.setBounds(880, 5, 80, 70);
        btnSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suport.png")));
        btnSuporte.setMargin(new Insets(0, 0, 0, 0));
        btnSuporte.setBorder(null);
        btnSuporte.setOpaque(false);
        btnSuporte.setContentAreaFilled(false);
        btnSuporte.setBorderPainted(false);
        lblSuporte.setBounds(900, 75, 60, 15);
        
        
        
        
        
        
       
    }
    
 
    
    
    public static void main(String[] args) {
        Exercicio1 obj = new Exercicio1();
    }
    
    
}

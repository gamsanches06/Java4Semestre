/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Aula01.aula1_Exemplo1;
import Aula01.aula1_Exemplo2;
import Aula01.aula1_Exemplo3;
import Aula02.aula02_Exemplo01;
import Aula02.aula02_Exemplo02;
import Aula02.aula02_Exemplo03;
import Aula02.aula02_Exemplo04;
import Aula02.aula02_Exemplo05;
import Aula02.aula02_Exemplo06;
import Aula02.aula02_Exemplo07;
import Aula02.aula02_Exemplo08;
import Aula02.aula02_Exemplo09;
import Aula02.aula02_Exemplo10;
import Exercicios.Exercicio1;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author Giovani
 */
//--------------------------OPÇÃO DE TESTE DO SWITCH/IF ETC----------------------------------------------------
//JOptionPane.showMessageDialog(null, "Salve");
public class Menu extends JFrame {

    private JLabel lblTitulo, lblUnip, lblProf, lblExemplo;
    private JComboBox boxAula;
    private JButton btnEscolher, btnSair;
    private JLabel lblCelio;
    String[] aulaString = {"Aula 01 - Componentes GUI - parte 1",
        "Aula 02 - Eventos do Mouse - Deitel // Nova versão",
        "Aula 03 - Menus",
        "Aula 04 - Introducao a construcao de GUIs",
        "Aula 04.1 - Criando uma GUI Swing no NetBeans",
        "Aula 05 - Introdução ao JDBC",
        "Aula 06 - MVC",
        "Aula 07 - Hibernate",
        "Aula 08 - Hibernate – Relacionamentos",
        "Aula 09 - Relatórios",
        "Exercicios propostos"};
    int indexCombobox, indexExemplo;
    private JComboBox boxExemplo;
    private JScrollBar scrUpDown;

    String[] exemploString = {"Exemplo 1 - Layout simples", "Exemplo 2 - entrada de números"};

//------------------------------------------------------------------------------  
    public Menu() {
        setTitle("Menu de exemplos de aula");
        setPreferredSize(new Dimension(500, 480));
        setLayout(null);

        CriarComponente();
        AdicionarComponente();
        ConfigurarPosicoes();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        eventoBox();
        botao();

    }
//------------------------------------------------------------------------------ 

    public void CriarComponente() {
        lblTitulo = new JLabel("Selecione a Aula que irá ver:");
        boxAula = new JComboBox(aulaString);
        btnEscolher = new JButton("Selecionar");
        lblUnip = new JLabel("Unip - Ciência da Computação 4° Sem.",JLabel.CENTER);
        lblProf = new JLabel("Professor Ms. Célio Ricardo Castelano",JLabel.CENTER);
        lblCelio = new JLabel();
        boxExemplo = new JComboBox(exemploString);
        scrUpDown = new JScrollBar();
        btnSair = new JButton("Fechar");
        lblExemplo = new JLabel("Selecione o exemplo:");
    }
//------------------------------------------------------------------------------ 

    public void AdicionarComponente() {
        add(lblTitulo);
        add(boxAula);
        add(btnEscolher);
        add(lblUnip);
        add(lblProf);
        add(lblCelio);
        add(boxExemplo);
        add(lblExemplo);
        add(btnSair);
        
    }
//------------------------------------------------------------------------------ 

    public void ConfigurarPosicoes() {
        //setbounds (pos x, pos y, x, y)
        lblTitulo.setBounds(40, 15, 225, 20);
        boxAula.setBounds(40, 40, 400, 20);

        btnEscolher.setBounds(130, 200, 100, 35);
        btnEscolher.setBackground(Color.green);     
        btnSair.setBounds(250, 200, 100, 35);
        btnSair.setBackground(Color.red);
      
        lblUnip.setBounds(0, 300, 480, 15);
        lblUnip.setForeground(Color.GRAY);
        lblProf.setBounds(0, 315, 480, 15);
        lblProf.setForeground(Color.GRAY);

        lblExemplo.setBounds(40, 100, 400, 20);  
        boxExemplo.setBounds(40, 125, 400, 20);

    }
//------------------------------------------------------------------------------ 

    public void configBoxExemplo(String[] exemplobox) {
        boxExemplo.removeAllItems();
        DefaultComboBoxModel model = new DefaultComboBoxModel(exemplobox);
        boxExemplo.setModel(model);
        add(boxExemplo);
    }

//------------------------------------------------------------------------------  
    public void botao() {
        btnEscolher.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                indexExemplo = boxExemplo.getSelectedIndex();

                switch (indexCombobox) {
                    case 0:
                        switch (indexExemplo) {
                            case 0:
                                aula1_Exemplo1 aula1_ex1 = new aula1_Exemplo1();
                                break;
                            case 1:
                                aula1_Exemplo2 aula1_ex2 = new aula1_Exemplo2();
                                break;
                            case 2:
                                aula1_Exemplo3 aula1_ex3 = new aula1_Exemplo3();
                                break;
                        }
                        break;
                    case 1:
                        switch (indexExemplo) {
                            case 0:
                                aula02_Exemplo01 aula2_ex1 = new aula02_Exemplo01();
                                break;
                            case 1:
                                aula02_Exemplo02 aula2_ex2 = new aula02_Exemplo02();
                                break;
                            case 2:
                                aula02_Exemplo03 aula2_ex3 = new aula02_Exemplo03();
                                break;
                            case 3:
                                aula02_Exemplo04 aula2_ex4 = new aula02_Exemplo04();
                                break;
                            case 4:
                                aula02_Exemplo05 aula2_ex5 = new aula02_Exemplo05();
                                break;
                            case 5:
                                aula02_Exemplo06 aula2_ex6 = new aula02_Exemplo06();
                                break;
                            case 6:
                                aula02_Exemplo07 aula2_ex7 = new aula02_Exemplo07();
                                break;
                            case 7:
                                aula02_Exemplo08 aula2_ex8 = new aula02_Exemplo08();
                                break;
                            case 8:
                                aula02_Exemplo09 aula2_ex9 = new aula02_Exemplo09();
                                break;
                            case 9:
                                aula02_Exemplo10 aula2_ex10 = new aula02_Exemplo10();
                                break;

                            
                        }
                        break;
                    case 2:
                        //menuAula2/
                        break;
                    case 3:
                        //menuAula1; 
                        break;
                    case 4:
                        //menuAula2/
                        break;
                    case 5:
                        //menuAula2/
                        break;
                    case 6:
                        //menuAula1; 
                        break;
                    case 7:
                        //menuAula2/ 
                        break;
                    case 8:
                        //menuAula2/
                        break;
                    case 9:
                        //menuAula2/
                        break;
                    case 10:
                        switch (indexExemplo) {
                            case 0:
                                Exercicio1 Ex1 = new Exercicio1();
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                        break;

                }

            }
        });

    }

//------------------------------------------------------------------------------
    public void eventoBox() {
        boxAula.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                indexCombobox = boxAula.getSelectedIndex();

                switch (indexCombobox) {
                    case 0:
                        String[] exemploAula1 = {"Exemplo 1 - Layout simples ", "Exemplo 2 - entrada de números", "Exemplo 3 - Layout Absoluto"};
                        configBoxExemplo(exemploAula1);

                        break;
                    case 1:
                        String[] exemploAula2 = {
                        "Exemplo 1 - Desktop Frame (sem main)",
                        "Exemplo 2 - Desktop Test",
                        "Exemplo 3 - Key Demo",
                        "Exemplo 4 - Key Demo Frame (sem main)",
                        "Exemplo 5 - Mouse Details ",
                        "Exemplo 6 - Mouse Details Frame (sem main)",
                        "Exemplo 7 - Mouse Tracker",
                        "Exemplo 8 - Mouse Tracker Frame(sem main)",
                        "Exemplo 9 - Paint Panel",
                        };
                        configBoxExemplo(exemploAula2);
                        break;
                    case 2:
                        String[] exemploAula3 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula3);
                        break;
                    case 3:
                        String[] exemploAula4 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula4);
                        break;
                    case 4:
                        String[] exemploAula5 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula5);
                        break;
                    case 5:
                        String[] exemploAula6 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula6);
                        break;
                    case 6:
                        String[] exemploAula7 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula7);
                        break;
                    case 7:
                        String[] exemploAula8 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula8);
                        break;
                    case 8:
                        String[] exemploAula9 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula9);
                        break;
                    case 9:
                        String[] exemploAula10 = {"Sem exemplos ainda"};
                        configBoxExemplo(exemploAula10);
                        break;
                    case 10:
                        String[] Exercicios = {"Exercicio proposto 1 - Menu Cadastro Rápido"};
                        configBoxExemplo(Exercicios);

                }

            }
        });
    }

//------------------------------------------------------------------------------
    public static void main(String[] args) {

        new Menu();

    }

}

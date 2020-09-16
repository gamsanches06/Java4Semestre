package Aula03;


/*
    1) Extender o JFRame
    2) Declarar os objetos de menu que serão utilizados
        2.1) JMenuBar
        2.2) JMenu
        2.3) JMenuItem
    3) Utilizar as 4 etapas para trabalhar ocm objetos Swing no Java 
        3.1) Declarar
        3.2) Instanciar
        3.3) Posicionar
        3.4) Adicionar
    4) Método construtor para executar as 4 etapas
    5) Método main para instanciar a classe

*/
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class menuSimples extends JFrame{
    JMenuBar barraMenu;
    JMenu menuCadastro, menuRelatorios;
    JMenuItem itemMenuCadastroCliente, itemMenuCadastroProduto, itemMenuRelatorioCliente, itemMenuRelatorioProduto;
    
 
    
    public void instanciar(){
        barraMenu = new JMenuBar();
        
        menuCadastro = new JMenu("Cadastros");
        
        menuRelatorios = new JMenu("Relatórios");
        
        itemMenuCadastroCliente = new JMenuItem ("Clientes");
        itemMenuCadastroProduto = new JMenuItem ("Produtos");
        
        
        itemMenuRelatorioCliente = new JMenuItem ("Clientes em débito");
        itemMenuRelatorioProduto = new JMenuItem ("Produtos em falta");
        
    }
    
    public void posicionar() {
        
    }
    
    public void adicionar() {
        setJMenuBar(barraMenu);    // adicionar a barra de menu no frame
        
        barraMenu.add(menuCadastro);    //adiciona o menu de cadastro na barra de menus
        barraMenu.add(menuRelatorios);  // adicionar o menu de relatorios na barra de menus
        
        
        menuCadastro.add(itemMenuCadastroCliente);
        menuCadastro.add(itemMenuCadastroProduto);
        
        
        menuRelatorios.add(itemMenuRelatorioCliente);
        menuRelatorios.add(itemMenuRelatorioProduto);
        
    }
    
    
    public menuSimples(){
        super("Trabalhando com menus no Java Swing");
        
        setPreferredSize(new Dimension(500, 400));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        instanciar();
        posicionar();
        adicionar();
        
        
        setVisible(true);
        pack();
    }
    
    public static void main(String[] args) {
        menuSimples obj = new menuSimples();
    }
    
}

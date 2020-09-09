/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;


import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Giovani
 */
public class aula02_Exemplo08 extends JFrame{
    
    
   private JPanel mousePanel; // painel em que os eventos de mouse ocorrer�o
   private JLabel statusBar; // r�tulo que exibe informa��es de evento

   // construtor MouseTrackerFrame configura GUI e
   // registra handlers de evento de mouse
   public aula02_Exemplo08()
   {
      super( "Demonstrating Mouse Events" );

      mousePanel = new JPanel(); // cria painel
      mousePanel.setBackground( Color.WHITE ); // configura cor de fundo
      add( mousePanel, BorderLayout.CENTER ); // adiciona painel ao JFrame

      statusBar = new JLabel( "Mouse outside JPanel" );           
      add( statusBar, BorderLayout.SOUTH ); // adiciona r�tulo ao JFrame

      // cria e registra listener para mouse e eventos de movimento de mouse
      MouseHandler handler = new MouseHandler();                       
      mousePanel.addMouseListener( handler );                          
      mousePanel.addMouseMotionListener( handler );
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   } // fim do construtor de MouseTrackerFrame

   private class MouseHandler implements MouseListener,  MouseMotionListener                              
   {
      // Handlers de evento de MouseListener
      // trata evento quando o mouse � liberado logo depois de pressionado
      public void mouseClicked( MouseEvent event )
      {
         statusBar.setText( String.format( "Clicked at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseClicked

      // trata evento quando mouse � pressionado
      public void mousePressed( MouseEvent event )
      {
         statusBar.setText( String.format( "Pressed at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mousePressed

      // trata evento quando mouse � liberado depois da opera��o de arrastar
      public void mouseReleased( MouseEvent event )
      {
         statusBar.setText( String.format( "Released at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseReleased

      // trata evento quando mouse entra na �rea
      public void mouseEntered( MouseEvent event )
      {
         statusBar.setText( String.format( "Mouse entered at [%d, %d]", 
            event.getX(),event.getY() ) );
         mousePanel.setBackground( Color.BLUE );
      } // fim do m�todo mouseEntered

      // trata evento quando mouse sai da �rea
      public void mouseExited( MouseEvent event )
      {
         statusBar.setText( "Mouse outside JPanel" );
         mousePanel.setBackground( Color.WHITE );
      } // mouseExited fim do m�todo

      // Handlers de evento de MouseMotionListener
      // trata evento quando usu�rio arrasta o mouse com o bot�o pressionado
      public void mouseDragged( MouseEvent event )
      {
         statusBar.setText( String.format( "Dragged at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseDragged

      // trata evento quando usu�rio move o mouse
      public void mouseMoved( MouseEvent event )
      {
         statusBar.setText( String.format( "Moved at [%d, %d]", 
            event.getX(),event.getY() ) );
      } // fim do m�todo mouseMoved
   } // fim da classe interna MouseHandler
   

} // fim da classe MouseTrackerFrame

    


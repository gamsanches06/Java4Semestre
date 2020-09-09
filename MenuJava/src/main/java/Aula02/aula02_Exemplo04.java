/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Giovani
 */
public class aula02_Exemplo04 extends JFrame implements KeyListener {

    private String line1 = ""; // primeira linha de textarea
    private String line2 = ""; // segunda linha de textarea
    private String line3 = ""; // terceira linha de textarea
    private JTextArea textArea; // textarea a exibir sa�da

     public aula02_Exemplo04()
   {
      super( "Demonstrating Keystroke Events" );

      textArea = new JTextArea( 10, 15 ); // configura JTextArea
      textArea.setText( "Press any key on the keyboard..." );
      textArea.setEnabled( false ); // desativa textarea
      textArea.setDisabledTextColor( Color.BLACK ); // configura cor de texto
      add( textArea ); // adiciona textarea ao JFrame

      addKeyListener( this ); // permite que o frame processe os eventos de teclado
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   } // fim do construtor KeyDemoFrame

   // trata pressionamento de qualquer tecla
   public void keyPressed( KeyEvent event )
   {
      line1 = String.format( "Key pressed: %s", 
         event.getKeyText( event.getKeyCode() )); // gera sa�da de tecla pressionada
      setLines2and3( event ); // configura a sa�da das linhas dois e tr�s
   } // fim do m�todo keyPressed

   // trata libera��o de qualquer tecla
   public void keyReleased( KeyEvent event )
   {
      line1 = String.format( "Key released: %s",
         event.getKeyText( event.getKeyCode() )); // gera sa�da de tecla liberada
      setLines2and3( event ); // configura a sa�da das linhas dois e tr�s
   } // fim do m�todo keyReleased

   // trata pressionamento de uma tecla de a��o
   public void keyTyped( KeyEvent event )
   {
      line1 = String.format( "Key typed: %s", event.getKeyChar());
      setLines2and3( event ); // configura a sa�da das linhas dois e tr�s
   } // fim do m�todo keyTyped

   // configura segunda e terceira linhas de sa�da
   private void setLines2and3( KeyEvent event )
   {
      line2 = String.format( "This key is %san action key", 
         (event.isActionKey() ? "" : "not " ) );

      String temp = event.getKeyModifiersText( event.getModifiers() );

      line3 = String.format( "Modifier keys pressed: %s", 
         ( temp.equals( "" ) ? "none" : temp ) ); // modificadores de sa�da

      textArea.setText( String.format( "%s\n%s\n%s\n", 
         line1, line2, line3 ) ); // gera sa�da de tr�s linhas de texto
   } // fim do m�todo setLines2and3
   
} // fim da classe KeyDemoFrame

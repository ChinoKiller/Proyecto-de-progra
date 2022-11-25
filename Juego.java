//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.Math;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.net.URL;


public class Juego extends JPanel{

    Mapa mapa = new Mapa();
    Personaje personaje = new Personaje();
    Enemigo enemigo1 = new Enemigo((int)(Math.random()*(12-1+1)+1),(int)(Math.random()*(21-7+1)+7));
    Enemigo enemigo2 = new Enemigo((int)(Math.random()*(12-1+1)+1),(int)(Math.random()*(36-27+1)+27));
    Enemigo enemigo3 = new Enemigo((int)(Math.random()*(38-18+1)+18),(int)(Math.random()*(12-1+1)+1));
    Enemigo enemigo4 = new Enemigo((int)(Math.random()*(38-19+1)+19),(int)(Math.random()*(25-18+1)+18));
    Enemigo enemigo5 = new Enemigo((int)(Math.random()*(38-19+1)+19),(int)(Math.random()*(36-31+1)+31));


    public Juego(){
        addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.movimiento(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        setFocusable(true);
    }

    //URL iconURL = getClass().getResource("/some/package/favicon.png");
    //ImageIcon icon = new ImageIcon(iconURL);

    @Override
    public void paint (Graphics grafico){ //Aquí se va a hacer cada print.
        mapa.paint(grafico);
        personaje.paint(grafico);
        enemigo1.paint(grafico);
        enemigo2.paint(grafico);
        enemigo3.paint(grafico);
        enemigo4.paint(grafico);
        enemigo5.paint(grafico);
    }
    public static void main(String args[]){
        
        JFrame ventana = new JFrame("Proyecto Dos");
        Juego juego = new Juego();

        ventana.add(juego);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setBackground(Color.black);
        //ventana.setIconImage(new ImageIcon());
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            juego.repaint();
        }
    }
}
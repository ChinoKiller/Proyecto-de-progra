//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import javafx.scene.image.Image;

import java.lang.Math;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.net.URL;


public class Juego extends JPanel{

    Mapa mapa = new Mapa();

    Jugador personaje = new Jugador(1,1);

    Enemigo enemigo1 = new Enemigo((int)(Math.random()*(16-1+1)+1),(int)(Math.random()*(19-7+1)+7));
    Enemigo enemigo2 = new Enemigo((int)(Math.random()*(16-1+1)+1),(int)(Math.random()*(39-25+1)+25));
    Enemigo enemigo3 = new Enemigo((int)(Math.random()*(39-22+1)+22),(int)(Math.random()*(10-1+1)+1));
    Enemigo enemigo4 = new Enemigo((int)(Math.random()*(39-22+1)+22),(int)(Math.random()*(24-16+1)+16));
    Enemigo enemigo5 = new Enemigo((int)(Math.random()*(39-22+1)+22),(int)(Math.random()*(39-30+1)+30));

    Piedra piedra1 = new Piedra((int)(Math.random()*(13-7+1)+7),(int)(Math.random()*(6-1+1)+1));
    Piedra piedra2 = new Piedra((int)(Math.random()*(7-1+1)+1),(int)(Math.random()*(17-10+1)+10));
    Piedra piedra3 = new Piedra((int)(Math.random()*(18-12+1)+12),(int)(Math.random()*(20-12+1)+12));
    Piedra piedra4 = new Piedra((int)(Math.random()*(8-1+1)+1),(int)(Math.random()*(26-21+1)+21));
    Piedra piedra5 = new Piedra((int)(Math.random()*(10-1+1)+1),(int)(Math.random()*(32-30+1)+30));
    Piedra piedra6 = new Piedra((int)(Math.random()*(10-1+1)+1),(int)(Math.random()*(39-36+1)+36));
    Piedra piedra7 = new Piedra((int)(Math.random()*(19-14+1)+14),(int)(Math.random()*(32-24+1)+24));
    Piedra piedra8 = new Piedra((int)(Math.random()*(24-14+1)+14),(int)(Math.random()*(39-36+1)+36));
    Piedra piedra9 = new Piedra((int)(Math.random()*(39-28+1)+28),(int)(Math.random()*(39-34+1)+34));
    Piedra piedra10 = new Piedra((int)(Math.random()*(39-33+1)+33),(int)(Math.random()*(30-23+1)+23));
    Piedra piedra11 = new Piedra((int)(Math.random()*(29-23+1)+23),(int)(Math.random()*(26-20+1)+20));
    Piedra piedra12 = new Piedra((int)(Math.random()*(39-34+1)+34),(int)(Math.random()*(19-12+1)+12));
    Piedra piedra13 = new Piedra((int)(Math.random()*(30-22+1)+22),(int)(Math.random()*(15-12+1)+12));
    Piedra piedra14 = new Piedra((int)(Math.random()*(38-28+1)+28),(int)(Math.random()*(8-2+1)+2));
    Piedra piedra15 = new Piedra((int)(Math.random()*(23-17+1)+17),(int)(Math.random()*(8-1+1)+1));
    //static fondoPanel fondo = new fondoPanel();

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

        mapa.setPosicionEnMatriz(enemigo1.getPosX(), enemigo1.getPosY(), 3);

        personaje.paint(grafico);

        enemigo1.paint(grafico);
        enemigo2.paint(grafico);
        enemigo3.paint(grafico);
        enemigo4.paint(grafico);
        enemigo5.paint(grafico);

        piedra1.paint(grafico);
        piedra2.paint(grafico);
        piedra3.paint(grafico);
        piedra4.paint(grafico);
        piedra5.paint(grafico);
        piedra6.paint(grafico);
        piedra7.paint(grafico);
        piedra8.paint(grafico);
        piedra9.paint(grafico);
        piedra10.paint(grafico);
        piedra11.paint(grafico);
        piedra12.paint(grafico);
        piedra13.paint(grafico);
        piedra14.paint(grafico);
        piedra15.paint(grafico);
    }

    public static void main(String args[]){
        
        JFrame ventana = new JFrame("Proyecto Dos");
        Juego juego = new Juego();
        ventana.add(juego);
        //ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //ventana.setUndecorated(true);
        ventana.setSize(755, 735);
        ventana.setLocationRelativeTo(null);
        ventana.setBackground(Color.CYAN);
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

    /*static class fondoPanel extends JPanel{
        private java.awt.Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/inicial.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }*/
}
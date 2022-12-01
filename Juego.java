//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



import java.lang.Math;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Juego extends JPanel{
   
    static Mapa mapa = new Mapa();

    static Jugador personaje = new Jugador(1,1);

    static Enemigo enemigo1 = new Enemigo((int)(Math.random()*(16-1+1)+1),(int)(Math.random()*(19-7+1)+7));
    static Enemigo enemigo2 = new Enemigo((int)(Math.random()*(16-1+1)+1),(int)(Math.random()*(39-25+1)+25));
    static Enemigo enemigo3 = new Enemigo((int)(Math.random()*(39-22+1)+22),(int)(Math.random()*(10-1+1)+1));
    static Enemigo enemigo4 = new Enemigo((int)(Math.random()*(39-22+1)+22),(int)(Math.random()*(24-16+1)+16));
    static Enemigo enemigo5 = new Enemigo((int)(Math.random()*(39-22+1)+22),(int)(Math.random()*(39-30+1)+30));

    static Señuelo señuelo1 = new Señuelo();
    static Señuelo señuelo2 = new Señuelo();
    static Señuelo señuelo3 = new Señuelo();
    static Señuelo señuelo4 = new Señuelo();
    static Señuelo señuelo5 = new Señuelo();




    static Piedra piedra1 = new Piedra((int)(Math.random()*(13-7+1)+7),(int)(Math.random()*(6-1+1)+1));
    static Piedra piedra2 = new Piedra((int)(Math.random()*(7-1+1)+1),(int)(Math.random()*(17-10+1)+10));
    static Piedra piedra3 = new Piedra((int)(Math.random()*(18-12+1)+12),(int)(Math.random()*(20-12+1)+12));
    static Piedra piedra4 = new Piedra((int)(Math.random()*(8-1+1)+1),(int)(Math.random()*(26-21+1)+21));
    static Piedra piedra5 = new Piedra((int)(Math.random()*(10-1+1)+1),(int)(Math.random()*(32-30+1)+30));
    static Piedra piedra6 = new Piedra((int)(Math.random()*(10-1+1)+1),(int)(Math.random()*(39-36+1)+36));
    static Piedra piedra7 = new Piedra((int)(Math.random()*(19-14+1)+14),(int)(Math.random()*(32-24+1)+24));
    static Piedra piedra8 = new Piedra((int)(Math.random()*(24-14+1)+14),(int)(Math.random()*(39-36+1)+36));
    static Piedra piedra9 = new Piedra((int)(Math.random()*(39-28+1)+28),(int)(Math.random()*(39-34+1)+34));
    static Piedra piedra10 = new Piedra((int)(Math.random()*(39-33+1)+33),(int)(Math.random()*(30-23+1)+23));
    static Piedra piedra11 = new Piedra((int)(Math.random()*(29-23+1)+23),(int)(Math.random()*(26-20+1)+20));
    static Piedra piedra12 = new Piedra((int)(Math.random()*(39-34+1)+34),(int)(Math.random()*(19-12+1)+12));
    static Piedra piedra13 = new Piedra((int)(Math.random()*(30-22+1)+22),(int)(Math.random()*(15-12+1)+12));
    static Piedra piedra14 = new Piedra((int)(Math.random()*(38-28+1)+28),(int)(Math.random()*(8-2+1)+2));
    static Piedra piedra15 = new Piedra((int)(Math.random()*(23-17+1)+17),(int)(Math.random()*(8-1+1)+1));
 

    public Juego(){
        addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
               
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.movimiento(e);
                personaje.picar(e);
                piedra1.picar(e);
                piedra2.picar(e);
                piedra3.picar(e);
                piedra4.picar(e);
                piedra5.picar(e);
                piedra6.picar(e);
                piedra7.picar(e);
                piedra8.picar(e);
                piedra9.picar(e);
                piedra10.picar(e);
                piedra11.picar(e);
                piedra12.picar(e);
                piedra13.picar(e);
                piedra14.picar(e);
                piedra15.picar(e);
                señuelo1.picar(e);
                señuelo2.picar(e);
                señuelo3.picar(e);
                señuelo4.picar(e);
                señuelo5.picar(e);








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
        if(señuelo1.fueLlamado==true){
            señuelo1.paint1(grafico);
        }else{
            señuelo1.paint(grafico);
        }
        
        if(señuelo2.fueLlamado==true){
            señuelo2.paint1(grafico);
        }else{
            señuelo2.paint(grafico);
        }
        
        if(señuelo3.fueLlamado==true){
            señuelo3.paint1(grafico);
        }else{
            señuelo3.paint(grafico);
        }
        
        if(señuelo4.fueLlamado==true){
            señuelo4.paint1(grafico);
        }else{
            señuelo4.paint(grafico);
        }
        
        if(señuelo5.fueLlamado==true){
            señuelo5.paint1(grafico);
        }else{
            señuelo5.paint(grafico);
        }
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
            perseguir();
            actualizarMatriz();
            señuelos();
            juego.repaint();
           
        }
    }


    public static void actualizarMatriz(){ //actualiza la posición de cada elemento en la matríz principal
    
        mapa.limpiarMapa();
        mapa.setPosicionEnMatriz(enemigo1.getPosX(), enemigo1.getPosY(), 3);
        mapa.setPosicionEnMatriz(enemigo2.getPosX(), enemigo2.getPosY(), 3);
        mapa.setPosicionEnMatriz(enemigo3.getPosX(), enemigo3.getPosY(), 3);
        mapa.setPosicionEnMatriz(enemigo4.getPosX(), enemigo4.getPosY(), 3);
        mapa.setPosicionEnMatriz(enemigo5.getPosX(), enemigo5.getPosY(), 3);
        mapa.setPosicionEnMatriz(personaje.getPosX(), personaje.getPosY(), 2);
        mapa.setPosicionEnMatriz(piedra1.getPosX(), piedra1.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra2.getPosX(), piedra2.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra3.getPosX(), piedra3.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra4.getPosX(), piedra4.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra5.getPosX(), piedra5.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra6.getPosX(), piedra6.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra7.getPosX(), piedra7.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra8.getPosX(), piedra8.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra9.getPosX(), piedra9.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra10.getPosX(), piedra10.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra11.getPosX(), piedra11.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra12.getPosX(), piedra12.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra13.getPosX(), piedra13.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra14.getPosX(), piedra14.getPosY(), 4);
        mapa.setPosicionEnMatriz(piedra15.getPosX(), piedra15.getPosY(), 4);
        mapa.setPosicionEnMatriz(señuelo1.getPosX(), señuelo1.getPosY(), 5);
        mapa.setPosicionEnMatriz(señuelo2.getPosX(), señuelo2.getPosY(), 5);
        mapa.setPosicionEnMatriz(señuelo3.getPosX(), señuelo3.getPosY(), 5);
        mapa.setPosicionEnMatriz(señuelo4.getPosX(), señuelo4.getPosY(), 5);
        mapa.setPosicionEnMatriz(señuelo5.getPosX(), señuelo5.getPosY(), 5);
        actualizarEntornos();
    }    
    


    public static void actualizarEntornos(){
        personaje.actualizarEntornoJugador(mapa);
        enemigo1.actualizarEntornoJugador(mapa);
        enemigo2.actualizarEntornoJugador(mapa);
        enemigo3.actualizarEntornoJugador(mapa);
        enemigo4.actualizarEntornoJugador(mapa);
        enemigo5.actualizarEntornoJugador(mapa);
        piedra1.actualizarEntornoJugador(mapa);
        piedra2.actualizarEntornoJugador(mapa);
        piedra3.actualizarEntornoJugador(mapa);
        piedra4.actualizarEntornoJugador(mapa);
        piedra5.actualizarEntornoJugador(mapa);
        piedra6.actualizarEntornoJugador(mapa);
        piedra7.actualizarEntornoJugador(mapa);
        piedra8.actualizarEntornoJugador(mapa);
        piedra9.actualizarEntornoJugador(mapa);
        piedra10.actualizarEntornoJugador(mapa);
        piedra11.actualizarEntornoJugador(mapa);
        piedra12.actualizarEntornoJugador(mapa);
        piedra13.actualizarEntornoJugador(mapa);
        piedra14.actualizarEntornoJugador(mapa);
        piedra15.actualizarEntornoJugador(mapa);

        
    }



    public static void perseguir(){
        enemigo1.movimiento(personaje);
        enemigo2.movimiento(personaje);
        enemigo3.movimiento(personaje);
        enemigo4.movimiento(personaje);
        enemigo5.movimiento(personaje);
    }

    public static void spawnSeñuelo(Enemigo enemigo, Señuelo señuelo){
        int[][] mapaLocal = mapa.obtenerMapa();
        if(enemigo.colocarSeñuelo()){
            if (mapaLocal[(enemigo.getPosX()-1)][enemigo.getPosY()] == 0){         
                señuelo.setPosX(enemigo.getPosX()-1);
                señuelo.setPosY(enemigo.getPosY());
            }else if(mapaLocal[(enemigo.getPosX()+1)][enemigo.getPosY()] == 0){       
                señuelo.setPosX(enemigo.getPosX()+1);
                señuelo.setPosY(enemigo.getPosY());
            }else if(mapaLocal[(enemigo.getPosX())][enemigo.getPosY()-1] == 0){           
                señuelo.setPosX(enemigo.getPosX());
                señuelo.setPosY(enemigo.getPosY()-1);
            }else if(mapaLocal[(enemigo.getPosX())][enemigo.getPosY()+1] == 0){          
                señuelo.setPosX(enemigo.getPosX());
                señuelo.setPosY(enemigo.getPosY()+1);
            }
            señuelo.fueLlamado = true;
        }
    }


    public static void señuelos(){
        spawnSeñuelo(enemigo1, señuelo1);
        spawnSeñuelo(enemigo2, señuelo2);
        spawnSeñuelo(enemigo3, señuelo3);
        spawnSeñuelo(enemigo4, señuelo4);
        spawnSeñuelo(enemigo5, señuelo5);
    }

}
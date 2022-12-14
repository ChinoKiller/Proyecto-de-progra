import java.awt.Graphics;

import java.awt.event.KeyEvent;

import java.awt.Color;

public class Piedra {

    Mapa mapaObj = new Mapa();
    private int ancho = 20;
    private int alto = 20;
    private int posX;
    private int posY;

    public Piedra(int posicionEnX, int posicionEnY){
        this.posX = posicionEnX;
        this.posY = posicionEnY;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.GRAY);
        grafico.fillOval(getPosX() * 18, getPosY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);

    }

    public void desaparece() {
        
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posicionEnX) {
        this.posX = posicionEnX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posicionEnY) {
        this.posY = posicionEnY;
    }
    
    public void picar(KeyEvent evento) { 
        int[][] mapa = mapaObj.obtenerMapa();
        if(evento.getKeyCode() == 32 && mapa[(getPosX()-1)][getPosY()] == 2 || mapa[(getPosX()+1)][getPosY()] == 2 || mapa[(getPosX())][getPosY()+1] == 2 || mapa[(getPosX())][getPosY()-1] == 2){
            setPosX(0);
            setPosY(0);
        } 
    }


    public void actualizarEntornoJugador(Mapa mapa){ //recibe el mapa principal y actualiza el local con las posiciones de los objetos.
        mapaObj = mapa; 
     }



}
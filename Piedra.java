import java.awt.Graphics;

import java.awt.Color;

public class Piedra {

    Mapa mapaObj = new Mapa();
    private int ancho = 20;
    private int alto = 20;
    private int posicionEnX;
    private int posicionEnY;

    public Piedra(int posicionEnX, int posicionEnY){
        this.posicionEnX = posicionEnX;
        this.posicionEnY = posicionEnY;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.GRAY);
        grafico.fillOval(getPosicionEnX() * 18, getPosicionEnY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);

    }

    public void desaparece() {
        
    }

    public int getPosicionEnX() {
        return posicionEnX;
    }

    public void setPosicionEnX(int posicionEnX) {
        this.posicionEnX = posicionEnX;
    }

    public int getPosicionEnY() {
        return posicionEnY;
    }

    public void setPosicionEnY(int posicionEnY) {
        this.posicionEnY = posicionEnY;
    }
}
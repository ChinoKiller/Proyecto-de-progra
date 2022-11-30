import java.awt.Graphics;

import java.awt.Color;
public class Señuelo {

    Mapa mapaObj = new Mapa();
    private int ancho = 20;
    private int alto = 20;
    private int posX;
    private int posY;

    public Señuelo(int posicionEnX, int posicionEnY){
        this.posX = posicionEnX;
        this.posY = posicionEnY;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.GRAY);
        grafico.fillOval(getPosX() * 18, getPosY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);

    }

    public void explotar() {
        
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

    
}

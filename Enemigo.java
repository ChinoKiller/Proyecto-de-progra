import java.awt.Graphics;
import java.awt.Color;

public class Enemigo {

    Mapa mapaObj = new Mapa();

    private int posicionEnX;
    private int posicionEnY;
    private int ancho = 20;
    private int alto = 20;

    public Enemigo(int posicionEnX, int posicionEnY){
        this.posicionEnX = posicionEnX;
        this.posicionEnY = posicionEnY;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.red);
        grafico.fillOval(posicionEnX * 20, posicionEnY * 20, ancho, alto);
        grafico.setColor(Color.black);
        grafico.drawRect(posicionEnX * 20, posicionEnY * 19, ancho, alto);

    }

    public int getPosicionEnX() {
        return posicionEnX;
    }

    public int getPosicionEnY() {
        return posicionEnY;
    }
}
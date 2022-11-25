import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Color;

public class Personaje {

    Mapa mapaObj = new Mapa();

    int vidas = 0; // A lo mejor las vidas podrían ser un contador en el main.
    private int posicionEnX = 1;
    private int posicionEnY = 1;
    private int ancho = 20;
    private int alto = 20;

    public void paint(Graphics grafico) {
        grafico.setColor(Color.green);
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

    public void movimiento(KeyEvent evento) { // Ahorita hago este método.
        int[][] mapa = mapaObj.obtenerMapa();

        if (evento.getKeyCode() == 87) {
            if (mapa[posicionEnX][(posicionEnY)-1] != 1) {
                posicionEnY -= 1;
            }
        }
        if (evento.getKeyCode() == 83) {
            if(mapa[posicionEnX][(posicionEnY)+3] != 1){
                posicionEnY += 1;
            }
        }
        if (evento.getKeyCode() == 65) {
            if (mapa[(posicionEnX-1)][posicionEnY] != 1) {
                posicionEnX -= 1;
            }
        }
        if (evento.getKeyCode() == 68) {
            if (mapa[(posicionEnX)+1][posicionEnY] != 1) {
                posicionEnX += 1;
            }
        }
    }

    public void picar() {

    }
}
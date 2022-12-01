import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class Señuelo {

    Mapa mapaObj = new Mapa();
    private int ancho = 20;
    private int alto = 20;
    private int posX;
    private int posY;
    public boolean fueLlamado = false;

    

    public void paint1(Graphics grafico) {
        grafico.setColor(Color.GRAY);
        grafico.fillOval(getPosX() * 18, getPosY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);
    }
    public void paint(Graphics grafico) {
        grafico.setColor(Color.blue);
        grafico.fillRect(posX*18, posY*17, ancho, alto); 
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

    public void actualizarEntornoJugador(Mapa mapa){ //recibe el mapa principal y actualiza el local con las posiciones de los objetos.
        mapaObj = mapa; 
     }
    
     public void picar(KeyEvent evento) { 
        int[][] mapa = mapaObj.obtenerMapa();
        if(evento.getKeyCode() == 32 && mapa[(getPosX()-1)][getPosY()] == 2 || mapa[(getPosX()+1)][getPosY()] == 2 || mapa[(getPosX())][getPosY()+1] == 2 || mapa[(getPosX())][getPosY()-1] == 2){
            setPosX(0);
            setPosY(0);
        } 
    }
}

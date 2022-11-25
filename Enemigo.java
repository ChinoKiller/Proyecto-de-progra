import java.awt.Graphics;

import Entidad.Personaje;

import java.awt.Color;

public class Enemigo extends Personaje {

    Mapa mapaObj = new Mapa();
    private boolean puedeColocarSeñuelo;
    private int ancho;
    private int alto;

    public Enemigo(int posicionEnX, int posicionEnY){
        super(2,posicionEnX,posicionEnY);
        this.ancho = 20;
        this.alto = 20;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.red);
        grafico.fillOval(getPosX() * 20, getPosY() * 20, ancho, alto);
        grafico.setColor(Color.black);
        grafico.drawRect(getPosX() * 20, getPosY() * 19, ancho, alto);

    }

 

    @Override
    public void moverse() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void morir() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        
    }
    
    public void colocarSeñuelo(){
        
    }
}
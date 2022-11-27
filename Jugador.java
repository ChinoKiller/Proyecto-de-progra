import java.awt.event.KeyEvent;

import Entidad.Personaje;

import java.awt.Graphics;
import java.awt.Color;

public class Jugador extends Personaje {

    private int cantPiedras;

    Mapa mapaObj = new Mapa();

 
    private int ancho;
    private int alto;

    

    
    public Jugador(int posX, int posY) {
        super(10, posX, posY);
        this.ancho = 20;
        this.alto = 20;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.green);
        grafico.fillOval(getPosX() * 18, getPosY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);

    }


    public void setCantPiedras(int cantPiedras) {
        this.cantPiedras = cantPiedras;
    }

    public void movimiento(KeyEvent evento) { // Ahorita hago este método.
        int[][] mapa = mapaObj.obtenerMapa();

        if (evento.getKeyCode() == 87) {
            if (mapa[getPosX()][(getPosY())-1] == 0) {
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 0);
                setPosY(getPosY()-1);
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 2);
                mapa = mapaObj.obtenerMapa(); //esto fue desesperación xd.
            }
        }
        if (evento.getKeyCode() == 83) {
            if(mapa[getPosX()][(getPosY())+1] == 0){
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 0);
                setPosY(getPosY()+1);
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 2);
                mapa = mapaObj.obtenerMapa();
            }
        }
        if (evento.getKeyCode() == 65) {
            if (mapa[(getPosX()-1)][getPosY()] == 0) {
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 0);
                setPosX(getPosX()-1);
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 2);
                mapa = mapaObj.obtenerMapa();
            }
        }
        if (evento.getKeyCode() == 68) {
            if (mapa[(getPosX())+1][getPosY()] == 0) {
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 0);
                setPosX(getPosX()+1);
                mapaObj.setPosicionEnMatriz(getPosX(), getPosY(), 2);
                mapa = mapaObj.obtenerMapa();
            }
        }
    }

    public void picar() {

    }

    @Override
    public void moverse() {
        
        
    }

    @Override
    public void morir() {
        
        
    }

    @Override
    public void atacar() {
        
        
    }
}
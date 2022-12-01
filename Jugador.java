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
        this.cantPiedras = 0;
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

    public void movimiento(KeyEvent evento) { 
        int[][] mapa = mapaObj.obtenerMapa();

        if (evento.getKeyCode() == 87) {
            if (mapa[getPosX()][(getPosY())-1] == 0) {
                setPosY(getPosY()-1);
            }
        }
        if (evento.getKeyCode() == 83) {
            if(mapa[getPosX()][(getPosY())+1] == 0){
                setPosY(getPosY()+1);
            }
        }
        if (evento.getKeyCode() == 65) {
            if (mapa[(getPosX()-1)][getPosY()] == 0) {
                setPosX(getPosX()-1);
            }
        }
        if (evento.getKeyCode() == 68) {
            if (mapa[(getPosX())+1][getPosY()] == 0) {
                setPosX(getPosX()+1);
            }
        }
    }

    public void picar(KeyEvent evento) {
        int[][] mapa = mapaObj.obtenerMapa();
        if(evento.getKeyCode() == 32){
            if (mapa[(getPosX()-1)][getPosY()] == 4 || mapa[(getPosX()+1)][getPosY()] == 4 || mapa[(getPosX())][getPosY()+1] == 4 || mapa[(getPosX())][getPosY()-1] == 4) {
                cantPiedras +=1;
            }else if (mapa[(getPosX()-1)][getPosY()] == 5 || mapa[(getPosX()+1)][getPosY()] == 5 || mapa[(getPosX())][getPosY()+1] == 5 || mapa[(getPosX())][getPosY()-1] == 5) {
                setVida(getVida()-1);
            }
        }
    }

    public void bajarVida(){
        int[][] mapa = mapaObj.obtenerMapa();
        if(mapa[(getPosX()-1)][getPosY()] == 3 || mapa[(getPosX()+1)][getPosY()] == 3 || mapa[(getPosX())][getPosY()+1] == 3 || mapa[(getPosX())][getPosY()-1] == 3){
            setVida(getVida()-2);
        }
    }
   
    @Override
    public boolean morir() {
        if(getVida() == 0){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public void atacar() {
        
        
    }


    public void actualizarEntornoJugador(Mapa mapa){ //recibe el mapa principal y actualiza el local con las posiciones de los objetos.
       mapaObj = mapa; 
    }



}
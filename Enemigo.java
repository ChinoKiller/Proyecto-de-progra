import java.awt.Graphics;

import Entidad.Personaje;

import java.awt.Color;

public class Enemigo extends Personaje {

    Mapa mapaObj = new Mapa();
    
    private boolean puedeColocarSeñuelo;
    private int ancho;
    private int alto;
    private int contadorDeVueltasMovimiento;
    private int contadorDeVueltasSeñuelo;

    public Enemigo(int posicionEnX, int posicionEnY){
        super(2,posicionEnX,posicionEnY);
        this.ancho = 20;
        this.alto = 20;
        this.puedeColocarSeñuelo = true;
        this.contadorDeVueltasSeñuelo = 0;
        this.contadorDeVueltasMovimiento = 0;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.red);
        grafico.fillOval(getPosX() * 18, getPosY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);

    }

    public void movimiento(Personaje personaje) {
        int[][] mapa = mapaObj.obtenerMapa();
        contadorDeVueltasMovimiento +=1;
        if(contadorDeVueltasMovimiento == 50){
            if((getPosX() < personaje.getPosX())){
                if(mapa[getPosX()+1][getPosY()] == 0){
                    setPosX(getPosX()+1);   
                } else if(mapa[getPosX()+1][getPosY()] != 0 && getPosY() > personaje.getPosY()){
                    setPosY(getPosY()-1);
                } else if(mapa[getPosX()+1][getPosY()] != 0 && getPosY() < personaje.getPosY()){
                    setPosY(getPosY()+1);
                }
            }
            if(getPosX() > personaje.getPosX()){
                if(mapa[getPosX()-1][getPosY()] == 0){
                    setPosX(getPosX()-1);
                } else if(mapa[getPosX()-1][getPosY()] != 0 && getPosY() > personaje.getPosY()){
                    setPosY(getPosY()-1);
                } else if(mapa[getPosX()-1][getPosY()] != 0 && getPosY() < personaje.getPosY()){
                    setPosY(getPosY()+1);
                }
            }
            if(getPosY() < personaje.getPosY()){
                if(mapa[getPosX()][getPosY()+1] == 0){
                    setPosY(getPosY()+1);
                } else if(mapa[getPosX()][getPosY()+1] != 0 && getPosX() > personaje.getPosX()){
                    setPosX(getPosX()-1);
                } else if(mapa[getPosX()][getPosY()+1] != 0 && getPosX() < personaje.getPosX()){
                    setPosX(getPosX()+1);
                }
            }
            if(getPosY() > personaje.getPosY()){
                if(mapa[getPosX()][getPosY()-1] == 0){
                    setPosY(getPosY()-1);
                } else if(mapa[getPosX()][getPosY()-1] != 0 && getPosX() > personaje.getPosX()){
                    setPosX(getPosX()-1);
                } else if(mapa[getPosX()][getPosY()-1] != 0 && getPosX() < personaje.getPosX()){
                    setPosX(getPosX()+1);
                }
            }
            contadorDeVueltasMovimiento = 0;
            atacar();
        }
    }
   

    @Override
    public boolean morir() {
        if(getVida() == 0){
            setPosX(0);
            setPosY(0);
        }
        return true;
    }

    @Override
    public void atacar() {
        int[][] mapa = mapaObj.obtenerMapa();
        if(mapa[(getPosX()-1)][getPosY()] == 2 || mapa[(getPosX()+1)][getPosY()] == 2 || mapa[(getPosX())][getPosY()+1] == 2 || mapa[(getPosX())][getPosY()-1] == 2){
            setVida(0);
        } 
    }
    
    public boolean colocarSeñuelo(){
        if(puedeColocarSeñuelo){
            contadorDeVueltasSeñuelo +=1;
            if(contadorDeVueltasSeñuelo == 150){
                int desicion = numeroAleatorio1o2();
                if(desicion == 2){
                    puedeColocarSeñuelo = false;
                    return true;
                }
                contadorDeVueltasSeñuelo = 0;
            }
        }
        return false;
    }
    
    public void actualizarEntornoJugador(Mapa mapa){ //recibe el mapa principal y actualiza el local con las posiciones de los objetos. 
        mapaObj = mapa;
    }

    private int numeroAleatorio1o2(){ //sirve para generar un numero entero aletorio entre 1 y 2.
        double auxiliar = Math.random()*2 + 1;
        int numero  = (int) auxiliar;
        return numero;
    }



}
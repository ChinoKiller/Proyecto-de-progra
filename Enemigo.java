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
        this.puedeColocarSeñuelo = true;
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.red);
        grafico.fillOval(getPosX() * 18, getPosY() * 17, ancho, alto);
        grafico.setColor(Color.black);
        //grafico.drawRect(getPosX() * 18, getPosY() * 17, ancho, alto);

    }

    public void movimiento(Personaje personaje) {
        int[][] mapa = mapaObj.obtenerMapa();

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
    }
   

    @Override
    public void morir() {
        
    }

    @Override
    public void atacar() {
        
    }
    
    public void colocarSeñuelo(){
        if(puedeColocarSeñuelo){ //primera condición: que no lo haya colocado antes
            int[][] mapa = mapaObj.obtenerMapa();
            if(numeroAleatorio1o2() == 2){ //segunda condición: de manera aleatoria se determina si se colocará el señuelo
                if (mapa[(getPosX()-1)][getPosY()] == 0){
                    //colocar señuelo a la izquierda del enemigo
                }else if(mapa[(getPosX()+1)][getPosY()] == 0){
                    //colocar señuelo a la derecha del enemigo
                }else if(mapa[(getPosX())][getPosY()-1] == 0){
                    //colocar señuelo a la y-1 del enemigo
                }else if(mapa[(getPosX())][getPosY()+1] == 0){
                    //colocar señuelo a la y+1 del enemigo
                }
                puedeColocarSeñuelo = false;
            }
        }
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
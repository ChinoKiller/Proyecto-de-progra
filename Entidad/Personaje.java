package Entidad;

//import javafx.scene.image.Image;

public abstract class Personaje {
    //atrubutos
    private int vida;
    private int posX;
    private int posY;
    //private Image skin;

    //metodos
    
    
    


    public Personaje(int vida, int posX, int posY) {
        this.vida = vida;
        this.posX = posX;
        this.posY = posY;
    }

    public abstract boolean morir();

    public abstract void atacar();

   




    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    /*public Image getSkin() {
        return skin;
    }

    public void setSkin(Image skin) {
        this.skin = skin;
    }*/
}

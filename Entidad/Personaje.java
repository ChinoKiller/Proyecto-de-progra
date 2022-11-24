package Entidad;

import javafx.scene.image.Image;

public abstract class Personaje {
    //atrubutos
    private int vida;
    private int posX;
    private int posY;
    private Image skin;

    //metodos
    public abstract void moverse();

    public abstract void morir();

    public abstract void atacar();


}

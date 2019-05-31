/**
 * Humanoide
 */
public class Humanoide extends CriaturaAbstracta{
    public Humanoide(String nombre, int ataque,int defensa,int vida, int id){
        super(nombre, ataque, defensa, vida, id);
    }

    //metodos abstractos heredados
    public void entrenar(){
        this.ataque += 3;
        this.vida += 1;
    }
    
    //el humanoido no tiene posee este metodo por lo que
    //queda vacio.
    public void defensaHostil(){}
}
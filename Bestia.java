/**
 * Bestia
 */
public class Bestia extends CriaturaAbstracta{

    public Bestia(String nombre, int ataque,int defensa,int vida, int id){
        super(nombre, ataque, defensa, vida, id);
    }

    //metodos abstractos heredados
    //la Bestia no tiene posee este metodo por lo que
    //queda vacio.
    public void entrenar(){}
    
    //el como implementar cada caso dependera de la forma de pelea.
    public void defensaHostil(){
        int azar = (int)(Math.random()*2);
        switch (azar) {
            case 0: /* recive el daño */break;
            case 1: /* devuelve el 50% del daño */break;
            case 2: /* bloquea el daño */break;
        }
    }
    
}
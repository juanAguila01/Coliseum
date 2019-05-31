/**
 * Bestia
 */
public class Bestia extends CriaturaAbstracta{
    private String nombre;
    private int ataque,defensa,vida,idParticipante;
    private boolean atacando,defendiendo;

    public Bestia(String nombre, int ataque,int defensa,int vida, int id){
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.idParticipante = id;
        //podria dejar defendiendo = true; y permitir que la defensa
        //deje pasar 1 de daño;
        this.atacando = false;
        this.defendiendo = false;
    }

    //cambia de estado atacando a true y defendiendo a false.
    //esto planeo utilizarlo con alguna clase que intermedie entre los dos participantes.
    public boolean atacar(){
        this.atacando = true;
        this.defendiendo= false;
        return this.atacando;
    }
    //cambia de estado atacando a false y defendiendo a true.
    //esto planeo utilizarlo con alguna clase que intermedie entre los dos participantes.
    public boolean defender(){
        this.defendiendo = true;
        this.atacando = false;
        return this.defendiendo;
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

    //metodo para imprimir criatura
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
        "Ataque: " + this.ataque + "\n" +
        "Defensa: " + this.defensa + "\n" + 
        "Vida: " + this.vida + "\n" +
        "Id Participante: " + this.idParticipante + "\n" +
        "Esta atacando?: " + ((this.atacando)? "si":"no") + "\n" +
        "Esta defendiendo?: " +((this.defendiendo)? "si":"no") + "\n" +
        "===================================================";
    }
    
}
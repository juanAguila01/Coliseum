public abstract class CriaturaAbstracta {
    protected String nombre;
    protected int ataque,defensa,vida,idParticipante;
    protected boolean atacando,defendiendo;

    public CriaturaAbstracta(String nombre, int ataque,int defensa,int vida, int id){
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
    
    //metodos abastractos.
    public abstract void entrenar();
    public abstract void defensaHostil();
    
}
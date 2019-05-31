/**
 * CrearCriaturas
 */
public class CrearCriaturas {

    public CriaturaAbstracta criaturasFactory(String tipoCriatura,String nombre,int ataque,int defensa,int vida,int id){

        if(tipoCriatura.equalsIgnoreCase("HUMANOIDE")){
            return new Humanoide(nombre,ataque,defensa,vida,id);
        }else if(tipoCriatura.equalsIgnoreCase("BESTIA")){
            return new Bestia(nombre,ataque,defensa,vida,id);
        }else{
            System.out.println("no ingresaste un nombre permitido.");
            return null;
        }
    }
}
/** esta clase cumple el papel de mediator un patron de diseño que ayuda a interactuar mas facilmente diferentes objetos. */
public class App {

    public static void main(String[] args) {
        CrearCriaturas fabricaCriaturas = new CrearCriaturas();
        CriaturaAbstracta minotauro = fabricaCriaturas.criaturasFactory(
            "humanoide","Minotauro",3,2,7,18
        );
        CriaturaAbstracta centauro = fabricaCriaturas.criaturasFactory(
            "bestia","Centauro",2,4,10,2
        );

        System.out.println(minotauro.toString());
        System.out.println(centauro.toString());
    }
}
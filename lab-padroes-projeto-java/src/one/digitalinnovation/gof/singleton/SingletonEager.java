package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author Bianca Medina
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

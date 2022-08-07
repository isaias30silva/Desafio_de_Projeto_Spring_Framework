package one.digitalInnovation.gof.singleton;

/**
 * Singleton
 * @author isaias30silva
 *
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}

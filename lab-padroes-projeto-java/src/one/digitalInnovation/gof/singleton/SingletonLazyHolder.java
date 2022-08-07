package one.digitalInnovation.gof.singleton;

/**
 * Singleton
 * @author isaias30silva
 *
 */

public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
		
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}

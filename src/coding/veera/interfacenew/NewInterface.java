package coding.veera.interfacenew;

public interface NewInterface {
	
	default void print()
	{
		System.out.println("printing - default method");
	}
	
	static void eat()
	{
		System.out.println("eating - static method");
	}
	
	public void write();
	
	public void read();

}

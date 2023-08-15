package coding.veera.interfacenew;

public class Main implements NewInterface{

	@Override
	public void write() {
		System.out.println("writing - abstract method implementation");	
	}

	@Override
	public void read() {
		System.out.println("reading - abstract method implementation");	
	}
	
//	public void print() {
//		System.out.println("printing - default overridden method");	
//	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.write();
		m.read();
		m.print();
		NewInterface.eat();
	}

}

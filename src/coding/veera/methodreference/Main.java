package coding.veera.methodreference;

public class Main {
	
	public static void main(String[] args) {
		
		//static method reference
		SampleInterface3 interface3 = SampleClass::staticPrint;
		
		System.out.println(interface3.print("arun","12","male"));
		
		//instance method reference
		SampleInterface3 interface3_1 = new SampleClass()::printMethod;
		
		System.out.println(interface3_1.print("john","14","male"));
		
		//constructor reference using new keyword
		SampleInterface4 interface3_2 = SampleClass::new;
		
		interface3_2.print("john","14","male");

		
		
	}

}

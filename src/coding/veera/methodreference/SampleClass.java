package coding.veera.methodreference;

public class SampleClass {
	
	public String printMethod(String name, String age, String gender)
	{
		return name+" "+age+" "+gender;
	}
	
	public String printMethod(String name)
	{
		return name;
	}
	
	public static String staticPrint(String name, String age, String gender)
	{
		return name+" "+age+" "+gender;
	}

	SampleClass(String name, String age, String gender)
	{
		System.out.println(name+" "+age+" "+gender);
	}
	
	SampleClass()
	{
		
	}
}

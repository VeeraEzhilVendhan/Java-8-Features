package coding.veera.lambdaexpression;

public class LambdaExpression 
{
	
	public static void main(String[] args) 
	{
		//lambda expression for functional interface - zero arg
		SampleInterface sampleInterface = () -> { System.out.println("hi"); };

		//lambda expression for functional interface - one arg
		SampleInterface2 sampleInterface2 = name -> "Hi "+name;
		
		//lambda expression for functional interface - multiple args, multiple statements
		SampleInterface3 sampleInterface3 = (name,age,gender) -> { 
														String nameAge = name+" "+age; 
														String nameAgeGender = nameAge+" "+gender;
														return nameAgeGender;
														};

		sampleInterface.print();
		System.out.println(sampleInterface2.print("Arun"));
		System.out.println(sampleInterface3.print("Arun","22","Male"));
	}

}

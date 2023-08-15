package coding.veera.lambdaexpression;

public class WithoutLambdaExpression 
{
	
	public static void main(String[] args) 
	{
		//using anonymous class - extending super class
		SampleSuperClass superClass = new SampleSuperClass()
												{
													public void print()
													{
														System.out.println("anonymous class - super class implementing");
													}
												};
		
		//using anonymous class - implementing interface
		SampleInterface sampleInterface = new SampleInterface()
													{
														public void print()
														{
															System.out.println("anonymous class - interface implementing");
														}
													};
													
		superClass.print();
		
		sampleInterface.print();

	}

}

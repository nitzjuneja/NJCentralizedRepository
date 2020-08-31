package pkj1;

public class constructor
{
	public constructor()
	{
		System.out.println("Default Parametrized");
	}
	public constructor(int a)
	{
		System.out.println("One Parametrized");
	}
	public constructor(int a, int b)
	{
		System.out.println("Two parametrized");
	}
	public static void main(String[] args)
	{
		constructor c1=new constructor();
		constructor c2=new constructor(45);
		constructor c3=new constructor(45,12);
		
	}
	
	
	
	
	
	

}

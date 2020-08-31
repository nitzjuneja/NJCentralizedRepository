package pkj1;

public class Assignment2
{
	public int sub(int a, int b)
	{
	int c;
	c=a-b;
	System.out.println("sub is" +c);
	return c;
	}

	public int sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("sum is" +c);
	return c;
}

	public int sub1(int a, int b) {
	int c;
	c=a-b;
	System.out.println("sub is" +c);
	return c;
	}

	public int mul(int a, int b) {
	int c;
	c=a*b;
	System.out.println("mul is" +c);
	return c;
	}

	public void div(int a, int b)
	{
	int c;
	c=a/b;
	System.out.println("Final Result" +c);
	}
	public static void main(String[] args)
	{
	Assignment2 obj =new Assignment2();
	int subresult=obj.sub(10,2);
	int add=obj.sum(subresult,2);
	int subresult1=obj.sub1(add,2);
	int mulresult=obj.mul(subresult, 2);
	obj.div(mulresult,2);	
	}
	}



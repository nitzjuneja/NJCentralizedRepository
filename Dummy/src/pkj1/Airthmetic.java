package pkj1;

public class Airthmetic
{
	public int sum(int a, int b) {
	int c;
	c=a+b;
	System.out.println("sum is" +c);
	return c;
	}

	public int sum1(int a, int b) {
	int c;
	c=a+b;
	System.out.println("sum1 is" +c);
	return c;
}

	public int sub(int a, int b) {
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
	Airthmetic a=new Airthmetic();
	int sumresult=a.sum(12,2);
	int sumnew=a.sum1(sumresult,2);
	int subresult=a.sub(sumnew,2);
	int mulresult=a.mul(subresult, 2);
	a.div(mulresult,2);	
	}
	}



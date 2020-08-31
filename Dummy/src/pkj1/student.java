package pkj1;

public class student {
	int rollno; int age;
	public void method1()
	{
		System.out.println("Welcome all");
	}
	public void method2()
	{
		System.out.println("Automation is easy");
	}
	public static void main(String[] args)
	{
	student s=new student();
	s.method1();
	s.method2();
	s.rollno=20;
	System.out.println(s.rollno);
	s.age=22;
	System.out.println(s.age);
	
}
}


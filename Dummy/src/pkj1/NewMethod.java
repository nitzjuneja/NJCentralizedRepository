package pkj1;

public class NewMethod
{
 public void m1()
 {
	 this.m4();
	 System.out.println("Default Method");
	 this.m2();
	 this.m3();
	 this.m5();
 }
 public void m2()
 {
	 System.out.println("One parametrized Method");
 }
 public void m3()
 {
	 
	 System.out.println("Two parametrized Method");
 }
 public void m4()
 {
	 
	 System.out.println("Three parametrized Method");
 }
 public void m5()
 {
	 
	 System.out.println("Four parametrized Method");
 }
 public static void main(String[] args) {
	NewMethod NM=new NewMethod();
	NM.m1();
	
}
 
}

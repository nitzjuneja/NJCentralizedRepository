package pkj1;

public class NewConstructor
{
 public NewConstructor()
 {
	 System.out.println("Default Constructor");
 }
 public NewConstructor(int a)
 {
	 this();
	 System.out.println("One Constructor");
 }
 public NewConstructor(int a, int b)
 {
	 this(45);
	 System.out.println("Two Constructor");
 }
 public NewConstructor(int a,int b, int c)
 {
	 this(45,22);
	 System.out.println("Three Constructor");
 }
 public static void main(String[] args) {
NewConstructor NC=new NewConstructor(45,12,13);
}
}

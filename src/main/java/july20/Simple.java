package july20;

public class Simple {


	public void printStmt() {
		System.out.println("Hi");
	}

	public int add(int a,int b) {

		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		Simple s=new Simple();
		s.printStmt();
		System.out.println(s.add(5,10));
	}

}

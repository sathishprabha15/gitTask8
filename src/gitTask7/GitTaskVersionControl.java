package gitTask7;

public class GitTaskVersionControl {
	int x=100;

	public static void main(String[] args) {
		System.out.println("Hello World. This is Git Task Version Control");
		String name= "my world";
		System.out.println(name.length());
		System.out.println(name.indexOf("world"));
		String s="sathish";
		System.out.println(s.length());
		String mat= "Maths";
				String sci="Science";
				System.out.println(mat+sci);
				
				String[] fruit = {"mango", "banana", "guava"};
				for(int i=0;i<fruit.length;i++) {
					System.out.println(fruit[i]);
				}
				
				GitTaskVersionControl goops=new GitTaskVersionControl();
				int c = goops.x;
				System.out.println(c);
	}
	

}

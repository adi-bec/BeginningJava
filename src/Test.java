
class Test {
	String a = "a";
	static void changeString(String s)
	{
		s="b";
	}
	
	
	
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println("a is: " + t.a);
		Test.changeString(t.a);
		System.out.println("a is now: " + t.a);		
	}
	

}

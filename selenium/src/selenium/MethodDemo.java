package selenium;

public class MethodDemo {
	public static void main(String[] args) {
		
		MethodDemo d =new MethodDemo();
		String name = d.getData();
		System.out.println(name);
		MethodDemo2 r = new MethodDemo2();
		r.getData();
		
	}
	
	public String getData()
	{
		System.out.println("leraning");
		return "jdejhd";
	}

}

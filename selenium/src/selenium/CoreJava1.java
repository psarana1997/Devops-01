package selenium;

public class CoreJava1 {
	public static void main(String[] args) {
		
		int x = 5;
		String web = "selenium";
		char let = 's';
		double dec = 5.99;
		boolean v = true;
		
		System.out.println(x);
		//Arrays
		int[]  arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println(arr2[4]);
		
		//Forloop
		for(int i1 =0; i1<arr2.length; i1++);
		{
//			System.out.println(arr2(i1));
		}
		String[] name = {"praveen", "anudeep",};
		for(int i =0; i<name.length; i++) {
			System.out.println( name[i]);
		}
		for(String s: name)
		{
			
			System.out.println(s);
		}
	}

}

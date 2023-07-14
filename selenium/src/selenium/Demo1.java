package selenium;
import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,8,9,10};
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] % 2 == 0 )
			{
				System.out.println(arr1[i]);
			}
			else
			{
				System.out.println(arr1[i]+"is ");
			}
			ArrayList<String> a = new ArrayList<String>();
			a.add("praveen");
			a.add("mummy");
			a.add("father");
			System.out.println(a.get(2));
			
			//item is present in ArrarList
			
			String[] name = {"parveen" ,"mummy", "thamudu"};
			
			
			
			
		}
		
	}

}

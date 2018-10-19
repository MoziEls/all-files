import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		
			doMaths();
	}
	
	public static void doMaths() {
			List<Integer> numbers = Arrays.asList(3, 2, 2, 7, 5, 9, 8, 12);
			List<Integer> numbers2 = Arrays.asList(3^2, 2^2, 2^2, 3^2, 7^2, 3^2, 5^2, 9^2, 8^2, 12^2);
			for (int i=0;i<numbers.size();i++) {
				 if(numbers.get(i)%2==0) {
					 System.out.println(numbers.get(i));
					 
					 
				 }
				 
				 System.out.println(numbers.get(i)*10);
				
				 
				 System.out.println(Collections.max(numbers));
				 System.out.println(Collections.min(numbers));
				 
				 
				
				if (numbers.get(0) == numbers.get(i) ) {
					 System.out.println("unique number");
					
				}
				
	}
			
}}
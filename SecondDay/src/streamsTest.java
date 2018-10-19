import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doMaths();
	}
	
	public static void doMaths() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 7, 5, 9, 8, 12);
		List<Integer> squareNumbers= numbers.stream().map(i -> i*i).collect(Collectors.toList());
		List<Integer> multiplyTen=numbers.stream().map(i -> i*10).collect(Collectors.toList());
		List<Integer> uniqeNumbers=numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("new stuff");
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println("new stuff");
		System.out.println(numbers.stream().min(Integer:: compare).get());
		System.out.println("new stuff");
		System.out.println(numbers.stream().max(Integer::compare).get());
		System.out.println("new stuff");
		System.out.println(squareNumbers);
		System.out.println("new stuff");
		System.out.println(multiplyTen);
		System.out.println(uniqeNumbers);
		
		
		
	
		

	
	}

}

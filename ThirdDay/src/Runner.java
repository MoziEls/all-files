import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		Person p1= new Person(8, 8, "Mozi");
		Person p2=new Person(20, 7, "Mozi");
		
		p1.changeSDtream();
		System.out.println(p1.softSkills);
		System.out.println(p2.softSkills);
		
		List<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		System.out.println(people);
		
		for (Person p3 : people) {
			System.out.println(p3.name);
			System.out.println(p3.softSkills);
			System.out.println(p3.techSkills);
		}
		
	}
	

}

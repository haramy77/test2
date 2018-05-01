package test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;



public class test_stream {

	public static void main(String[] args) {
		List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );
		
		List<String> collectList = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collectList);
		List collectArray = staff.stream().collect(Collectors.toList());
		System.out.println(collectArray);
		collectArray.forEach(p -> System.out.format("%s",p));
		
		Staff collectListA = staff.stream().max((x1,x2) -> (int) ( x1.getAge() - x2.getAge())).get();
		System.out.println(collectListA);
		
		List<Person> persons= Arrays.asList(new Person ("Max",18,"Rue de Londres"),
				new Person ("Peter",23,"Rue de Bruxelles"),
				new Person ("Pamela",23,"Rue de Paris"),
				new Person ("David",12,"Rue de Pompei")
				);
		
		List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());
		System.out.println(filtered);
		
		Map<Integer,List<Person>> personByAge =  persons.stream().collect(Collectors.groupingBy(p -> p.age));
		personByAge.forEach((age,p) -> System.out.format("age %s: %s\n", age, p));
		
		//Map<String,String> personAdress = persons.stream().collect(Collectors.toMap(p -> p.name, p->adresse));
		
		Map<Integer,String> personAdress = persons.
							stream().
							collect(Collectors.toMap(p -> p.age, 
													 p -> p.name,
													 (name1,name2) -> name1 + ";" + name2 ));
		
		System.out.println(personAdress);
		
		
		Map<Integer,String> personAdress1 = persons.
				stream().
				collect(Collectors.toMap(p -> p.age, 
										 p -> p.name,
										 (name1,name2) -> name1  ));

	}	
}

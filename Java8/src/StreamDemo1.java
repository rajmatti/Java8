import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		
		// Core Intermediate Stream operations
	// filter
 names.stream().filter((s)-> s.startsWith("A")).
 forEach(System.out::println);
 //map
  names.stream().filter((s)-> s.startsWith("A")).map(String::toUpperCase)
 .forEach(System.out::println);	
  System.out.println();
  //sorted
  names.stream().sorted().map(String::toUpperCase)
  .forEach(System.out::println);	
  System.out.println();
  // Terminal operations
  // foreach
  names.forEach(System.out::println);
  //collect
  List<String> namesUpperCase=names.stream().sorted().
		  map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(namesUpperCase);	 
 //count
long tm=names.stream().filter((s) -> s.startsWith("A")).count();
System.out.println("Total names starts with A:"+tm);
// reduce
Optional<String> r=names.stream().reduce((s1,s2) -> s1 + "#"+s2);
r.ifPresent(System.out::println);

  
  
	}

}

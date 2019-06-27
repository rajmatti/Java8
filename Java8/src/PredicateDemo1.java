import java.util.function.Predicate;

public class PredicateDemo1 {

	 static Boolean checkAge(int age)
	 {
		 if(age>17) return true;
		 else return false;
	 }
	public static void main(String[] args) {
		  // Creating predicate 
        Predicate<Integer> lesserthan = i -> (i < 18);  
          // Calling Predicate method 
        System.out.println(lesserthan.test(10));  
        
        Predicate<Integer> p=PredicateDemo1::checkAge;
        boolean r=p.test(25);
        System.out.println(r);
	}

}

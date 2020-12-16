import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperator {
	public static void main(String[] args) {
		BiFunction<Integer,Float,Float> func = (x,y)->(float)(x+y);
		
		Float result = func.apply(10, 20.00f);
		System.out.println(result);
		
		List<Float> floats = Arrays.asList(10.10f,20.33f,34.55f,42.5f,53.05f,60.50f,70.08f,80.6f,96.77f);
		
		List<Float> floats2 = math(floats,(x,y)->(float)(x+y));
		floats2.forEach(System.out::println);
	
	}
	

	
	public static <T> List<T> math(List<T> list, BinaryOperator<T> BinaryOperator) {
		List<T> result = new ArrayList<T>();
		
		for (T t : list) {
			result.add(BinaryOperator.apply(t,t));
		}
		return result;
	}
	
}

	
	
	


	

}

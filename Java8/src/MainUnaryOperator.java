import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainUnaryOperator {
	public static void main(String[] args) {
		//Function<T , R>
		Function<Integer , Integer> func = x->x*2;
		Integer result=func.apply(2);
		System.out.println(result);
		
		UnaryOperator<Integer> operator = x->x*2;
		result = operator.apply(4);
		System.out.println(result);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,90);
		List<Integer> integers2 = math(integers,x->x*2);
		
		integers2.forEach(System.out::println);
		
	}

	private static <T>List<T> math(List<T> list , UnaryOperator<T> unaryOperator) {
		// TODO Auto-generated method stub
		List<T> results = new ArrayList<T>();
		for(T t:list) {
			results.add(unaryOperator.apply(t));
		}
		return results;
		
	}

}

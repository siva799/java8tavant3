import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.List;
import java.util.function.BiFunction;

public class MainBinaryOperator {
	public static void main(String[] args) {
		BiFunction<Integer ,Float ,Float> func = (x,y)->x+y.floatValue();
		Float result = func.apply(10, 20.09f);
		System.out.println(result);
		List<Integer> integers = Arrays.asList(1,2,3,45,67,8,8,9);	
		List<Float> floats = Arrays.asList(1.2f,3.0f,4.0f,6.0f,7.8f,9.9f,0.5f,87f);
		
		List<Float> floats2 =  math(integers,floats,(x,y)->x+y);
		
	}

	private static <T>List<T> math(List<T> integers, List<T> floats, BiFunction<T> biFunction ) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	


	

}

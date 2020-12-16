//create a list with null values and remove null values using stream and display


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment4 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,23,0,null,4,null,6,7,8,null,9);
		List<Integer> s = integers.stream().filter(e->(e!=null))
				.collect(Collectors.toList());
		System.out.println(s);
	}

}

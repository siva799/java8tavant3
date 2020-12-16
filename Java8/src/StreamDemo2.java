import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,23,4,6,7,8,9);
		Stream<Integer> s = integers.stream();
		s.forEach(System.out::println);
	}

}

import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		Stream<Integer> integers = Stream.of(2,3,4,1,5,7,8,9);
		integers.forEach(System.out::println);
	}

}

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = "12345_abcdefgh678".chars();
		intStream.forEach(System.out::println);
		Stream<String> stream = Stream.of("192.68.11.22".split("\\."));
		stream.forEach(System.out::println);

	}

}

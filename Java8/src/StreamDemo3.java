import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo3 {
	public static void main(String[] args) {
		Supplier<Integer> s = ()->new Random().nextInt(100);
	//  Stream<Integer> stream = Stream.generate(s);
		Stream<Integer> stream = Stream.generate(s).parallel();
		//  Integer result=stream.limit(40).filter(v->v>40).map(v->v+100).reduce((v1,v2)->v1+v2).get();
		Optional<Integer> result = stream.limit(20).min((i,j)->i.compareTo(j));
		System.out.println(result.get());
	}

}

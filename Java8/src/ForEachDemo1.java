import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachDemo1 {
	public static void main2(String[] args) {
		List<String> names = Arrays.asList("siva","mohan","kumar","ksmk");
		names.forEach(e->System.out.println(e));
		names.forEach(System.out::println); //e->System.out.println(e)
		//reference to instance method from instance
		// Staticref :: method
		// :: ===> method references
		
	}
	/*
	public static void main1(String[] args) {
		List<String> names = Arrays.asList("siva","mohan","kumar","ksmk");
		Consumer<String> makeUpperCase = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(makeUpperCase);				
			}
			
			

			
			
		};
		names.forEach(makeUpperCase);
		
		
	}
	*/
	public static void main(String[] args) {
		Map<String ,Integer>map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		map.forEach((k,v)->{
			System.out.println(k +" " + v);
		});
		BiConsumer<String , Integer> action = new BiConsumer<String , Integer>(){

			@Override
			public void accept(String k, Integer v) {
				
				// TODO Auto-generated method stub
				System.out.println(k.toLowerCase());
				System.out.println(v*v);
				
			}
			
			
		};
		map.forEach(action);
	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert maps(keys) to list using Stream

public class Assignment5 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(100, "Siva");
        map.put(200, "mohan");
        map.put(300, "kumar");
        map.put(400, "smk");
        map.put(500, "ksmk");
        
        List<Integer> keys = new ArrayList(map.keySet());
        List<Integer> results=keys.stream().collect(Collectors.toList());
        System.out.println(results);
        
        
        List<Integer> values = new ArrayList(map.values());
        List<Integer> results2=values.stream().collect(Collectors.toList());
        System.out.println(results2);
	}

}

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashTableExample = new HashMap<>();
	hashTableExample.put("one", 1);
	hashTableExample.put("two", 2);
	hashTableExample.put("three", 3);
	for (Map.Entry<String, Integer> entry : hashTableExample.entrySet()) {
	    System.out.println("Key = " + entry.getKey() 
	        + ", Value = " + entry.getValue());
	}
    }

}

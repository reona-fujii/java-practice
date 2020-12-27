
import java.util.*;

public class RootOfCollection {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		List<String> arrayList = new ArrayList<String>();
		Queue<String> priorityQueue = new PriorityQueue<String>();
		Deque<String> arrayDeque = new ArrayDeque<String>();
		add(hashSet);
		add(arrayList);
		add(priorityQueue);
		add(arrayDeque);
		for (String string : hashSet) {
			System.out.println("[10]" + (String) string);
		}
		for (String string : arrayList) {
			System.out.println("[12]" + (String) string);
		}
		for (String string : priorityQueue) {
			System.out.println("[14]" + (String) string);
		}
		for (String string : arrayDeque) {
			System.out.println("[16]" + (String) string);
		}	
	}
	private static void add(Collection collection) {
		collection.add("ABC");
	}
}

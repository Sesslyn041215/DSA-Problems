import java.util.*;

public class PracticeMethods {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		List<String> list2 = new ArrayList<>();
		list2.add("c");
//		list.remove(2);
		list.removeAll(list2);
//		list.clear();
		System.out.println(list);
;	}

}

package preparationday7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleList {
	public static void main(String[] args) {

//		List<String> a = new ArrayList<>();
        
		//CopyOnWrite
		List<String> a = new CopyOnWriteArrayList<String>();

		a.add("IBU");
		a.add("SHA");
		a.add("IBUSHA");

		for (String b : a) {
			a.remove("SHA");
		}
		System.out.println(a);
	}
}

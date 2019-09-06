package done;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTestClassMyphasis {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("123");
		list.add("345");
		list.add("465");

		List<Integer> list1 = new ArrayList<Integer>(list.size());
		int sum = 0;

		for (String mylist : list) {
			list1.add(Integer.parseInt(mylist));
		}
		System.out.println(list1);

		for (int i = 0; i < list1.size(); i++) {
			sum = sum + list1.get(i);

		}
		System.out.println(sum);
	}
}

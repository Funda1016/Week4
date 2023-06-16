package Week4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLinkSecondExam {

	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.add(3);
		link.add(2);
		link.add(5);
		System.out.println(link);
		LinkedList link2=new LinkedList();
		link2.add("Monday");
		link2.add("Tuesday");
		link2.add("Wednesday");
		System.out.println(link2);
		Iterator iterator=link2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}

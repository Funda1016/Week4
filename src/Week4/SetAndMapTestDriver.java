package Week4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndMapTestDriver {

 public static void main(String[] args) {
	 
	 //Test HashSet
	//Set<String>aSet=new HashSet<>();
	Set<String>aSet=new TreeSet<>();//order yapiyor
	 aSet.add("Canada");
	 aSet.add("USA");
	 aSet.add("France");
	 aSet.add("Canada");
	 aSet.add("USA");
	 System.out.println(aSet);
	 Set<Integer>aSet2=new TreeSet<>();
	 aSet2.add(3);
	 aSet2.add(7);
	 aSet2.add(1);
	 aSet2.add(3);
	 aSet2.add(7);
	 System.out.println(aSet2);
	 for(int i:aSet2) {
		 System.out.println(i);
	 }
	 System.out.println(aSet.size());
	 System.out.println(aSet.contains("USA"));
	 for(String s:aSet) {
		 System.out.println(s.toUpperCase());
	 }
	 /*
	  * for(int i=0; i<aSet.size();i++){
	  * System.out.println(aSet.get(i));
	   get method olmadigi icin yukaridakini kullanman daha iyi*/
	  //forEach method
	 aSet.forEach(e->System.out.print(e));
	 aSet.forEach(e->System.out.println(e.toLowerCase()));
 }
}

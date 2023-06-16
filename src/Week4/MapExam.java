package Week4;

import java.util.HashMap;
import java.util.TreeMap;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>aMap=new HashMap<String, Integer>();
		//TreeMap<String, Integer>aMap=new TreeMap<String, Integer>();
		//TreeMap is gonna order for data
		aMap.put("Peter", 35);
		aMap.put("Jane", 25);
		aMap.put("Bob", 27);
		aMap.put("Tom", 41);
		System.out.println(aMap.get("Bob"));//result 27
		System.out.println(aMap.keySet());
		
		System.out.println(aMap.containsKey("Peter"));
		System.out.println(aMap.containsValue(35));
		aMap.forEach((name,age)->System.out.print(name+""+age+""));
		//ailemizin yas ortalamasinin hesaplanmasi
		HashMap<String, Integer>aMap2=new HashMap<String, Integer>();
		aMap2.put("ali", 6);
		aMap2.put("Hasan", 12);
		aMap2.put("Huseyin", 12);
		aMap2.put("Funda", 42);
		aMap2.put("Erdem", 43);
		System.out.println(aMap2);
		System.out.println(aMap2.keySet());
		System.out.println(aMap2.values());
		
		int toplam=0;
		for(int i:aMap2.values()) {
			toplam+=i;
			System.out.println(toplam);
		}
		System.out.println(toplam);
		int average=toplam/(aMap2.size());
		System.out.println(average);
	}

}

package TechmentTrainingDay8.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(1, "Junaid");
		hm.put(2, "Aashu");
		hm.put(3, "gcgh");
		hm.put(4, "Junaid");
		hm.put(5, "Junaid");
		hm.put(6, "Junaid");
		hm.put(7, "Junaid");
		
		System.out.println("hashmao :"+ hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "Junaid");
		lhm.put(2, "Aashu");
		lhm.put(3, "gcghgvmnvh");
		lhm.put(4, "Jujhknaid");
		lhm.put(5, "Junaihjgjhd");
		lhm.put(6, "Junhjaidkgk");
		lhm.put(7, "Junaidjg");
		
		System.out.println("linked hash map :"+ lhm);
		
		TreeMap tm = new TreeMap();
		tm.put(1, "Junaid");
		tm.put(2, "Aashu");
		tm.put(3, "gcghgvmnvh");
		tm.put(4, "Jujhknaid");
		tm.put(5, "Junaihjgjhd");
		tm.put(6, "Junhjaidkgk");
		tm.put(7, "Junaidjg");
		
		System.out.println("linked hash map :"+ tm);

	}

}

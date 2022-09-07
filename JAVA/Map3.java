package com.ust2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {
	public static void main(String args[]) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "abc");
		m.put(2, "aa");
		m.put(3, "bb");
		Set keys= m.keySet();
		System.out.println(keys);
		
	}

}

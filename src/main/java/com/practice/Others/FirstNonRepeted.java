package com.practice.Others;

import java.util.HashMap;

public class FirstNonRepeted {

	public static void main(String[] args) {
		String name = "loipop";
		Character c = findnonrepetrdt(name);
		System.out.println(c);
	}

	private static Character findnonrepetrdt(String name) {
		int  length;
		Character a;
		int flag=0;
		length = name.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < length; i++) {
			a = name.charAt(i);
			if (map.containsKey(a)) {
				//map.put(a, map.get(a) + 1);
			} else {
				//map.put(a, 1);
			}
			
		}
		for(int l=0;l<length;l++){
			a=name.charAt(l);
//			if(map.get(a)>1){
//				flag=1;
//				if(flag==1){
//					return a;
//				}
//			}
		}
		return null;
	}
}

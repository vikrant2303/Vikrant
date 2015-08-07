package com.practice.Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class VikrantComparator implements Comparator<ComparableTest>{
	public int compare(ComparableTest o1, ComparableTest o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}
}
public class ComparableTest   {
		private int size;
		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		private String brand;
	 
		public ComparableTest(int size, String brand) {
			this.size = size;
			this.brand = brand;
		}

		public String toString() {
			return brand;
		}
//		public int compareTo(ComparableTest tv) {
//			return brand.co
//			//return 0;
//		}
		public static void main(String[] args) {
			ComparableTest tv1 = new ComparableTest(55, "Samsung");
			ComparableTest tv2 = new ComparableTest(60, "Sony");
			ComparableTest tv3 = new ComparableTest(70, "SonyGrand");
			ComparableTest tv4 = new ComparableTest(70, "Grand");
			List<ComparableTest> list=new ArrayList<ComparableTest>();
			list.add(tv1);
			list.add(tv3);
			list.add(tv2);
			list.add(tv4);
			Collections.sort(list,new VikrantComparator());
			System.out.println(list);
			
//			if (tv1.compareTo(tv2) > 0) {
//				System.out.println(tv1.brand + " is better.");
//			} else {
//				System.out.println(tv2.brand + " is better.");
//			}
		}

		
	}
	 

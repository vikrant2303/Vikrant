package com.practice.Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



	class HDTV {
		private int size;
		private String brand;
	 
		public HDTV(int size, String brand) {
			this.size = size;
			this.brand = brand;
		}
	 
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
	}
	 
	
	 
	public class ComparatorTest {
		public static void main(String[] args) {
			HDTV tv1 = new HDTV(55, "Samsung");
			HDTV tv2 = new HDTV(60, "Sony");
			HDTV tv3 = new HDTV(42, "Samsung");
			HDTV tv4 = new HDTV(47, "anasonic");
			HDTV tv5 = new HDTV(75, "dnasonic");
	 
			ArrayList<HDTV> al = new ArrayList<HDTV>();
			al.add(tv1);
			al.add(tv2);
			al.add(tv3);
			al.add(tv4);
			al.add(tv5);
			Collections.sort(al,new Comparator<HDTV>() {

				public int compare(HDTV o1, HDTV o2) {
					int c=0;
					c= o1.getBrand().compareTo(o2.getBrand());
					if(c==0)
						return (o1.getSize()>o2.getSize())?1:(o1.getSize()<o2.getSize())?-1:0;
			
					return c;
				}
			
				
			});
			for (HDTV a : al) {
				System.out.println(a.getSize());
			}
		}
	}



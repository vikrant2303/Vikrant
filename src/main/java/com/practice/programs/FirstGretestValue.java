package com.practice.programs;


public class FirstGretestValue {

	public static void main(String[] args) {
		int[] array = { 10, 20, 15, 7, 40, 27, 55, 1, 34, 29, 60, 22, 35 };
		new FirstGretestValue().findNo(array, 2);
	}

	private void findNo(int[] array, int i) {
		int[] arraynew = new int[array.length-1];
		int s=0;
		for (int a = 0; a < array.length; a++) {
			if (array[a] > i){
				arraynew[s] = array[a];
				s++;
			}
		}
		sort(arraynew);

	}

	private void sort(int[] listTosort) {

		
		int temp;
		for (int i = 0; i < listTosort.length; i++) {
			for (int j = 0; j < listTosort.length; j++) {
				if(listTosort[i]<listTosort[j]){
					temp=listTosort[j];
					listTosort[j]=listTosort[i];
					listTosort[i]=temp;
				}
			}
		}
		System.out.println("length="+listTosort.length);
		for (int i = 0; i < listTosort.length; i++)
		{
		         System.out.println(listTosort[i]);
		}
	}
}
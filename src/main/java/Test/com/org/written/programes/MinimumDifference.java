package Test.com.org.written.programes;

import java.util.ArrayList;

public class MinimumDifference {

	public static void main(String[] args) {
		MinimumDifference obj = new MinimumDifference();
		int array[] = { 2, 5, 10, 16, 34, 19, 55 };
		int sortedArray[] = obj.sortArray(array);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] > 0)
				list.add(sortedArray[i]);
		}
		int diff = list.get(list.size()-1) - list.get(0);
		int possition = 0;
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i + 1) - list.get(i)<diff){
				possition = i;
				diff = list.get(i + 1) - list.get(i);
			}
		}
		System.out.println("Elements are :"+list.get(possition)+" and "+list.get(possition+1));
	}

	private int[] sortArray(int[] array) {

		int max = 0;
		for (int i = 0; i < array.length - 1; i++) {
			max = array[i];
			if (max < array[i + 1]) {
				max = array[i + 1];
			}
		}
		int x[] = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			x[array[i]] = array[i];
		}
		return x;
	}

}

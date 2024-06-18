package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		int[] array2 = new int [] {1,3,5,7,9};
		int [] array3 = new int [5];

		
		array3[0] =0;
		array3[1] =2;
		array3[2] =4;
		array3[3] =6;
		array3[4] =8;
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));

}

}
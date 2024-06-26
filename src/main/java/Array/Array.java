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

		
		// 2차원 배열  생성 
		int [][] arr = {{1,2,3},{4,5,6}};
		//arr[1][2] 에 저장된 값을 출력 
		System.out.println(arr[1][2]); //6 
		//arr[1][2]에 저장된 값을 7로 변경 
		arr[1][2] =7;
		//변경된 값을 출력 
		System.out.println(arr[1][2]);
}

}
package Array;

import java.util.Arrays;

public class IndexOfArray {

	public static void main(String[] args) {
		//배열 생성
		int[] myArray = {1,4,2,5,3};
		//2번째 값을 7로 변경
		myArray[1]=7;
		System.out.println(Arrays.toString(myArray)); 
		//1번째 값에 접근 및 출력 
		System.out.println(myArray[2]);
		//5번째 값을 3번째 값으로 변경
		myArray[4] = myArray[2];       
		System.out.println(Arrays.toString(myArray));
		
		
	}
}

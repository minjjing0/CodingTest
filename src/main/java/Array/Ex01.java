package Array;

import java.util.Arrays;

// 배열 정리하기 
public class Ex01 {

	// 정수 배열을 정렬해서 반환하는 solution() 함수를 완성하세요 
	// 제약 조건 : 정수 배열의 길이는 2 이상 10의 5승 이하입니다. 
	// 정수 배열의 각 데이터 값은 -100,000이상 100,000이하입니다. 
	// 입출력의 예 ) 입력 -> [1,-5,2,4,3] , 출력 -> [-5,1,2,3,4] 
	
	
	private static int[] solution(int[] arr) {
		int[] clone = arr.clone();
		Arrays.sort(clone);
		return clone;
	}
	
	
	public static void main(String[] args) {
		int[] org = {4,2,3,1,5};
		int[] sorted = solution(org);
		
		System.out.println(Arrays.toString(org));
		System.out.println(Arrays.toString(sorted));
		
	}
}

package Array;

import java.util.HashSet;

public class Ex03 {

	
	//	정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 
	//만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환하는 solution () 함수를 완성하세요
	//제약 조건 
	// 1. numbers의 길이는 2 이상 100 이하입니다.
	// 2. numbers 의 모든 수는 0 이상 100 이ㅎ입니다.

	    public static int[] solution(int[] numbers) {
	        HashSet<Integer> set = new HashSet<>(); // ❶ 중복 값 제거를 위한 해쉬셋 생성
	        // ❷ 두 수를 선택하는 모든 경우의 수를 반복문으로 구함
	        for (int i = 0; i < numbers.length - 1; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	               
	            	
	            	// ❸ 두 수를 더한 결과를 새로운 배열에 추가
	            	
	                set.add(numbers[i] + numbers[j]);
	            }
	        }
	        // ❹ 해쉬셋의 값을 오름차순 정렬하고 int[] 형태의 배열로 변환하여 반환
	        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	    }

	   
	
	}
	


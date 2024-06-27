package HashMap;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> productPriceMap = new HashMap<>();
		
		//데이터 추가
		productPriceMap.put("p001", 19);
		productPriceMap.put("p002", 29);
		productPriceMap.put("p003", 39);
		
		
		//특정키 조회
		System.out.println("p002 조회"+productPriceMap.containsKey("p002"));
		
		
		//특정 키 - 값 쌍 제거
		Integer removedValue = productPriceMap.remove("p002");
		System.out.println("제거된 값"+removedValue);
		
		//제거 후 HashMap 출력
		System.out.println("제품 가격:" +productPriceMap);
		
	}
}

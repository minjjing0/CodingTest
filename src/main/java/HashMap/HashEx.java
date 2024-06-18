package HashMap;
//해시맵 : 키(key) 값(value)쌍을 저장하는 해시테이블 
// 키를 사용하여 값을 검색하는 자료구조 

import java.util.HashMap;

public class HashEx {
	

	
	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		
		//해시맵 값 삽입
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);
		//해시맵 값 출력 
		System.out.println(map); 
		
		//해시맵의 데이터 검색 
		
		String key = "apple";
		
		if(map.containsKey(key)) {
			int value = map.get(key);
			System.out.println(key+": "+value);  //apple :1 
		}
		else { 
			System.out.println(key + "는 해시맵에 없습니다.");
		}
		
		//해시맵 수정  
		map.put("banana", 4);   //키가 있따면 바나나 의 값 2를 4로 수정함 
		System.out.println(map);
		
		//해시맵 삭제 
		map.remove("orange");
		System.out.println(map);
	}// main

	
} //class

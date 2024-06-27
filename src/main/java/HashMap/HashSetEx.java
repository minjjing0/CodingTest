package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		//HashSet 선언 및 초기화
		HashSet<String> emailSet = new HashSet<>();
		
		//HashSet 선언 및 초기화시 <>에 타입 명시 x
		//		HashSet<> noType = new HashSet<>();    -- 에러 
		
		//데이터 추가
		emailSet.add("alice@example.com");
		emailSet.add("bob@example.com");
		emailSet.add("charlie@example.com");
		emailSet.add("alice@example.com"); //중복된 이메일, 추가되지 않음
		
		
		//데이터 출력
		System.out.println("이메일 주소:" + emailSet);
		
		//데이터 제거 
		emailSet.remove("charlie@example.com");
		
		// 제거된 데이터 출력 
				System.out.println("제거 후 이메일 주소:"+emailSet);
		
		//모든 요소 제거
		//		emailSet.clear();
		
		//조건에 맞는 요소 제거 (예: 이름에 'b'가 포함된 이메일 제거 
		emailSet.removeIf(email->email.contains("b"));
		System.out.println("조건에 맞는 요소 제거 후 이메일 주소:" + emailSet);
		
		
		
		
		//특정 이메일 주소의 존재 여부 확인
		
		boolean exists = emailSet.contains("bob@example.com");
		System.out.println("bob@example.com이 존재하는가?"+exists);
}//main
}//class
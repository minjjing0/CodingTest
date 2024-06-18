package string;
//String 객체는 값을 변경할 수 없는 Immutable 객체 
public class BufferAndBuilder {
public static void main(String[] args) {
	String s="abc";
	System.out.println(System.identityHashCode(s));   //객체를 특정할 수 있는 식별값을 반환 
	s+="def";
	System.out.println(System.identityHashCode(s));
	
	// 출력값이 달라진 것은 "abc"값만 가지고 있던 s와 "abcdef"값을 가지고 있는 s 가 서로 다른 객체임을 의미한다. 
	// 즉, String 객체의 값을 변경하는 작업은 새로운 String 객체를 만들고 값을 복사하는 작업이 수행됨을 의지 
	// 1.  새로운 String s 객체를 생성
	// 2. s 가 가진"abc" 값을 하나씩 복사 
	// 3. "abc" 뒤에 "def" 저장 
	
	System.out.println(s);
}
}

package string;

public class StringEx {

	
	public static void main(String[] args) {
		
		//문자열 초기화
		String string = "Hello,World!";
		
		//문자열 추가, 삭제 
		string = "He";
		string += "llo";
		System.out.println(string);
		
		//문자열 수정 
		string = string.replace("l", ""); //"l"을 모두 삭제 
		System.out.println(string);
	}
}

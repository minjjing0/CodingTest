package string;

public class Builder {
public static void main(String[] args) {
	long start = System.currentTimeMillis();
	//StringBuilder 객체 생성 
	StringBuilder s = new StringBuilder();
	for(int i=1; i<=100000; i++) {
		//문자열 Add
		s.append(i);
		
	}
	long end = System.currentTimeMillis();
	
	System.out.println(((end-start)/1000.0)+"초");
}
}

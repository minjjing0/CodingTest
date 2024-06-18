package string;

public class StringTime {
	
	public static void main(String[] args) {
		// 스트링 버퍼 
		long start = System.currentTimeMillis();
		
		String s = "";
		
		for (int i =1; i<=100000; i++) {
			s+=i;
			
			long end = System.currentTimeMillis();
			
			System.out.println(((end-start)/1000.0) +"초");
		}

	}
	}



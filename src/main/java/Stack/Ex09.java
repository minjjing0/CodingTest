package Stack;

import java.util.Stack;

public class Ex09 {

	//10진수를 2진수로 변환하기 
	
	class Solution{
		public static String solution(int decimal) {
			Stack<Integer> stack = new Stack<Integer>();
			
			while (decimal>0) {
				int remainder =decimal %2;
				stack.push(remainder);
				decimal /=2;
				
			}
			//String의 + 연산은 시간 복잡도 측면에서 성능이 좋지 않음
			//따라서 StringBuilder를 사용했음
			StringBuilder sb = new StringBuilder();
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			return sb.toString();
		}
	}
}

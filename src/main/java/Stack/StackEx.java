package Stack;

import java.util.Stack;

public class StackEx {

	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
	
		//데이터 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//데이터 출력
		System.out.println("스택:"+stack);
		
		//데이터 제거
		int removed = stack.pop();
		System.out.println("제거된 요소:"+removed);
		
		//스택의 맨 위 요소 확인
		
		int top = stack.peek();
		System.out.println("스택의 맨 위 요소:"+top);
		
		//데이터 출력
		
		System.out.println("스택:"+stack);
		
		//스택이 비어있는지 확인
		boolean isEmpty = stack.isEmpty();
		System.out.println("스택이 비어 있는가?" + isEmpty);
		
		//스택 제거
		stack.clear();
		
		boolean isEmpty2 = stack.isEmpty();
		//비어있는지 재확인
		System.out.println("스택이 비어 있는가?" + isEmpty2);
	
	}
}

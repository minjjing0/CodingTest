package Stack;

import java.util.ArrayDeque;

public class Ex08 {

	//	프로그래머스 올바른 괄호 
	//	https://school.programmers.co.kr/learn/courses/30/lessons/12909

	class Solution {
		private boolean solution(String s) {
			ArrayDeque<Character> stack = new ArrayDeque<Character>();
			
			char[] a = s.toCharArray();
			for(char c:a) {
				if (c=='(') {
					stack.push(c);
				}
				else {
					if(stack.isEmpty()|| stack.pop()==c)
						return false;
				}
			}
			return stack.isEmpty();
		}
	}
}

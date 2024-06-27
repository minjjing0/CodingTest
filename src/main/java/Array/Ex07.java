package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Ex07 {
	
//	방문 길이 
//	https://school.programmers.co.kr/learn/courses/30/lessons/49994

	class Solution {
		//1. 좌표 평면을 벗어나는지 체크하는 메서드 
		private static boolean isValidMove(int nx,int ny) {
			return 0<= nx&& nx<11&&0<=ny&&ny<11; 
		}
		// 2. 다음 좌표 결정을 위한 해시맵 생성
		private static final HashMap<Character, int[]> location = new HashMap<>();
		
		private static void initLocation() {
			location.put('U', new int[] {0,1});
			location.put('D', new int[] {0,-1});
			location.put('L', new int[] {-1,0});
			location.put('R', new int[] {1,0});
		}
		
		public int solution(String dirs) {
			initLocation();
			int x=5, y=5;
			
			HashSet<String> answer = new HashSet<>(); //3. 겹치는 좌표는 1개로 처리하기 위함
			//4. 주어진 명령어로 움직이면서 좌표 저장
			for (int i=0; i<dirs.length(); i++) {
				int[] offset = location.get(dirs.charAt(i));
				int nx = x+offset[0];
				int ny = y+ offset[1];
				if(!isValidMove(nx, ny)) //5.벗어난 좌표는 인정하지 않음
					continue;
				//6. A에서 B로 간 경우에 B에서 A도 추가해야함 (총 경로의 개수는 방향성이 없음)
				answer.add(x+" "+y+" "+nx+" " +ny);
				answer.add(nx+ " "+ny+ " " +x+" "+ y);
				//7.좌표를 이동했으므로 없데이터
				x=nx;
				y=ny;
				
			}
			
			return answer.size();
			
		}
	}
}

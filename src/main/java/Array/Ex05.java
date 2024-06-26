package Array;

public class Ex05 {
	//2차원 행렬 arr1과 arr2를 입력 받아 arr1 에 arr2를 곱한 결과를 반환하는 solution() 함수를 완성하세요
	// 제약조건 
	// 행렬 arr1, arr2의 행과 열의 길이는 2 이상 100이하입니다. 
	// 행결 arr1, arr2의 데이터는 -10 이상 20 이하인 자연수입니다. 
	// 곱할 수 있는 배열만 주어집니다. 
	
	class Solution {
		public int[][] solution(int[][] arr1, int[][] arr2) {
			//1.행렬 arr1 과 arr2의 행과 열의수 
			int r1 = arr1.length;
			int c1 = arr1[0].length;
			int r2 = arr2.length;
			int c2 = arr2[0].length;
			
			//2, 결과를 저장할 2차원 배열 초기화 
			int [][] answer = new int[r1][c2];
			
			//3. 첫 번째 행렬 arr1의 각 행과 두 번째 행렬 arr2 의 각 열에 대해 
			for (int i=0; i<r1; i++) {
				for(int j=0; j<c2; j++) {
					//4. 두 행렬의 데이터를 곱해 결과 리스트에 더함
					for( int k=0; k< c1; k++) {
						answer[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			return answer;
		}
	}
}

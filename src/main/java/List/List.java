package List;

import java.util.ArrayList;

public class List {
//배열 : 크기가 고정되어 있어서 데이터를 삭제하거나 삽입할 수 없음
//ArrayList : 가변 크기이므로 새 데이터의 삽입 혹은 기존 데이터를 삭제 할 수 있음 
	
	public static void main(String[] args) {
		//리스트 객체 생성
		ArrayList<Integer> list = new ArrayList<>();
		//값 추가 
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		
		System.out.println(list.get(2));
		System.out.println(list);
	}
}

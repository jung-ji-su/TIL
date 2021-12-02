package day06;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] arrData = {
				{10,20,30},
				{40,50,60}
		};
		
//		for (int i = 0; i < 6; i++) {
//			//0 1 2 3 4 5
//			System.out.println(arrData[i/3][i%3]);
//		}
		
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[0][j]);
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[1][j]);
//		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arrData[i][j]);
			}
		}
		
//		int[][] arrData2 = {
//				{10,20,30,40},
//				{50,60,70,80},
//				{90,100,110,120},
//				{130,140,150,160}
//		};
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(arrData2[i][j]);
//			}
//		}
		
		//비정방 배열 만들기(0행 : 3칸 / 1행 : 5칸 / 2행 : 2칸)
		int[][] arrData3 = new int[3][];
		arrData3[0] = new int[3];
		arrData3[1] = new int[5];
		arrData3[2] = new int[2];
		int cnt = 1;
		
//		for (int j = 0; j < 3; j++) {
//			arrData3[0][j] = cnt++;
//		}

//		for (int j = 0; j < 5; j++) {
//			arrData3[1][j] = cnt++;
//		}
		
//		for (int j = 0; j < 2; j++) {
//			arrData3[2][j] = cnt++;
//		}
		
		//arrData3.length -> arrData3가 가지고있는 주소공간에 있는 칸의 개수 -> 100번지에 있는 칸수 -> 행의 개수
		for (int i = 0; i < arrData3.length; i++) {
			//0 1 2
			//arrData3[i].length -> arrData3의 i번방이 가지고 있는 주소공간에 있는 칸의 개수 -> 각 배열의 칸수
			for (int j = 0; j < arrData3[i].length; j++) {
				arrData3[i][j] = cnt++;
			}
		}
		for (int i = 0; i < arrData3.length; i++) {
			for (int j = 0; j < arrData3[i].length; j++) {
				System.out.println(arrData3[i][j]);
			}
		}
	}
}
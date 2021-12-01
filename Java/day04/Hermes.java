package day04;

import java.util.Scanner;

public class Hermes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//메인에서 입력받는 값 담을 변수
		int mainChoice = 0;
		//성별 선택시 입력받는 값 담을 변수
		int genderChoice = 0;
		//Alt + Shift + R : 변수 사용하는곳들 까지 한번에 이름변경
		//첫번째 대카테고리 입력 받는 값 담을 변수
		int cateChoice1 = 0;
		//두번째 중카테고리 입력 받는 값 담을 변수
		int cateChoice2 = 0;
		//상품 선택시 입력받는 값 담을 변수
		int productChoice = 0;
		//장바구니 메뉴 선택시 입력받는 값 담을 변수
		int basketChoice = 0;
		//선택을 위한 변수는 각 구역에 들어가기 위함이다. 구역은 들어간 이상 무조건 내부의
		//모든 코드를 수행하기 때문에 기존에 담고있던 값이 꼭 필요한 경우가 아니라면 하나의 변수로
		//재사용 하는것이 좋을 수도 있다.(choice 변수 하나로 재사용 가능)
		//장점 : 메모리 효율, 코드 짧아짐
		//단점 : 가독성이 좋지않음, 프로그램 구조를 확실하게 파악해야 함
		
		//장바구니 용으로 사용할 변수(빈문자열로 초기화) - 연결로 장바구니 표현
		String basket = "";
		//사용자가 선택한 상품의 총 액수를 누적시킬 변수
		int total = 0;
		//사용자가 처음에 가지고 있는 돈
		int money = 1000000000;
		
		//*타이틀 출력*
		System.out.println("♧☆★☆★☆★§HERMES§★☆★☆★☆♧");
		while(true) {
			System.out.println("1. 상품구매\n2. 장바구니\n3. 나가기");
			mainChoice = sc.nextInt();
			//만약 mainChoice의 값이 3일때 나가기를 구현해야 하는데
			//switch문 안에 case로 구현하게 되면 break시 while문이 아닌
			//switch문을 탈출하게 된다.(종료하기 위한 추가작업이 필요하다.)
			//switch 위에 if문으로 조건문을 만들어서 break를 써주면
			//if문에 들어가게 되면 아래의 switch문을 가지 않고 while문 탈출
			//아니라면 아래의 switch문 정상작동
			if(mainChoice==3) {
				System.out.println("안녕히가세요~");
				break;//메인메뉴 반복문(36 ~ 161) 탈출
			}
			switch(mainChoice) {
			case 1:
				//상품구매
				while(true) {
					System.out.println("1. 여성\n2. 남성\n3. 뒤로가기");
					genderChoice = sc.nextInt();
					if(genderChoice == 3) {
						break;//성별 선택 메뉴 반복문(52 ~ 121) 탈출
					}else if(genderChoice == 1) {
						//여성
						while(true) {
							System.out.println("1. 여성복\n2. 가방\n3. 쥬얼리\n4. 뒤로가기");
							cateChoice1 = sc.nextInt();
							if(cateChoice1 == 4) {
								break;//대카테고리 선택 메뉴 반복문(59 ~ 117) 탈출
							}
							switch (cateChoice1) {
							case 1:
								//여성복
								while(true) {
									System.out.println("1. 가을-겨울 2021 컬렉션 룩\n2. 코트\n3. 뒤로가기");
									cateChoice2 = sc.nextInt();
									if(cateChoice2 == 3) {
										break;//중카테고리 선택 메뉴 반복문(68 ~ 108) 탈출
									}
									switch(cateChoice2) {
									case 1:
										//가을 겨울 ~~
										while(true) {
											System.out.println("1. “Brides de Gala en Desordre” 블라우스(3280000)\n"
													+ "2. “Zouaves et Dragons Finesse” 프린트 Esprit Pyjama 팬츠(3280000)\n"
													+ "3. 뒤로가기");
											productChoice = sc.nextInt();
											if(productChoice == 3) {
												break;//상품 선택 메뉴 반복문(77 ~ 102) 탈출
											}
											switch(productChoice) {
											case 1:
												//블라우스
												//basket 변수에 선택한 상품명 누적연결
												basket += "“Brides de Gala en Desordre” 블라우스\n";
												//total 변수에 선택한 상품의 가격을 누적
												total += 3280000;
												//결과문자열 출력
												System.out.println("“Brides de Gala en Desordre” 블라우스 이(가) 장바구니에 담겼습니다.");
												break;//(productChoice) switch문(85 ~ 101) 탈출
											case 2:
												//팬츠
												basket += "“Zouaves et Dragons Finesse” 프린트 Esprit Pyjama 팬츠\n";
												total += 3280000;
												System.out.println("“Zouaves et Dragons Finesse” 프린트 Esprit Pyjama 팬츠 이(가) 장바구니에 담겼습니다.");
												break;
											}
										}
										break;//(cateChoice2) switch문(74 ~ 107) 탈출
									case 2:
										//코트
										break;
									}
								}
								break;//(cateChoice1) switch문(65 ~ 116) 탈출
							case 2:
								//가방
								break;
							case 3:
								//쥬얼리
								break;
							}
						}
					}else if(genderChoice == 2) {
						//남성
					}
				}
				break;//(mainChoice) switch문(49 ~ 159) 탈출
			case 2:
				//장바구니
				while(true) {
					System.out.println("-------※장바구니※--------");
					//누적 연결된 basket문자열 출력(상품명들 출력)
					System.out.print(basket);
					System.out.println("--------------------");
					
					System.out.println("1. 전체 구매\n2. 장바구니 초기화\n3. 뒤로가기");
					basketChoice = sc.nextInt();
					if(basketChoice == 3) {
						break;//장바구니 메뉴 반복문(125 ~ 157)탈출
					}
					switch (basketChoice) {
					case 1:
						if(money >= total) {
							//현재 가지고 있는 잔액이 상품의 총액보다 크거나 같다면 결제 가능
							
							//기존의 금액에서 총액을 누적 감소
							money -= total;
							System.out.println(total+"원 결제 성공! 남은돈 : "+money);
							//결제했다면 총액과 장바구니 상품명들은 모두 초기화
							total = 0;
							basket = "";
						}else {
							//가지고 있는 잔액이 부족하다는 뜻이라 결제 실패
							System.out.println("결제 실패 / 잔액 부족");
						}
						break;//(basketChoice) switch문(136 ~ 156) 탈출
					case 2:
						total = 0;
						basket = "";
						break;
					}
				}
				break;//(mainChoice) switch문(49 ~ 159) 탈출
			}
			
		}
	}
}
// 4번메뉴 클래스 :DiamondStars


package homework5;

import java.util.Scanner;
public class DiamondStars {
	public void Dia(){
		Scanner s = new Scanner(System.in);
		System.out.print("다이아몬드의 크기입력 : ");
		int input = s.nextInt();  // 크기 입력 받음
		int star =0;  // * 그리기 할 녀석
		int gap = input;  // 공백을 그릴 녀석, 입력받은 크기값을 넣어줌 (입력값을 기준으로 공백의 갯수를 정하는데 쓰임)
		
		for(int i=1; i<(input*2); i++){ // i는 input(입력받은값)의 두배까지 돌게함 (삼각형을 위로바라보게, 아래를바라보게 그려서-> 다이아몬드를 그림)
			
			for(int j=0; j<=gap; j++){System.out.print(" ");} // gap 만큼 공백을 만듬("공백길이")
			for(int k=0; k <=star; k++){System.out.print("*");} // star만큼 *을 출력함 (*갯수)
				
			System.out.println();  // 한줄 개행
			
			if(i<input){ gap -= 1; star += 2; }  // 이등변 삼각형을 만드는 과정, 3번클래스와 방법 동일  ( ^ 모양 )
			
			if(i>input-1){ gap += 1; star -= 2; }  // 이 조건문으로 for문의 i가 input-1보다 작으면 그때부터는
											// 반대로. 즉 공백을 늘리고, *을 줄임 
			  								// 즉 삼각형을 역으로 그림 (  V  모양 )
		}
	}

}

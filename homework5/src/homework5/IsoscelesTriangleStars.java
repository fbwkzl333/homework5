// 3번메뉴 클래스 :IsoscelesTriangleStars

package homework5;
import java.util.Scanner;

public class IsoscelesTriangleStars {
	public void Iso(){
		Scanner s = new Scanner(System.in);
		System.out.print("이등변삼각형 높이입력 : ");
		int num = s.nextInt();  // 높이
		int star =0;  // * 그리기 할 녀석
		int nul = num;  // 입력받은 높이값을 넣어줌 (높이값을 시작으로 점점 작아지게 써먹을 예정)
		
		for(int i=0; i<num; i++){  // num만큼 줄 입력(높이)  [ 높이 for문 시작]
			
			for(int j=0; j<=nul; j++){System.out.print(" ");}// nul만큼 띄움("공백길이")
			for(int k=0; k <=star; k++){System.out.print("*");}// star만큼 *을 출력함 (*갯수)
				
			System.out.println();  // 한줄 개행		[ 이곳은 높이 for문]
			nul--;  // h를 1줄임 : " "를 전보다 1개씩 덜 출력하겠다.  (이등변삼각형 모양을 위해 한칸 왼쪽까지만 공백 출력)
			star+=2;  // star를 2개 늘림 : *를 전보다 2개씩 더 출력하겠다. ( nul 자리가 왼쪽으로 옮겨지니 *을 2개씩 더 출력시 이등변삼각형 완성)
		}
		
	}

}

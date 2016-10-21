// 2번메뉴 클래스 :TriangleStars

package homework5;
import java.util.Scanner;

public class TriangleStars {
	public void Tri(){
		Scanner s = new Scanner(System.in);
		System.out.print("직각삼각형의 왼쪽여백과 높이입력 : ");
		int width = s.nextInt();  // 직삼각형의 가로길이 (왼쪽을 여백으로)
		int height = s.nextInt();  // 직삼각형의 높이
		
		
		for(int i=1; i<=height; i++){  // height 만큼 for문 돔 (높이)
			for(int j=i; j<width; j++){ // 가로길이의 -1 만큼 
			System.out.print(" ");		// 공백 생성
			if(j == width-1){		// 공백 다 그렸을때
			for(int k=0; k<i; k++){ System.out.print("*"); }  // *을 i갯수만큼 입력
			}
			} System.out.println();//한줄의 * 값 입력 후, 다음 라인으로 개행
		}

}
}

// 1번메뉴 클래스 :RectagleStars

package homework5;
import java.util.Scanner;

public class RectagleStars {
	public void Rec(){
		Scanner s = new Scanner(System.in);
		System.out.print("정사각형 크기입력 : ");
		int num = s.nextInt();  // 정사각형의 가로,세로 길이 값을 입력받음
		for(int i = 0; i <num; i++){  // 세로길이 입력된 num 만큼 * 출력
			for(int j=0; j<num; j++){  // 가로길이 입력된 num 만큼 * 출력
				System.out.print("*");
			}System.out.println();  // 가로 한줄 완성마다 개행
		}
		
	}

}

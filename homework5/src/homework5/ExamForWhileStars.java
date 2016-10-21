// Main함수포함 클래스 : ExamForWhileStars
package homework5;
import java.util.Scanner;

public class ExamForWhileStars {
	
	public static void ReportClass(){
		Scanner s = new Scanner(System.in);
		System.out.print("*******************\n"
				+ "반복문 연습하기2\n"
				+ "*******************\n"
				+ "1. 정사각형 별찍기\n"
				+ "2. 직각삼각 별찍기\n"
				+ "3. 이등변삼각형 별찍기\n"
				+ "4. 다이아몬드 별찍기\n"
				+ "5. 종료하기\n"
				+ "원하는 메뉴는>> ");  // 문제 출력
		int num = s.nextInt(); 		// num을 int형으로 입력받음
		
		switch(num){ // num을 비교함 ( 입력된 번호 -> 해당 클래스 호출)
		case 1:  //num = 1(. 정사각형 별찍기 )
			RectagleStars num1 = new RectagleStars();  // 1번 클래스 인스턴스 생성
			num1.Rec();  // 1번 클래스 호출, 반환
			break;
		case 2: 
			TriangleStars num2 = new TriangleStars();
			num2.Tri();
			break;
		case 3:
			IsoscelesTriangleStars num3 = new IsoscelesTriangleStars();
			num3.Iso();
			break;
		case 4:
			DiamondStars num4 = new DiamondStars();
			num4.Dia();
			break;
		case 5:
			System.out.println("Goodbye Thank you !");
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ReportClass();
	}

}

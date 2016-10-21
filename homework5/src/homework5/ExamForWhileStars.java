// Main함수포함 클래스 : ExamForWhileStars

package homework5;
import java.util.Scanner;

public class ExamForWhileStars {
	
	public static void ReportClass(){
		Scanner s = new Scanner(System.in);
		System.out.print("*******************\n"
				+ "반복문 연습하기 2\n"
				+ "*******************\n"
				+ "1. 정삼각형 별찍기\n"
				+ "2. 직각삼각 별찍기\n"
				+ "3. 이등변삼각형 별찍기\n"
				+ "4. 다이아몬드 별찍기\n"
				+ "5. 종료하기\n"
				+ "원하는 메뉴는 >> ");  // 문제 출력
		int num = s.nextInt(); 		// num에 입력받은 int값 넣음
		
		switch(num){ // num이 뭔지 비교함 (번호선택->해당번호 클래스 실행)
		case 1:  //num = 1(. 정삼각형 별찍기를 입력했을때)
			RectagleStars num1 = new RectagleStars();  // 1번문제 클래스의 인스턴스 생성
			num1.Rec();  // 1번문제 클래스의 메소드 호출하여 반환
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

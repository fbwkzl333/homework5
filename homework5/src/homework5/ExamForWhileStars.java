// Main�Լ����� Ŭ���� : ExamForWhileStars

package homework5;
import java.util.Scanner;

public class ExamForWhileStars {
	
	public static void ReportClass(){
		Scanner s = new Scanner(System.in);
		System.out.print("*******************\n"
				+ "�ݺ��� �����ϱ� 2\n"
				+ "*******************\n"
				+ "1. ���ﰢ�� �����\n"
				+ "2. �����ﰢ �����\n"
				+ "3. �̵�ﰢ�� �����\n"
				+ "4. ���̾Ƹ�� �����\n"
				+ "5. �����ϱ�\n"
				+ "���ϴ� �޴��� >> ");  // ���� ���
		int num = s.nextInt(); 		// num�� �Է¹��� int�� ����
		
		switch(num){ // num�� ���� ���� (��ȣ����->�ش��ȣ Ŭ���� ����)
		case 1:  //num = 1(. ���ﰢ�� ����⸦ �Է�������)
			RectagleStars num1 = new RectagleStars();  // 1������ Ŭ������ �ν��Ͻ� ����
			num1.Rec();  // 1������ Ŭ������ �޼ҵ� ȣ���Ͽ� ��ȯ
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

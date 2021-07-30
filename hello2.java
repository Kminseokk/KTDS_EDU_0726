package java07_4week;
import java.util.Scanner;

public class hello2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0이하의 점수 100이상의 점수 예외처리 안함.
		int a;
		int b;
		int c;
		int d;
		double e;
		boolean f = true;
		
		String grade = "";
		
		System.out.println("점수 입력");
		System.out.println("수학 입력");
		a = sc.nextInt(); // name의 자료형과 일치시켜야 함.
		System.out.println("국어 입력");
		b =  sc.nextInt();
		System.out.println("여어 입력");
		c =  sc.nextInt();
		System.out.println("프로그래밍 입력");
		d =  sc.nextInt();
		
		e = (double)(a+b+c+d)/4;
		//System.out.println("평균"+ e);
		

		if(e >= 95) {
			grade = "A+";

		}
		else if (e >= 90) {
			grade = "A";
		}
		else if (e >= 85) {
			grade = "B+";
		}
		else if (e >= 80) {
			grade = "B";
		}
		else if (e >= 70) {
			grade = "C";
		}
		else if (e >= 60) {
			grade = "D";
		}
		else
			grade = "F";
		
	
		System.out.println("평균"+ e);
		System.out.println("학점"+ grade);
	}
}

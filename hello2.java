package java07_4week;
import java.util.Scanner;

public class hello2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0������ ���� 100�̻��� ���� ����ó�� ����.
		int a;
		int b;
		int c;
		int d;
		double e;
		boolean f = true;
		
		String grade = "";
		
		System.out.println("���� �Է�");
		System.out.println("���� �Է�");
		a = sc.nextInt(); // name�� �ڷ����� ��ġ���Ѿ� ��.
		System.out.println("���� �Է�");
		b =  sc.nextInt();
		System.out.println("���� �Է�");
		c =  sc.nextInt();
		System.out.println("���α׷��� �Է�");
		d =  sc.nextInt();
		
		e = (double)(a+b+c+d)/4;
		//System.out.println("���"+ e);
		

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
		
	
		System.out.println("���"+ e);
		System.out.println("����"+ grade);
	}
}

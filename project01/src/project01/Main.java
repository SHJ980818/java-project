package project01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		System.out.println("���ڿ� �ߵ� �ڰ����� �׽�Ʈ : [Y/N]�߿� ���ÿ�");
		
		//1��
		System.out.println("1. ���� ���ʴϱ�?"); 
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//2��
		System.out.println("2. ���� ���ø� �ѹ��� 1���̻�(����1000L�̻�) ���ʴϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//3��
		System.out.println("3. ���� �Ѵް� ���԰� �������� �ֽ��ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//4��
		System.out.println("4. ���� �Ѵް� �ѹ� ���� ���ñ� �����ϸ� ���� �� ������ ���� �־����ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//5��
		System.out.println("5. ���� �Ѵް� ���ַ� ���� �ؾ��� ���� ���� ���������ֽ��ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//6��
		System.out.println("6. ���� �Ѵް� ���� ���� ������ ������� �ʿ��ߴ� ���� �־����ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//7��
		System.out.println("7. ���� �Ѵް� ���� �Ŀ� ��å���� ��ų� ��ȸ�� ������ ���� �ֽ��ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//8��
		System.out.println("8. ���ַ� ���� ��� �ڽ��̳� �ٸ������ ��ģ ���� �ֽ��ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//9��
		System.out.println("9. ģô�̳� ģ��, Ȥ�� �ǻ簡 ����� �� ���ô� ���� �����ϰų� �� ���⸦ ���������� �־����ϱ�?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//��� ���
		if(count>=8){
			System.out.println("�ߵ�!");
			System.out.println("������ ����� �ʿ���");
		}else if(5 <= count && count <= 7){
			System.out.println("����!");
			System.out.println("���ڿ��� ���̱� ���� �Ľ��� ������ �ʿ���");
		}else if(count<=4){
			System.out.println("����!");
			System.out.println("������ ������ �ƴ����� ���� �ʿ�");
		}else{
			System.out.println("����");
		}
	}

}

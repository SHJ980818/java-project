package project01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		System.out.println("알코올 중독 자가진단 테스트 : [Y/N]중에 고르시오");
		
		//1번
		System.out.println("1. 술을 마십니까?"); 
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//2번
		System.out.println("2. 술을 마시면 한번에 1병이상(맥주1000L이상) 마십니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//3번
		System.out.println("3. 지난 한달간 술먹고 토한적이 있습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//4번
		System.out.println("4. 지난 한달간 한번 술을 마시기 시작하면 멈출 수 없었던 때가 있었습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//5번
		System.out.println("5. 지난 한달간 음주로 인해 해야할 일을 하지 못한적이있습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//6번
		System.out.println("6. 지난 한달간 술을 마신 다음날 해장술이 필요했던 적이 있었습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//7번
		System.out.println("7. 지난 한달간 음주 후에 죄책감이 들거나 후회를 느꼈던 적이 있습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//8번
		System.out.println("8. 음주로 인해 당신 자신이나 다른사람이 다친 적이 있습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//9번
		System.out.println("9. 친척이나 친구, 혹은 의사가 당신이 술 마시는 것을 걱정하거나 술 끊기를 권유한적이 있었습니까?");
		if(scan.nextLine().equals("Y")){
			count++;
		}
		//결과 출력
		if(count>=8){
			System.out.println("중독!");
			System.out.println("전문의 상담이 필요함");
		}else if(5 <= count && count <= 7){
			System.out.println("위험!");
			System.out.println("알코올을 줄이기 위한 식습관 개선이 필요함");
		}else if(count<=4){
			System.out.println("주의!");
			System.out.println("위험한 수준은 아니지만 관리 필요");
		}else{
			System.out.println("정상");
		}
	}

}

package sp;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		TitleDAO tdao = new TitleDAO();
		
		boolean flagMainWhile = true;

		
		while(flagMainWhile) {
		int stat;
		System.out.print("1.설문 조사 하기\n2.설문 전체 현황보기\n3.설문 1등 현황 보기\n4.종료\n\n");
		System.out.print("선택 : ");
		stat = scan.nextInt();
			
			switch(stat) {
			case 1:
				List<TitleVO> av = tdao.getAllList();
				for(TitleVO t : av) {
					System.out.println(t.getNum()+". "+t.getItem());
				}
				System.out.print("선택 : ");
				
				int num = scan.nextInt();
				tdao.updateTitle(num);
				System.out.println();
				break;
				
			case 2:
				System.out.println("설문 전체 현황 보기\n\n");
				List<TitleVO> av2 = tdao.getAllList();
				for(TitleVO t : av2) {
					System.out.println(t);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("설문 1등 현황 보기\n\n");
				List<TitleVO> av3 = tdao.getBest(); // getBest();
				for(TitleVO t : av3) {
					System.out.println(t);
					System.out.printf("\n★Total 1st★ :"+t.getItem()+"\n\n\n");
					break;
				}
				break;
			case 4:
				System.out.println("종료\n");
				flagMainWhile = false;
				break;
//				default :
//				System.out.println("\nPlease enter it again");
//				continue;
			}
		} 
//		else {
//			System.out.println("System off");
		
		}	
	
	}

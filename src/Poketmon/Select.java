package Poketmon;

import java.util.Scanner;

public class Select {
	

	public static void main(String[] args) {
		
		Monster[] pocket = new Monster[5];
		int index = 0;
		
		RestArea ra = new RestArea();
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포켓몬 키우기에 오신걸 환영합니다!!!");
		
		while(true) {
		System.out.println("당신의 포켓몬을 선택해주세요");
		System.out.println("1. 피카츄");
		System.out.println("2. 파이리");
		System.out.println("3. 꼬부기");
		int no = sc.nextInt();
		
		sc.nextLine();
		switch(no) {
			case 1 : 
				System.out.println("선택한 포켓몬의 이름을 정해주세요!");
				name = sc.nextLine();
				pocket[index++]= new Pikachu(name);
				break;
			case 2 : 
				System.out.println("선택한 포켓몬의 이름을 정해주세요!");
				name = sc.nextLine();
				pocket[index++]= new Paili(name);
				break;
			case 3 : 
				System.out.println("선택한 포켓몬의 이름을 정해주세요!");
				name = sc.nextLine();
				pocket[index++]= new Kkobugi(name);
				break;
			default : 
				System.out.println("목록에 없는 숫자를 입력하셨습니다.");
				break;
		}
		
		ra.rest(pocket);
		}
	}
}

package Poketmon;

import java.util.Scanner;

public class RestArea {

	public void rest(Monster[] pocket) {
		//		System.out.println(poket.getName() + "선택되었습니다");

		while(true) {
			System.out.println("포켓몬이랑 무엇을 할까요?");
			System.out.println("1.밥 먹기");
			System.out.println("2.잠자기");
			System.out.println("3.운동하기");
			System.out.println("4.정보보기");
			System.out.println("5.돌아가기");
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();

			switch(no) {
			case 1 : 
				eat(pocket);
				break;
			case 2 : 
				sleep(pocket);
				break;
			case 3 : 
				exercise(pocket);
				break;
			case 4 : 
				info(pocket);
				break;
			case 5 : 
				System.out.println("포켓몬을 선택하러 돌아갑니다.");
				return;
			}
		}
	}

	public void eat(Monster[] pocket) {
		for(int i = 0; i < pocket.length; i++) {
			if(pocket[i] != null)
			pocket[i].eat();
		}
	}

	public void sleep (Monster[] pocket) {
		for(int i = 0; i < pocket.length; i++) {
			if(pocket[i] != null)
			pocket[i].sleep();
		}
	}

	public void exercise(Monster[] pocket) {
		for(int i = 0; i < pocket.length; i++) {
			if(pocket[i] != null)
			pocket[i].exercise();
		}
	}

	public void info(Monster[] pocket) {
		for(int i = 0; i < pocket.length; i++) {
			if(pocket[i] != null)
			pocket[i].getInformation();
		}
	}

}

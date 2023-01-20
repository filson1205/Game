package Poketmon;

public class Monster extends PoketmonDTO {
 		
	public Monster () {
		setLevel(1);
		setExp(0);
		setAttack(10);
	}
		
		public void eat() {
			System.out.println("포켓몬이 밥을 먹습니다.");
			setExp(getExp() + 15);
		}
		public void exercise() {
			System.out.println("포켓몬이 운동을 합니다.");
			setExp(getExp() + 30);
		}
		public void sleep() {
			System.out.println("포켓몬이 잠을 잡니다.");
			setExp(getExp() + 5);
		}
		
	}


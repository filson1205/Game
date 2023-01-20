package Poketmon;

public class Pikachu extends Monster {
	
	public Pikachu(String name) {
		super();
		setTribe("피카츄");
		setName(name);
	}
	
	@Override
	public void exercise() {
		System.out.println("피카츄는 달리기 합니다.");
		setExp(getExp() + 30);
	}
	
	@Override
	public void eat() {
		System.out.println("피카츄는 사과를 먹습니다.");
		setExp(getExp() + 15);
	}

}

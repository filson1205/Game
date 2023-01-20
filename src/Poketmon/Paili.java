package Poketmon;

public class Paili extends Monster {
	
	public Paili(String name) {
		super();
		setTribe("파이리");
		setName(name);
	}
	
	@Override
	public void exercise() {
		System.out.println("파이리는 점프를 합니다.");
		setExp(getExp() + 30);
	}
	
	@Override
	public void eat() {
		System.out.println("파이리는 딸기를 먹습니다.");
		setExp(getExp() + 15);
	}

}

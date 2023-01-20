package Poketmon;

public class Kkobugi extends Monster {
	
	public Kkobugi(String name) {
		super();
		setTribe("꼬부기");
		setName(name);
	}
	
	@Override
	public void exercise() {
		System.out.println("꼬부기는 수영을 합니다.");
		setExp(getExp() + 30);
	}
	
	@Override
	public void eat() {
		System.out.println("꼬부기는 수박을 먹습니다.");
		setExp(getExp() + 15);
	}

}

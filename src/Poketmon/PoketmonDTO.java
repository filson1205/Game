package Poketmon;

public class PoketmonDTO {
	
	private String tribe;
	private String name;
	private int level;
//	private String hp;
	private int exp;
	private int attack;
	
//	public PoketmonDTO(String name) {
//		super();
//		this.name = name;
//		this.level = 1;
//		this.exp = 0;
//		this.attack = 10;
//	}
	
	
	public String getTribe() {
		return tribe;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}

	public int getExp() {
		return exp;
	}

	public int getAttack() {
		return attack;
	}
	
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}	
	
	public void getInformation() {
		
		if(exp >= 100 * level) {
			exp -= 100 * level;
			level ++;
			attack += 100;
		}
		
		System.out.println(
				"포켓몬 정보 ["
				+ "name = " + name +
				", level = " + level +
				", exp = " + exp +
				", attack = " + attack +
				"]");
		}
	
}
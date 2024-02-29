
public class Character{
	
	protected String species;
	protected int hp;
	protected int maxHp;
	protected int atk;
	protected int df;
	
	
	public Character(String species, int hp, int atk, int df) {
		this.species = species;
		this.hp = hp;
		this.maxHp = this.hp;
		this.atk = atk;
		this.df = df;
		
	}
	
	
	
	public void doDmg(Character enemy) {
		int dmg = this.atk - enemy.df;
		enemy.hp -= dmg;
		System.out.println(this.species + " deals " + dmg + " damage to the " + enemy.species + "!");
	};
	
	public void useSkill( Character enemy) {
		int dmg = this.atk * 2 - enemy.df;
		enemy.hp -= dmg;
		System.out.println(this.species + " uses a skill and deals " + dmg + " damage to the " + enemy.species + "!");
	}
	
	public String defeat() {
		return "Oh no... " + this.species + " is defeated!";
	}
	
	
}


public class Humans extends Character {
	
	
	
	public Humans() {
		super("Human", 100, 10, 10);
	}
	
	public void equipArmor(boolean armor) {
		if(armor) {
			this.df += 5;
		}
	}
	
	public void equipWeapon(boolean weapon) {
		if(weapon) {
			this.atk += 15;
		}
	}
	
	public void uniqueSkill(Character enemy) {
		//deal 60 dmg
		enemy.hp -= 60;
		System.out.println("The Human uses his unique skill! WOW 60 DAMAGE! That has to hurt!");
	}
	
	

}

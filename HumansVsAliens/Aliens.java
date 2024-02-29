
public class Aliens extends Character {

	public Aliens() {
		super("Alien", 200 , 25, 0);
	}
	
	public void uniqueSkill() {
		//heal 30 hp
		if(this.maxHp == this.hp) {
			System.out.println("Already at max health!");
		} else {
			int remainingHealing = Math.min(30, this.maxHp - this.hp);
	        this.hp += remainingHealing;
	        System.out.println("Used unique skill! Healed " + remainingHealing + " hp!");
		}
	}
	
	public void transform() {
		//low health transformation, low health but high attack
		System.out.println("The alien is transforming!!");
		if(this.hp > 40 || this.hp == 0) {
			System.out.println("It's transformation failed!");
		}else if(this.hp <= 40 && this.hp > 0) {
			this.maxHp = 60;
			this.hp = 60;
			this.atk *= 2;
			System.out.println("WOW that looks terrifying!");
		}
		
	}
}

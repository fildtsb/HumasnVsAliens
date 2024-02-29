
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class HvaTest {
	Humans johnDoe;
	Aliens glorp;
	
	
	@BeforeEach
	public void beforeEach() {
		johnDoe = new Humans();
		glorp = new Aliens();
	}
	
	@Test
	public void damageTestNoWeapon() {
		johnDoe.doDmg(glorp);
		assertEquals(glorp.maxHp - 10, glorp.hp);
		
	}
	
	@Test
	public void dmgTestWithWeapon() {
		johnDoe.equipWeapon(true);
		johnDoe.doDmg(glorp);
		assertEquals(glorp.maxHp - 25, glorp.hp);
	}
	
	@Test
	public void dmgTestAlien() {
		glorp.doDmg(johnDoe);
		assertEquals(johnDoe.maxHp - 15, johnDoe.hp);
	}
	
	@Test
	public void testHumanSkill() {
		johnDoe.equipWeapon(true);
		johnDoe.useSkill(glorp);
		assertEquals(glorp.maxHp - 50, glorp.hp);
	}
	
	@Test
	public void testAlienSkill() {
		johnDoe.equipArmor(true);
		glorp.useSkill(johnDoe);
		assertEquals(johnDoe.maxHp - 35, johnDoe.hp);
	}
	
	@Test
	public void testHumanUSkill() {
		johnDoe.uniqueSkill(glorp);
		assertEquals(glorp.maxHp - 60, glorp.hp);
	}
	
	@Test
	public void testAlienUSkill() {
		glorp.uniqueSkill();
		assertEquals(glorp.maxHp, glorp.hp);
	}
	
	@Test
	public void testAlienUSkill2() {
		johnDoe.equipWeapon(true);
		johnDoe.doDmg(glorp);
		glorp.uniqueSkill();
		assertEquals(glorp.maxHp - 25 + 25, glorp.hp);
	}
	
	@Test
	public void transformTest() {
		glorp.hp = 40;
		glorp.transform();
		assertEquals(glorp.maxHp, glorp.hp);
		
	}
	@Test
	public void transformFailTest() {
		glorp.hp = 70;
		glorp.transform();
		assertEquals(200, glorp.maxHp );
		
	}
	
	@Test
	public void transformFailTest2() {
		glorp.hp = 0;
		glorp.transform();
		assertEquals(200, glorp.maxHp);
		
	}
	
	@Test
	public void transformAtkTest() {
		glorp.hp = 30;
		glorp.transform();
		glorp.doDmg(johnDoe);
		assertEquals(johnDoe.maxHp - 40, johnDoe.hp);
	}
	
	@Test
	public void humanDefeatTest() {
		String defeat = johnDoe.defeat();
		assertEquals("Oh no... Human is defeated!", defeat);
		
	}
}

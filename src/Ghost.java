/**
 * This is an enemy class (single attack type
 * @author colinpecka
 *
 */
public class Ghost extends Enemy implements EnemyMagician {

	public Ghost(int hp, int attack, int heal) {
		super(hp, attack, heal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * heals enemy
	 */
	public void castHeal() {
		int x =this.getHp()+this.getHeal();//enemy health improvement 
		System.out.println("The ghost fixes up some of his wounds. His heath is now "+x);
		this.setHp(x);//change Hp
		
	}

	/**
	 * attacks player
	 */
	public void castDamage(Being p) {
		System.out.println("The Ghost Frightens you\nGhost-\"BOO\"\nYou Stumble and bumb your head");
		p.setHp(p.getHp()-this.getHeal());//subtracts player health
		
	}

	/**
	 * Damage heal player
	 */
	public void damageHeal(Being p) {
		this.setHp(this.getHp()+this.getHeal());//heals enemy
		p.setHp(p.getHp()-this.getHeal());//damages player
		System.out.println("The ghost floats in side if you making you feel weaker\nYour health is now "+p.getHp()+"\nThe ghosts health is now "+this.getHp());
		
		
	}

	/**
	 * Outputs loss script
	 */
	
	public void loss() {
		System.out.println("Ghost-\"I guess I'm dying for the second time today\"");
		
	}

	/**
	 * outputs positive or negative conversation response
	 */
	public void talked(boolean gtalk) {
		//positive
		if(gtalk) {
			System.out.println("You explain to the ghost that becuase he is importal he will eventually do everything\nIncluding letting you leave\nGhost-\"Can't argue with that logic\"\nThe ghost lets you go without putting up a fight");
		}
		//negative
		else {
			System.out.println("The ghost clearly does not care for your mortal pleas"); 
		}
		
	}

}

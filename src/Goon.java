/**
 * This is the most common enemy class. it is used to classify any enemy that is not special (Singular attack type)
 * @author colinpecka
 *
 */
public class Goon extends Enemy implements EnemyStriker{

	public Goon(int hp, int attack, int heal) {
		super(hp, attack, heal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Attacks player
	 */
	public void Strike(Being p) {
	
		p.setHp(p.getHp()-this.getAttack());//subtracts health from player
		System.out.println("Goon-\"Take that!\"\nThe Goon has bopped you on the head.");
		
		
	}

	/**
	 * Heals enemy
	 */
	public void Mend() {
		System.out.println("The Goon heals his wounds");
		this.setHp(this.getHp()+this.getHeal());//fixes up the goon
		System.out.println("The Goons health is back to "+this.getHp());
		
	}

	/**
	 * outputs loss script
	 */
	public void loss() {
		System.out.println("Goon- \"O heck, ya got me\"");
		
	}

	/**
	 * outputs good or bad conversation script
	 */
	public void talked(boolean gtalk) {
		//good conversation
		if(gtalk) {
			System.out.println("Goon- \"It's been nice talking to you\"");
		}
		//bad conversation
		else {
			System.out.println("Goon- \"You rat! I'll kill you!\"");
		}
		
	}

}

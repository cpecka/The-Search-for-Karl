/**
 * Enemy class (multiple attack type)
 * @author colinpecka
 *
 */
public class Troll extends Enemy implements EnemyStriker {

	public Troll(int hp, int attack, int heal) {
		super(hp, attack, heal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Hits player
	 */
	public void Strike(Being p) {
		int odds=(int)(Math.random()*3+1);//chooses attack type
		//type 1
		if(odds<=1) {
			int x= p.getHp()-this.getAttack();//subtracts health from player
			System.out.println("The troll points off into the distance behind you\nTroll-\"Look over there!\"\nFalling for his crafty trick you turn and see nothing\nThe troll punches you in the gut while your not looking\nYour health is now "+ x);
			p.setHp(x);//Changes player health
		}
		//type 2
		else if(odds==2) {
			int x= p.getHp()-(this.getAttack()+3);//subtracts more health from player
			System.out.println("The rather short troll hucks a rock at your head\nYou hold your head in your hands \"that really hurt\" you think to yourself\nYou look up and see the troll laughing at you\nYou realize that while you where distracted the troll pulled down your pants\nYour health is now "+x+"\nBut your pride is significantly lower");
			p.setHp(x);//Changes player health
		}
		//type 3
		else {
			int x= (p.getHp()-this.getAttack())-2;//subtracts less health from player
			System.out.println("The troll calls you a fart\nTroll-\"You'er a fart\"Your feelings have been hurt and your Health is now "+x);
			p.setHp(x);//Changes player health
		}
		
	}

	/**
	 * heals enemy
	 */
	public void Mend() {
		System.out.println("The troll makes a lude gesture\nHe feeds off your saddness and becomes stronger");
		this.setHp(this.getHp()+this.getHeal());//heals enemy
		
	}

	/**
	 * outputs enemy death script
	 */
	public void loss() {
		System.out.println("The troll makes one final hurtful remark\nTroll-\"You are dumb\"\nYour feelings are hurt but nothing more\nYou find some comfort in the knowledge the troll is dead");
		
		
	}

	/**
	 * outputs positive or negative conversation reaction
	 */
	public void talked(boolean gtalk) {
		//positive
		if(gtalk) {
			System.out.println("Ok I see your point...loser\nYou try to think of a clever remark but it's too late\nThe troll scuttles off into a bush calling a squirle dumb on the way\nYou regret not killing the troll when you had the chance");
		}
		//negative
		else {
			System.out.println("You finish reasoning with the troll and it seems you have come to an agreement\nTroll-\"SIKE!\"\nIt seems the troll has bamboozeled you");
		}
		
	}

}

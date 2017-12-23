/**
 * Wizard is a magical and very strange enemy (Multiple attack type)
 * @author colinpecka
 *
 */
public class Wizard extends Enemy implements EnemyMagician{

	public Wizard(int hp, int attack, int heal) {
		super(hp, attack, heal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Heals enemy
	 */
	public void castHeal() {
		System.out.println("The wizard does a strange dance that makes you feel somewhat uncomfortablee\nIt looks like his wounds have healed a little though.");
		this.setHp(this.getHp()+2);//increase enemy health
		System.out.println("The wizards health is back to "+this.getHp());
	}

	/**
	 * Damages player
	 */
	public void castDamage(Being p) {
		int odds=(int)(Math.random()*3+1);//randomly chooses attack
		//attack type 1
		if(odds<=1) {
			int x=p.getHp()-this.getAttack();//Regular attack
			System.out.println("The Wizard removes his hat and out comes a snapping turtle.\n The wizard then places the turtle in his trousers and screams so loud that you are knocked back\nyour health is now "+x);
			p.setHp(x);//changes player health
		}
		//attack type 2
		else if(odds==2) {
			int x=p.getHp()-(this.getAttack()+2);//stronger attack
			System.out.println("The wizard teleports behind you and punches you in the back of the head\nshifty bastard\n\nYour health has been reduced to "+x);
			p.setHp(x);//changes player health
		}
		//attack type 3
		else {
			System.out.println("The old wizard groans\nWizard-\"muuuh\"\nHe's clearly exausted and you feel somewhat bad that your fighting an old man");
		}
		
		
	}

	/**
	 * Outputs death script
	 */
	public void loss() {
		System.out.println("The wizard utters a final magical groan before he collapses\nWizard-\"muuuh\"\nNow that you think about it maybe fighting the old man wasn't the most honorable choice");
		
		
	}

	/**
	 * outputs positive or negative conversation response
	 */
	public void talked(boolean gtalk) {
		//Positive
		if(gtalk)
			System.out.println("Wizard-\"You are such a nice young man\"\nThe wizard reaches into his hat and pulls out a nickel and hands it to you\nyou examine it and reach into your pocket\nYou realize that he opened some sort of portal in your pocket and re-gifted you your own nickel\nAngrey you turn to the wizard but he's already disappeared\nYou hear ammused cackeling in the woods around you\nGod damned wizards");
		//Negative
		else
			System.out.println("The wizard gives you an odd look\nHe is old, perhaps he's def\nHe begins chanting a battle spell");
	}

	/**
	 * damages player and gives health to enemy
	 */
	public void damageHeal(Being p) {
		System.out.println("The old wizard dances in a manor that makes you extremly uncomfortable\nYou vomit\nthe wizard quickly moves to lick up the vomit\nIt appears that he has gained the health you lost.");
		p.setHp(p.getHp()-this.getHeal());//takes player health
		this.setHp(this.getHp()+this.getHeal());//replenishes enemy health
	}

}

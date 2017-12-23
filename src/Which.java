/**
 * the witch is an enemy class (multiple attack type)
 */
import java.util.Scanner;

public class Which extends Enemy implements EnemyMagician  {
	static Scanner in = new Scanner (System.in);
	public Which(int hp, int attack, int heal) {
		super(hp, attack, heal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * heals enemy
	 */
	public void castHeal() {
		int x=(this.getHp()+this.getHeal());//Calculates enemy health
		System.out.println("The witch walks away from the battle over to a cauldron\nShe begins brewing a health potion\nYou could go over and attack her but you decide that would be dishonerable\nYou wait for her to finish her work\n...\nShe drinks the potion and and her health is now "+x);
		this.setHp(x);//changes hp
	}

	/**
	 * Damages player heals enemy
	 */
	public void castDamage(Being p) {
		int odds=(int)(Math.random()*3+1);//chooses attack type
		//type 1
		if(odds<=1) {
			int x= p.getHp()-this.getAttack();//regular health change
			System.out.println("The witch hurrels a fireball at you\n\nOOF\n\nYour Health is now "+x);
			p.setHp(x);//changes player health
		}
		//type 2
		else if(odds==2) {
			int x= p.getHp()-(this.getAttack()+2);//large health change
			System.out.println("The witch pulls a whistle out of her pocket and blows it\nWitch-*Whistle*\nA large winged monkey flys down from the heavens and strikes you in the face\nYour health is now "+x);
			p.setHp(x);//Changes player health

		}
		//type 3 (optional damage)
		else {
			int x= p.getHp()-(this.getAttack()+4);//extra large health change 
			System.out.println("The witch pulls a black cat out of her hat and throws it on the ground before you\nThe cat moves into position to cross your path\n\n1)Remain where you are\n2)move so that the cat cannot cross your path");
			int z=in.nextInt();
			//does player dodge bus
			if(z!=1) {
				System.out.println("You move and the witch is clearly dissapointed\nWitch-\"Darn\"");
			}
			//if they don't
			else {
				System.out.println("The cat walks in front of you\nSuddenly a bus comes flyin out of the forest around you\nIt strikes you head on\nYour health is now "+x);
				p.setHp(x);//health change
			}
			
		}
		
	}

	/**
	 * damage player heal enemy
	 */
	public void damageHeal(Being p) {
		System.out.println("The witch politly walks over and ask for a smaple of your hair\nYou give some to her\nShe cackles and puts it in her cauldron\nShe brews a potion and drinks it\nYou feel weaker\nThe Witch has stolen your health");
		this.setHp(this.getHp()+this.getHeal());//fixes enemy
		p.setHp(p.getHp()-this.getHeal());//damages player
	}

	/**
	 * outputs death script
	 */
	public void loss() {
		System.out.println("The witch melts\nWitch-\"I'm Melting!\"");
		
	}

	/**
	 * outputs positive or negative conversation script
	 */
	public void talked(boolean gtalk) {
		//positive
		if(gtalk)
			System.out.println("The witch decides your to kind to fight with\nWitch-\"Bye\"");
		//negative
		else
			System.out.println("The witch scoffs at your proposals\nWitch-\"Scoff\"");
		
	}

}

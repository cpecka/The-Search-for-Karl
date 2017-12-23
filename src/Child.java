/**
 * This is one of the options for playable characters. The has more that one opportunity to talk through a problem.
 * @author colinpecka
 *
 */
public class Child extends Being{

	private int Limit;//number of times special move can be used

	public Child(int hp, int friend, int attack, int heal, int level, int limit) {
		super(hp, friend, attack, heal, level);
		this.Limit= limit;
		
	}


	/**
	 * This method has how the child solves problems non-violently
	 */
	public boolean Talk(Enemy p) {
		int odds= (int)(Math.random()*(this.getFriend()+0)-0);//creates a 50/50 chance for conversation success
		//if successful conversation
		if(odds>=getFriend()/2) {
			System.out.println("You have successfully worked out your differances without using violence!\nGreat work kiddo");
			p.talked(true);//causes enemy to say their positive remarks
			return true;
		}
		else {
			System.out.println("You accedentally insulted your opponants mother. Whoops");
			p.talked(false);//causes enemy to day their negative remarks
			return false;
		}
	}

	/**
	 * Heals player
	 */
	public void Mend() {
		System.out.println("You put a band-aid on your cuts");
		this.setHp(this.getHp()+this.getHeal());//heals character
	}
/**
 * Child special move
 */
	public void specialMove(Enemy p) {
		//if is allowed to use special move
		if (this.getLimit()>0) {
			this.setLimit(0);//makes it so that player cannot use special move
			p.setHp(p.getHp()-this.getAttack()*2);//subtracts extra health from enemy
			System.out.println("Your throw a temper tantrum\nIt's super effective!");
		}
		else
			System.out.println("you are to tired too throw a temper tantrum");
		//checks if special move kills opponent 
		if(p.getHp()<=0) {
			System.out.println("Good job lil' guy. You won the fight!");
			this.levelUp();//levels up player
			System.out.println("You leveled up!");
		}
	}


	public int getLimit() {
		return Limit;
	}


	public void setLimit(int limit) {
		Limit = limit;
	}

/**
 * This is for hitting enemy combatant
 */
	public void Strike(Enemy p) {
		// TODO Auto-generated method stub
		int odds=(int)(Math.random()*3+1);//Randomly chooses attack type
		//attack type one
		if(odds<=1) {
			System.out.println("You give your enemy an adorable childs smile\nThen while they are distracted you punch them in the gut");
		}
		//attack type two
		if(odds==2) {
			System.out.println("You pick up a pebble and through it at your enemy");
		}
		//attack type three
		else{
			System.out.println("You say\"Ravioli Ravioli, give me the Pizza Rolli\"");
		}
		p.setHp(p.getHp()-this.getAttack());//subtracts usual enemy health
		//if enemy dies in combat
		if(p.getHp()<=0) {
			System.out.println("Good job lil' guy. You won the fight!");
			this.levelUp();//level up player
			System.out.println("You leveled up!");
		}
		
	}
	


}

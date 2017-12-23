/**
 * This is another playable character choice for the player
 * @author colinpecka
 *
 */
public class Warrior extends Being{

	private int TLimit;//number of times talk can be used in a fight
	private int RLimit;//number of times special move can be used in a fight
	public Warrior(int hp, int friend, int attack, int heal, int level, int TLimit, int RLimit) {
		super(hp, friend, attack, heal, level);
		this.TLimit=TLimit;
		this.RLimit=TLimit;
		// TODO Auto-generated constructor stub
	}
	/**
	 * Attack protocol
	 */
	public void Strike(Enemy p) {
		int odds=(int)(Math.random()*3+1);//chooses attack type
		//attack type one
		if(odds<=1) {
			System.out.println("You swing your war hammer at your enemy\n\"For Karl!\" you yell.");
		}
		//attack type 2
		if(odds==2) {
			System.out.println("You reach into your pocket and pull out a dagger\nYou throw it at the head of your enemy");
		}
		//attack type 3
		else {
			System.out.println("You slash your enemy with your great sword");
		}
		p.setHp(p.getHp()-this.getAttack());//subtracts enemy Hp 
		//if enemy is dead
		if(p.getHp()<=0) {
			System.out.println("Excellent work! You reduced your enemy to nothing more than a puddle of blood!");
			this.levelUp();
			System.out.println("You leveled up!");
	}
		
	}
	/**
	 * Warrior mend
	 */
	public void Mend() {
		System.out.println("You yell at your wounds to heal themselves and they do");
		this.setHp(this.getHp()+this.getHeal());//Heal
		
	}

	@Override
	/**
	 * Warrior talk
	 */
	public boolean Talk(Enemy p) {
		//if warrior hasn't used talk already in a fight
		if(this.getTLimit()>0) {
			this.setTLimit(0);//disable talk function
		int odds= (int)(Math.random()*(this.getFriend()+0)-0);//Determines how the conversation will go
		//if it goes well
		if(odds>=getFriend()/2) {
			System.out.println("You come to a manly agreement with your enemy. Looks like things are gonna be alright");
			this.setFriend(this.getFriend()+2);//talk ability upgrade
			p.talked(true);//enemy positive interaction script
			this.setTLimit(1);//resets talk ability
			return true;
		}
		else {
			System.out.println("In the process of trying to reach an agreement you Punch your apponant in the face.\nThey look really angry!");
			p.talked(false);//enemy negative interaction script
			return false;
		}
		}
		else {
			System.out.println("You already tried that and it didn't really work out.");
			return false;
		}
	}
	public int getTLimit() {
		return TLimit;
	}

	public void setTLimit(int tLimit) {
		TLimit = tLimit;
	}

	public int getRLimit() {
		return RLimit;
	}

	public void setRLimit(int rLimit) {
		RLimit = rLimit;
	}
	/**
	 * Special move for Warrior
	 */
	public void specialMove(Enemy p) {
		//if can use special move
		if (this.getRLimit()>0) {
			this.setRLimit(0);//can no longer use special move
			p.setHp(p.getHp()-this.getAttack()*2);//subtracts large amount of hp from enemy
			System.out.println("You yell an angrey warrior yell\nSheer force of rage in the shout blasts your enemy on its back");
		}
		else
			System.out.println("You'er not angry enough for that right now!");
		//if enemy dies
		if(p.getHp()<=0) {
			System.out.println("Excellent work! You reduced your enemy to nothing more than a puddle of blood!");
			this.levelUp();//level up
			System.out.println("You leveled up!");
	}

}
}

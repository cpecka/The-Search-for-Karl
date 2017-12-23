/**
 * This is an abstract class that will be the parent of both playable characters
 * @author colinpecka
 *
 */
public abstract class Being {
	
	private int hp;//player health
	private int friend;//players ability to talk things out
	private int attack;//player attack strength
	private int heal;//player heal ability
	private int level;//player level
	
	public Being(int hp, int friend, int attack, int heal, int level) {
		this.hp = hp;
		this.friend = friend;
		this.attack = attack;
		this.heal = heal;
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getFriend() {
		return friend;
	}
	public void setFriend(int friend) {
		this.friend = friend;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	public abstract boolean Talk(Enemy p);//will be for determining whether or not a conversation was successful
	public abstract void Strike(Enemy p);//will be for determining how an player fights
	public abstract void Mend();//will be for determining how a player mends wounds
	public abstract void specialMove(Enemy p);//will be for special moves

	/**
	 * Levels up player abilities
	 */
	public void levelUp() {
		this.level+=1;
		this.heal+=2;
	}
	/**
	 * levels up player communication abilities
	 */
	public void levelUpFriend() {
		this.friend++;
	}
	

}

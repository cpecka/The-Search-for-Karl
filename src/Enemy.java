/**
 * This is an abstract class that will be the parent of all enemy classes
 * @author colinpecka
 *
 */
public abstract class Enemy {
	
	private int attack;//attack strength
	private int heal;//heal ability
	private int hp;//health points
	
	public Enemy(int hp, int attack, int heal) {
		this.hp = hp;
		this.attack = attack;
		this.heal = heal;
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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public abstract void loss();//distinct loss script 
	public abstract void talked(boolean gtalk);//positive/negative conversation script

}

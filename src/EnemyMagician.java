/**
 * this interface is for enemies with magical powers
 * @author colinpecka
 *
 */
public interface EnemyMagician {
	

	public void castHeal();//magically heals enemy
	
	public void castDamage(Being p);//damages player
	
	public void damageHeal(Being p);//steals player health for enemy

}

package Model;

public class Enemy extends Character
{	
	private String name;
	private Integer damage;
	
	public Enemy(String name, Integer damage, Integer life, Integer mana) 
	{
		super(life, mana);
		this.setName(name);
		this.setDamage(damage);		
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

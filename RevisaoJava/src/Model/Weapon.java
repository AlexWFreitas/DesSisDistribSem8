package Model;

public class Weapon 
{
	private String name;
	private Integer damage;
	
	public Weapon(String name, Integer damage) {
		this.name = name;
		this.damage = damage;
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

package Model;

public class MainCharacter extends Character
{
	private String name;
	private Weapon equippedWeapon;
	
	public MainCharacter(Weapon weapon, String name, Integer life, Integer mana) {
		super(life, mana);
		setName(name);
		setEquippedWeapon(weapon);
	}

	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}

	public void setEquippedWeapon(Weapon equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

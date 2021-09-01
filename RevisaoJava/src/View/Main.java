package View;

import Model.Enemy;
import Model.MainCharacter;
import Model.Weapon;

public class Main 
{
	public static void main(String[] args) 
	{
		Weapon sword = new Weapon("Buster Sword", 255);
		Weapon diamondBreaker = new Weapon("Diamond Breaker", 47474);
		
		MainCharacter protagonist = new MainCharacter(sword, "Cloud Strife", 2550, 2550);		
		
		Enemy behemoth = new Enemy("Behemoth", 1980, 100000, 150000);
		
		protagonist.setEquippedWeapon(diamondBreaker);
		
		behemoth.loseLife(protagonist.getEquippedWeapon().getDamage());
		
		System.out.println(behemoth.getLife());
	}
}

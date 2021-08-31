package View;

import Model.Personagem;

public class Main 
{
	public static void main(String[] args) 
	{
		
		int x = 8;
		int y = 2;
		y = x; 
		x = 5; // y is still 8 because it received the value 8 that was stored in x and not the object x
		
		
		Personagem character = new Personagem("Espermatocléston", 100, 20);
		Personagem otherCharacter = new Personagem("Robson", 20, 20);
		otherCharacter = character;
		character.setNome("Claudinei"); // otherCharacter points to the same object as character, so otherCharacter.getNome returns Claudinei too.
		
		System.out.println(String.format("Personagem %s tem vida %s e mana %s.", otherCharacter.getNome(), otherCharacter.getVida(), otherCharacter.getMana()));
	}
}


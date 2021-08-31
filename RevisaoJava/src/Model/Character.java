package Model;

public class Character 
{	
	private Integer life;
	private Integer mana;
	
	public Character(Integer life, Integer mana)
	{
		setLife(life);
		setMana(mana);
	}
	
	public Integer getLife() 
	{
		return life;
	}
	
	public void setLife(Integer life) 
	{
		this.life = life;
	}
	
	public Integer getMana() 
	{
		return mana;
	}
	
	public void setMana(Integer mana) 
	{
		this.mana = mana;
	}
}

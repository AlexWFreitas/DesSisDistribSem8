package Model;

public class Personagem 
{	
	private Integer vida;
	private Integer mana;
	private String nome;
	
	public Personagem(String nome, Integer vida, Integer mana)
	{
		this.setNome(nome);
		this.vida = vida;
		this.mana = mana;
	}
	
	public Integer getVida() 
	{
		return vida;
	}
	
	public void setVida(Integer vida) 
	{
		this.vida = vida;
	}
	
	public Integer getMana() 
	{
		return mana;
	}
	
	public void setMana(Integer mana) 
	{
		this.mana = mana;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

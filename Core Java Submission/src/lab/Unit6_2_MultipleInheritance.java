package lab;

interface CanFight
{
	void fight();
}
interface CanFly
{
	void fly();
}
class Actor
{
	String name;
	Actor(String name)
	{
		this.name=name;
	}
	void act()
	{
		System.out.println("Actor Does Acting");
	}
}
class ActionHero extends Actor implements CanFight,CanFly
{
	ActionHero(String name)
	{
		super(name);
	}
	@Override
	public void fly() 
	{
		System.out.println("Action Hero can Fly");	
	}
	@Override
	public void fight()
	{
		System.out.println("Action Hero can Fight");
	}	
}
public class Unit6_2_MultipleInheritance {

	public static void main(String[] args) {
		ActionHero hero=new ActionHero("Ajay Devgan");
		hero.act();
		hero.fly();
		hero.fight();
	}

}

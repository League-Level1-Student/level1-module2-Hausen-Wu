package _04_tea_maker;

public class Runner {

	public static void main(String[] args) 
	{
		
		TeaBag t=new TeaBag("Green");
		Kettle k=new Kettle();
		Cup c=new Cup();
		k.boil();
		c.makeTea(t, k.getWater());
		
	}

}

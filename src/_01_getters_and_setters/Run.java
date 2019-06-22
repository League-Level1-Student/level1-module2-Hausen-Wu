package _01_getters_and_setters;

public class Run {
	
	
	public static void main(String[] args) {
		Person p[]=new Person[3];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Person();
		}
		
		p[0].setName("pete");
		p[1].setName("yeet");
		p[2].setName("peet");
		
		p[0].setSuperpower("sleep");
		p[1].setSuperpower("do stuff");
		p[2].setSuperpower("yeet");
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getName()+" has mad "+p[i].getSuperpower()+" skills.");
		}
		//System.out.println(p1.getName().toString());

	}


}

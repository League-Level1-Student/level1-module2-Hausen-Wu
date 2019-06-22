package _01_getters_and_setters;

public class Person {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String name;
		private String superpower;
		
		Person()
		{System.out.println("created");}
		
		String getName()
		{
			
			return this.name;
			
		}
		
		String getSuperpower()
		{
			
			return this.superpower;
			
		}
		
		void setName(String name)
		{
			this.name=name;
		}
		
		void setSuperpower(String superpower)
		{
			this.superpower=superpower;
		}
		
		
	//}

}

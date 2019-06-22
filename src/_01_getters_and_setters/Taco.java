package _01_getters_and_setters;

public class Taco {
	private String meat;
	private String sauce;
	void setMeat(String meat)
	{
		this.meat=meat;
	}
	
	void setSauce(String sauce)
	{
		this.sauce=sauce;
	}
	
	String getMeat()
	{
		
		return this.meat;
		
	}
	
	String getSauce()
	{
		
		return this.sauce;
		
	}

}

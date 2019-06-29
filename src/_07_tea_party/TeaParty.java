package _07_tea_party;
public class TeaParty {

/*	private String name;
	private boolean isWoman;
	private boolean isKnighted;*/
	
	TeaParty(){}
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) 
	{
		String tmp="Hello ";
		
			if(isWoman&&isKnighted!=true)
			{
				tmp=tmp+"Ms. ";
			}
			
			if(isWoman!=true&&isKnighted!=true)
			{
				tmp=tmp+"Mr. ";
			}
			
			if(isWoman&&isKnighted) 
			{
				tmp=tmp+"Lady ";
			}
			
			if(isWoman!=true&&isKnighted) 
			{
				tmp=tmp+"Sir ";
			}
			
        return(tmp+name);
    }



}



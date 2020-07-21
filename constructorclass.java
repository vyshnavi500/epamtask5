package tasks;
import java.util .*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class ConstructionCost
{
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCost.class);
	ConstructionCost()
	{
			double constructionCost;
		    Scanner sc=new Scanner (System. in);
		    LOGGER.fatal("Choose the Material Standard of the House:");
		    LOGGER.fatal("Standard materials-->0\nAbove Standard materials-->1\nHigh Standard materials-->2");		   
		    LOGGER.fatal("High Standard and Auotomated house-->3");
		    int material=sc.nextInt();
		    if(material>=4 ) {
		    	LOGGER.fatal("Please choose Material Standard as Mentioned");
		    }
		    LOGGER.fatal("Give area of the house: ");
		    double area=sc.nextDouble();
		    if(material==0)
		    {
		    	constructionCost=area*1200;
		    	LOGGER.fatal("The Construction cost in INR:"+constructionCost);
		    }
		    else  if(material==1)
		    {
		    	constructionCost=area*1500;
		    	LOGGER.fatal("The Construction cost in INR:"+constructionCost);
		    }
		    else  if(material==2)
		    {
		    	constructionCost=area*1800;
		    	LOGGER.fatal("The Construction cost in INR:"+constructionCost);
		    }
		    else if(material==3)
		    {
		    	constructionCost=area*2500;
		    	LOGGER.fatal("The Construction cost in INR:"+constructionCost);
		    }
		    else {
		    	LOGGER.fatal("Cannot Calculate the Constrution Cost");
		    }
		    	
		   
	}
	
    public static void main (String args[ ])
{
    ConstructionCost cc=new ConstructionCost();
   }
}
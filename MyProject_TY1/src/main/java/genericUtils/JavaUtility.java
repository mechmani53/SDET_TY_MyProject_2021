package genericUtils;

import java.util.Date;
import java.util.Random;


/**
 * this class contains java specific generic libraries
 * @author mani
 */
public class JavaUtility {
/**
 * generate random number
 * @mani
 * 
 */
	public static String getRandomData() 
	{
		Random random=new Random();
		int ran= random.nextInt(1000);
		return ""+ran;
	}
	
	/**
	 * 
	 * Generate current system date
	 * @mani
	 */
	public String getCurrentSystemDate() 
	{
		Date date= new Date();
		String currentDate= date.toString();
		return currentDate;
	}
}
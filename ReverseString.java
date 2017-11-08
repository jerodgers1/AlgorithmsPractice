
public class ReverseString {
	//StringToReverse
	public static String Reverse(String StringToReverse)
	{
		
		String[] tempS = StringToReverse.split("");
		
		int i = StringToReverse.length();
		
		String[] tempS2 = new String[i];
		i--;
		
		for(String value: tempS)
		{
			tempS2[i--] = value;
		}
		
		StringToReverse = "";
		
		for(String value: tempS2)
		{
			StringToReverse = StringToReverse + value;
		}
		
		
		return StringToReverse;
	}
}

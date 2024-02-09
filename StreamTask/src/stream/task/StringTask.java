package stream.task;

public class StringTask {
	public static String findMinWindow(String S1, String S2)   
	{  
	  
	
	String st = "";  
	int value1 = 0;  
	int mini = S1.length() + 1;  
	  
	for (int value = 0; value < S1.length(); value++)   
	{  
	  
	 
	if (S1.charAt(value) == S2.charAt(value1))   
	{  
		value1 = value1 + 1;  
	  
	
	if (value1 == S2.length())   
	{  
	int e = value + 1;  
	value1 = value1 - 1;  
	  
	while (value1 >= 0)   
	{  
	if (S1.charAt(value) == S2.charAt(value1))   
	{  
		value1 = value1 - 1;  
	}  
	value = value - 1;  
	}  
	  
	value1 = value1 + 1;  
	value = value + 1;  
	  
	
	if (e - value < mini)   
	{  
	  
	mini= e - value;  
	  
	st = S1.substring(value, e);  
	}  
	}  
	}  
	}  
	      
	return st;  
	}  
	  
	  
	public static void main(String argvs[])  
	{  
		//StringTask obj = new StringTask();  
	String s1 = "aabcsdeabsed";  
	String s2 = "aes";  
	System.out.println("For the strings \"" + s1 + "\" and \"" + s2 + "\"");  
	  
	String str = StringTask.findMinWindow(s1, s2);  
	System.out.println("The minimum window is : " + str);  
	System.out.println();  
	  
	
	  
	}  
	  
	}  




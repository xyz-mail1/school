import java.util.Date;

class Date1
{
	public static void main(String args[])
	{
		Date date1 = new Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println("date1: Date & Time: " + date1);
		System.out.println("date2: Date & Time: " + date2);
		
	System.out.println ("Elapsed time since Jan 1, 1970 is\n\t"+ date1.getTime()+" miliseconds");
		date1.setTime(date1.getTime() + 100000000);
		System.out.println("Date & Time after 1 crore miliseconds is\n\t" + date1.toString());
	}
}
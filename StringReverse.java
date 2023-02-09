class StringReverse
{
	public static void main(String[] args)
	{
		String str = new String("I like boobs");
		System.out.println("Given string: " + str);
		System.out.println("Reverse string: " + rev(str));
	}
	
	static String rev(String str)    // reverse string
	{
		int len = str.length();
		byte bA[] = new byte[len];
		bA = str.getBytes(); 
		
		for (int i=0, j=len-1; i<len/2; i++, j--) // wtf
		{
			byte tmp = bA[i];
			bA[i]=bA[j];
			bA[j]=tmp;
		}
	return new String(bA); // used constructor
	}
}
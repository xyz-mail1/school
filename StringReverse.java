class StringReverse
{
	public static void main(String[] args)
	{
		String str = new String("I like Java");
		System.out.println("Given string: " + str);
		System.out.println("Reverse string: " + rev(str));
	}
	
	static String rev(String str)   
		int len = str.length();
		byte byteAry[] = new byte[len];
		byteAry = str.getBytes(); 
		
		for (int i=0, j=len-1; i<len/2; i++, j--) 
		{
			byte tmp = byteAry[i];
			byteAry[i]=byteAry[j];
			byteAry[j]=tmp;
		}
	return new String(byteAry); 
	}
}

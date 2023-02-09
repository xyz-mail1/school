class Room
{
	float length, width, height;
	byte nWindows;
	
	void setAttr (float l,float w,float h,byte n)
	{
		length = l; width = w; height = h;
		nWindows = n;
	}
	
	double area ( ){
		return (length*width);
	}
	
	void display ( )
	{
		System.out.println("\nLength: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Number of Windows: " + nWindows);
	}
}

class RoomDemo
{
	public static void main (String args[])
	{
		Room r1 = new Room();
		Room r2 = new Room();
		
		r1.display();
		r2.display();
		
		r1.setAttr (18, 12.5f, 10, (byte)2);
		r2.setAttr (14, 11, 10, (byte)1);
		
		r1.display();
		r2.display();
		
		System.out.println("\nArea of room with length " + r1.length + " width" + r1.width + " is " + r1.area());
		System.out.println("\nArea of room with length " + r2.length + " width" + r2.width + " is " + r2.area());
	}
	
}


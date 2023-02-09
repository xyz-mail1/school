public class CallCost
{
	public static void main(String[] args) {
		double bal = 170, rate = 1.02, dur = 37, cost = dur * rate;
		bal = bal - cost;
		System.out.println("Call duration: " + dur + " Seconds\nBalance: "+bal + " Rupees ");
	}	
}

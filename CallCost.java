public class CallCost
{
	public static void main(String[] args) {
		double balance = 170, rate = 1.02, duration = 37, cost = duration * rate;
		balance = balance - cost;
		System.out.println("Call duration: " + duration + " Seconds\nBalance: "+balance + " Rupees ");
	}	
}

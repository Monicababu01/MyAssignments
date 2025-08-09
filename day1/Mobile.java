package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel = "OPPO";
		float mobileWeight = 678.7f;
		System.out.println("Mobile Model = "+mobileModel);
		System.out.println("Mobile Weight = "+mobileWeight);
		
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 5000;
		System.out.println("Is Fully Charged = "+isFullCharged);
		System.out.println("Mobile Cost = "+mobileCost);
		
		
	}
	
	public static void main(String[] args) {
		Mobile data = new Mobile();
		System.out.println("This is my Mobile");
		data.makeCall();
		data.sendMsg();
		
	}

}

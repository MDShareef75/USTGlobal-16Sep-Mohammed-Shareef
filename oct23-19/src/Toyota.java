
public class Toyota implements AutoMobile,AutoMobileWithAbs{

	public int gear() {
		System.out.println("gear() method of Toyota");
		return 20;
	}
	
	public void gps() {
		System.out.println("gps() method of Toyota");
	}
	
	public void abs() {
		System.out.println("abs() method of Toyota");
	}
}

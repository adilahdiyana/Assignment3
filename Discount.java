package Assignment_3;

public interface Discount {  //2.5 Interface, for discount rate
	
	double discountRate();
}

class WeekendDiscountRate implements Discount { //implementation of interface Discount
	
	public double discountRate() {
		return 0.10;
	}
	
}	//end class of Discount

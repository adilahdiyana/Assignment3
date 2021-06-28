package Assignment3;

import javax.swing.JTable;

public class totalRentPrice implements Payment {  
	
	public double discount() {
		JTable t = Advertisement.getTable();
		String discount="";
		double disc;
		
			if (t == null) {
				return 0.2;
			}
		
			else {
				for(int i = 0; i<t.getRowCount(); i++) { 
				discount= String.valueOf(t.getValueAt(i, 0));}
				disc = Double.parseDouble(discount)/100;
				return disc;}
	
	}
	
	public double Rentprice(String selection, String choose, int quantity) {  //method to calculate rental price per day
		JTable t = AdminInfo.getTable();
		String p = "";
		double price = 0;
			
		for(int i = 0; i<t.getRowCount(); i++) { 
			if (selection.equals(t.getValueAt(i, 0))&&choose.equals(t.getValueAt(i, 1))) {
			p= String.valueOf(t.getValueAt(i, 3));
			price = Double.parseDouble(p);}
			}
		
			if(quantity <= 10) 
				return price;
		
				else
					return price = price - price* discount();} //end of method Rent price
	
	public double getPayment(String selection, String choose, int quantity) {  //method with 3 arguments implement form class interface to calculate total payment
		return quantity*Rentprice(selection, choose, quantity);
	}
	
	public double getPayment(String selection, String choose, int quantity, double discount) {  //method with 4 arguments implement form class interface to calculate total payment
		return quantity*Rentprice(selection, choose, quantity);
	}
	
}  //end totalRentPrice class

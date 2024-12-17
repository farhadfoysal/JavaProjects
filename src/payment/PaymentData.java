package payment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import Main.DBConnection;

public class PaymentData {

	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsp=null;
	private String sql,sqlu,sqlaY;
	
	public PaymentData(){
		con = DBConnection.ConnectionDB();
	}
	
	public void savePaymentData(HashMap<String, String> paymentData) {
		
		
	}
	
	public static void main(String[] args) {
		

	}

}

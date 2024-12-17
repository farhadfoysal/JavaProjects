package payment;

import java.util.HashMap;

public class Payment extends Pay implements Cash,Bank,Bkash,Nagad,Rocket{

    private PaymentData database;

    public Payment(PaymentData database) {
        this.database = database;
    }
	
    public void processPayment(String paymentMethod, HashMap<String, String> paymentData) {
       
        if (paymentMethod.equalsIgnoreCase("bank")) {
            processBankPayment(paymentData);
        } else if (paymentMethod.equalsIgnoreCase("bkash")) {
            processBkashPayment(paymentData);
        } else if (paymentMethod.equalsIgnoreCase("nagad")) {
            processNagadPayment(paymentData);
        } else if (paymentMethod.equalsIgnoreCase("rocket")) {
            processRocketPayment(paymentData);
        }else if (paymentMethod.equalsIgnoreCase("cash")) {
            processCashPayment(paymentData);
        } else {
            System.out.println("Invalid payment method");
        }
    }
    
    private void processCashPayment(HashMap<String, String> paymentData) {
        // Implement the logic to process bank payment using the provided payment data
        // Save payment data to the database
        database.savePaymentData(paymentData);
        System.out.println("Cash payment processed successfully");
    }

    private void processBankPayment(HashMap<String, String> paymentData) {
        // Implement the logic to process bank payment using the provided payment data
        // Save payment data to the database
        database.savePaymentData(paymentData);
        System.out.println("Bank payment processed successfully");
    }

    private void processBkashPayment(HashMap<String, String> paymentData) {
        // Implement the logic to process Bkash payment using the provided payment data
        // Save payment data to the database
        database.savePaymentData(paymentData);
        System.out.println("Bkash payment processed successfully");
    }

    private void processNagadPayment(HashMap<String, String> paymentData) {
        // Implement the logic to process Nagad payment using the provided payment data
        // Save payment data to the database
        database.savePaymentData(paymentData);
        System.out.println("Nagad payment processed successfully");
    }

    private void processRocketPayment(HashMap<String, String> paymentData) {
        // Implement the logic to process Rocket payment using the provided payment data
        // Save payment data to the database
        database.savePaymentData(paymentData);
        System.out.println("Rocket payment processed successfully");
    }
	
	@Override
	public void processRocketPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processNagadPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processBkashPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processBankPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processCashPayment() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {


	}

}

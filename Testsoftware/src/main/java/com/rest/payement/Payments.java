package com.rest.payement;
import java.sql.Date;

import com.rest.order_product.Iorder;
import com.rest.order_product.Order;

public  class Payments  {

	private String billingAdress_id;
	private String CardHolder;
	private char Currency;
	private Date paymentDay;
	
	public Payments() {
		
		billingAdress_id ="";
		CardHolder = "";
		Currency = ' ';
		paymentDay = new Date(0);
	}
	public Payments(String _billingAdress_id, String _cardHolder, char _currency, Date _paymentDay) {
		
		billingAdress_id = _billingAdress_id;
		CardHolder = _cardHolder;
		Currency = _currency;
		paymentDay = _paymentDay;
	}
	public String getBillingAdress_id() {
		return billingAdress_id;
	}
	public void setBillingAdress_id(String billingAdress_id) {
		this.billingAdress_id = billingAdress_id;
	}
	public String getCardHolder() {
		return CardHolder;
	}
	public void setCardHolder(String cardHolder) {
		CardHolder = cardHolder;
	}
	public char getCurrency() {
		return Currency;
	}
	public void setCurrency(char currency) {
		Currency = currency;
	}
	public Date getPaymentDay() {
		return paymentDay;
	}
	public void setPaymentDay(Date _paymentDay) {
		
		paymentDay = _paymentDay;
	}
	
	
	
	
	
	

	  
  
}


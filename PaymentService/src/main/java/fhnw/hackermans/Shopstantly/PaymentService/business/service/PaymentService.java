package fhnw.hackermans.Shopstantly.PaymentService.business.service;

import java.util.Date;

public class PaymentService {
	private int transactionId;
    private int amount;
    private int orderId;
    private Date payday;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getPayday() {
		return payday;
	}
	public void setPayday(Date payday) {
		this.payday = payday;
	}

}

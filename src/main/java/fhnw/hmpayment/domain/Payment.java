package fhnw.hmpayment.domain;

import org.hibernate.Query;
import org.hibernate.LockMode;

import java.util.Date;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@org.hibernate.annotations.Proxy(lazy = false)
@Table(name = "Payment")
public class Payment implements Serializable {


	@Column(name = "transactionID", nullable = false)
	@Id
	@GeneratedValue(generator = "PAYMENT_TRANSACTIONID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name = "PAYMENT_TRANSACTIONID_GENERATOR", strategy = "native")
	private int transactionID;

	@Column(name = "amount", nullable = false)
	private Integer amount;

	@Column(name = "orderId", nullable = false)
	private int orderId;

	@Column(name = "payDate", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date payDate;
	
	
	

	public Payment(Integer amount, int orderId) {
		super();
		this.amount = amount;
		this.orderId = orderId;
		
		this.payDate = new Date();
	
	}

	private void setTransactionID(int value) {
		this.transactionID = value;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public int getORMID() {
		return getTransactionID();
	}

	public void setAmount(int value) {
		setAmount(new Integer(value));
	}

	public void setAmount(Integer value) {
		this.amount = value;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setOrderId(int value) {
		this.orderId = value;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setPayDate(java.util.Date value) {
		this.payDate = value;
	}

	public java.util.Date getPayDate() {
		return payDate;
	}

	public String toString() {
		return String.valueOf(getTransactionID());
	}

}

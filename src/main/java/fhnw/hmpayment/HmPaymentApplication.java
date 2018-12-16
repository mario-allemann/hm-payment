package fhnw.hmpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hmpayment.domain.Payment;
import fhnw.hmpayment.domain.PaymentRepo;

@SpringBootApplication
public class HmPaymentApplication {
	
	
	PaymentRepo payRep;

	public static void main(String[] args) {
		SpringApplication.run(HmPaymentApplication.class, args);
	}
	
	@RequestMapping("/pay")
	@ResponseBody
	int pay(@RequestParam int orderId, @RequestParam int amount) {
		
		Payment payment = new Payment(amount, orderId);
		payRep.save(payment);			
		
		
		return amount*10;
	}
}


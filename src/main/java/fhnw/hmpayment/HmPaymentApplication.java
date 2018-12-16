package fhnw.hmpayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hmpayment.domain.Payment;
import fhnw.hmpayment.domain.PaymentRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class HmPaymentApplication {
	@Autowired
	private PaymentRepo payRep;

	public static void main(String[] args) {
		SpringApplication.run(HmPaymentApplication.class, args);
	}
	
	
	// Map homepage
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "This is the homepage, faggots";
	}

	// Map test page
	@RequestMapping("/payment")
	@ResponseBody
	Iterable<Payment> getAllPayments() {
		return payRep.findAll();
	}
	
	@RequestMapping("/pay")
	@ResponseBody
	int pay(@RequestParam int orderId, @RequestParam int amount) {
		
		
		Payment payment = new Payment(amount, orderId);
		
		payRep.save(payment);		
		
		
		return (int) amount*10;

		
	}
}

package fhnw.hmpayment.domain;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Integer> {

}

package com.demate.hexagonal.application.ports.out;

import java.util.Optional;

import com.demate.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {

	Optional<Customer> find(String id);

}

package SoftwareDev.springdasar.Repository;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository {
    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}

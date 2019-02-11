package org.kiskampi.invoiceservice.customer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerClient customerClient;

    @GetMapping
    public List<CustomerDto> getAllcustomers() {
        return customerClient.getAllCustomers();
    }

    @GetMapping("/instance-info")
    public String getServiceInfo() {
        return customerClient.getInstanceInfo();
    }

}

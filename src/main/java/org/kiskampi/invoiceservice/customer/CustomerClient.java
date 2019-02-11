package org.kiskampi.invoiceservice.customer;

import lombok.AllArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@FeignClient("customer-service")
@Service
interface CustomerClient {

    @GetMapping("/customers")
    List<CustomerDto> getAllCustomers();

    @GetMapping("/instance-info")
    String getInstanceInfo();

//    private final RestTemplate restTemplate;
//
//    List<CustomerDto> getAllCustomers() {
//        ResponseEntity<Object[]> responseEntity = restTemplate.
//                getForEntity("http://localhost:8080/customers", Object[].class);
//        Object[] objects = responseEntity.getBody();
//        return new ArrayList<>();
//    }

}
package org.kiskampi.invoiceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceServiceApplication.class, args);
	}

}


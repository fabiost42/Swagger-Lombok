package com.fabio.Rest;

import com.fabio.Rest.entity.Cliente;
import com.fabio.Rest.service.impl.ClienteServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {

		ApplicationContext context  = SpringApplication.run(RestApplication.class, args);
		ClienteServiceImpl service = context.getBean(ClienteServiceImpl.class);

		Cliente cliente = new Cliente(null,"Antonio", "Rodriguez", LocalDate.now(),"12345678M");
		service.crearCliente(cliente);
	}



}

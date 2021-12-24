package com.example.ABCBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AbcBankApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AbcBankApplication.class, args);
		Customer customer1 = context.getBean(Customer.class);
		customer1.addCustomer("1","Nandhini",123,"a");
		Account account1=context.getBean(Account.class);
		account1.addAccount("1","Nandhini","ABC",5000);

		System.out.println(customer1.getAccountDetails("1"));

		Customer customer2 = context.getBean(Customer.class);
		customer2.addCustomer("2","Shalini",456,"b");
		Account account2=context.getBean(Account.class);
		account1.addAccount("2","Shalini","ABC",10000);

		System.out.println(customer2.getAccountDetails("2"));

		System.out.println(account1.makeTransfer("1","2",2000));
		System.out.println(account1.makeTransfer("2","1",110000));
		account1.getTransferDetails();
	}


}

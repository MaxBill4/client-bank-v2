package com.clientbank.max;

import com.clientbank.max.dao.AccountDao;
import com.clientbank.max.dao.CustomerDao;
import com.clientbank.max.entities.Account;
import com.clientbank.max.entities.Customer;
import com.clientbank.max.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@EnableTransactionManagement
@SpringBootApplication
public class MaxApplication implements ApplicationRunner {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    CustomerDao customerDao;

    @Autowired
    AccountDao accountDao;

    public static void main(String[] args) {
        SpringApplication.run(MaxApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        List<Customer> customers = customerDao.findAll();
        System.out.println(customers);
        List<Account> accounts = accountDao.findAll();
        System.out.println(accounts);
    }
}

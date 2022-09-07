package com.clientbank.max.services;

import com.clientbank.max.dao.AccountDao;
import com.clientbank.max.entities.Account;
import com.clientbank.max.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class AccountService implements I_Service<Account> {

    private final AccountDao accountDao;


    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account getOne(Long id) {
        return accountDao.getOne(id);
    }

    @Override
    public Account save(Account account) {
        return accountDao.save(account);
    }

    @Override
    public void saveAll(List<Account> accounts) {
        accountDao.saveAll(accounts);
    }

    @Override
    public void deleteAll(List<Account> accounts) {
        accountDao.deleteAll(accounts);
    }

    @Override
    public boolean delete(Account account) {
        return accountDao.delete(account);
    }

    @Override
    public boolean deleteById(Long id) {
        return accountDao.deleteById(id);
    }

    public Customer createAccount(Long customerId, Account account) {
        return accountDao.createAccount(customerId, account);
    }

    public boolean toUpAccount (String number, Double amount) {
        return accountDao.toUpAccount(number, amount);
    }

    public boolean withdrawMoney (String number, Double amount) {
        return accountDao.withdrawMoney(number, amount);
    }

    public boolean transferMoney (String from, String to, Double amount) {
        return accountDao.transferMoney(from, to, amount);
    }
}

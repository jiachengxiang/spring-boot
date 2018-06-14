package service.impl;

import model.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.BankRepository;
import service.BankService;

@Service
public class BankServiceImpl implements BankService {
    
    @Autowired
    private BankRepository bankRepository;

    @Override
    public String addbank() {
        
        Bank bank = new Bank();
        bank.setAddr("北京");
        bank.setName("工商银行");
        bank.setCid("sssss");
        Bank save = bankRepository.save(bank);
        return save.getId();
    }

}

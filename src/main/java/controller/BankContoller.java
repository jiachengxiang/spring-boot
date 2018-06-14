package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.BankService;

@RestController
@RequestMapping("bank")
public class BankContoller {

    @Autowired
    private BankService bankService;
    
    @RequestMapping("addBank")
    public String addBank(){
        return bankService.addbank();
    }
    
}

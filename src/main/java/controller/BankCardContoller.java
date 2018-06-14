package controller;

import java.util.List;

import model.BankCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.BankCardService;

@RestController
@RequestMapping("bankCard")
public class BankCardContoller {
 
    @Autowired
    private BankCardService bankCardService;
    
    @RequestMapping("addCard")
    public String addCard() {
        return bankCardService.addCard();
    }
    
    
    @RequestMapping("addBatch")
    public List<BankCard> addBatch() {
        return bankCardService.addCardBatch();
    }
}

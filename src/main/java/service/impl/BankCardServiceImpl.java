package service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.BankCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.BankCardRepository;
import service.BankCardService;

@Service
public class BankCardServiceImpl implements BankCardService {

    @Autowired
    private BankCardRepository bankCardRepository;
    
    /**
     * 
     * <简述>单条插入
     * @author Jia Chengxiang
     * @dateTime 2018-6-13下午3:56:02
     * @return
     */
    @Override
    public String addCard() {
        
        BankCard card = new BankCard();
        BigDecimal valueOf = BigDecimal.valueOf(0);
        card.setId("ijijiji");
        card.setCreateAt(new Date());
        card.setCurrMoney(valueOf);
        card.setUpdateAt(new Date());
        card.setUid("a");
        BankCard save = bankCardRepository.save(card);
        return save.getId();
    }

    /**
     * 批量插入
     * <简述>
     * @author Jia Chengxiang
     * @dateTime 2018-6-13下午3:55:55
     * @return
     */
    @Override
    public List<BankCard> addCardBatch() {
        
        List<BankCard> arrayList = new ArrayList<>();
        
        BigDecimal valueOf ;
        for (int i=0;i<5;i++) {
            //注意  BankCard card = new BankCard(); 放在for外 最终数据只会插入一条，
            BankCard card = new BankCard();
            valueOf = BigDecimal.valueOf(i);
            card.setCreateAt(new Date());
            card.setCurrMoney(valueOf);
            card.setUpdateAt(new Date());
            card.setUid("a");
            arrayList.add(card);
        }
        
        List<BankCard> save = bankCardRepository.save(arrayList);
        return save;
    }
   
}

package service;

import java.util.List;

import model.BankCard;


public interface BankCardService {

    String addCard();

    List<BankCard> addCardBatch();

}

package repository;

import model.BankCard;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankCardRepository extends JpaRepository<BankCard, String> {

}

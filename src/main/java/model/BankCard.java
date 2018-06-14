package model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="T_BANK_CARD")
public class BankCard {
  
    @Id
    @GeneratedValue(generator="card_id")
    @GenericGenerator(name="card_id",strategy="uuid")
    private String id;
    
    private String bid;
    
    @Column(name="user_id")
    private String uid;
    
    private BigDecimal currMoney;
    
    private Date createAt;
    
    private Date updateAt;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public BigDecimal getCurrMoney() {
        return currMoney;
    }

    public void setCurrMoney(BigDecimal currMoney) {
        this.currMoney = currMoney;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    
}

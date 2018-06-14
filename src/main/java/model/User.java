package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user")
public class User {

    //一定要有 id 三个 id 和generate 要同时出现
    @Id
    @GeneratedValue(generator="user_id")
    @GenericGenerator(name="user_id",strategy="uuid")
    private String id;
    
    private String name;
    
    private int age;
    
    @OneToMany(cascade= {CascadeType.ALL},fetch=FetchType.EAGER ,mappedBy="uid")
    private List<BankCard> cardList;
    
    private String rid;
    
    private Date createAt;
    
    private Date updateAt;
    
//    @OneToMany(targetEntity)
//    private List<Role> roleList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
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

    public List<BankCard> getCardList() {
        return cardList;
    }

    public void setCardList(List<BankCard> cardList) {
        this.cardList = cardList;
    }
    
    
}

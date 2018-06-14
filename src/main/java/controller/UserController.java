package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.UserService;



@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;
    
    @RequestMapping("addUser")
    public User addUser() {
        
        User user = new User();
        user.setName("张三");
        user.setAge(12);
        return userService.save(user);
    }
    
    
    @RequestMapping("addUserBatch")
    public List<User> addUserBatch() {
        
        int i = 0;
        List<User> userList = new ArrayList<>();
        while (i<5){
            User user = new User();
            user.setName("张三"+i);
            user.setAge(12);
            user.setCreateAt(new Date());
            user.setUpdateAt(new Date());
            i++;
            userList.add(user);
        }
        return userService.saveBatch(userList);
    }
    
    @RequestMapping("findByName")
    public List<User> findByName(){
        return userService.findByName("张三");
    }
    
    @RequestMapping("findByNamelike")
    public List<User> findByNamelike(){
        return userService.findByNameLike();
    }
    @RequestMapping("findByIdIn")
    public List<User> findByIdIn(){
        return userService.findByIdIn();
    }
    @RequestMapping("findByNameIn")
    public List<User> findByNameIn(){
        List<User> findByNameIn = userService.findByNameIn();
        for (User user : findByNameIn) {
            user.getCardList();
        }
        return findByNameIn;
    }
}

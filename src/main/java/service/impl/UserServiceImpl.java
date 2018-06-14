package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    
    @Override
    public List<User> findByName(String name) {
        User user = new User();
        user.setName(name);
        
        //方式1 多条件查询
        Example<User> example = Example.of(user);
        
        //方式2 设置匹配规则
        ExampleMatcher matcher = ExampleMatcher.matching();
        matcher.withIgnorePaths("id");//忽略
//        matcher.withMatcher("name", ExampleMatcher.GenericPropertyMatchers.endsWith());//匹配规则  name 结尾
        matcher.withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains());//匹配规则  包含 name 
        Example<User> example2 = Example.of(user,matcher);
        userRepository.findAll(example2);
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findByIdIn(){
        List<String> ids = new ArrayList<>();
        ids.add("4028838163f8513d0163f85234120005");
        ids.add("4028838163f8513d0163f85234120006");
        return userRepository.findAll(ids);
    }
    
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveBatch(List<User> userList) {
        return userRepository.save(userList);
    }

    @Override
    public List<User> findByNameIn() {
        List<String> nameList = new ArrayList<>();
        nameList.add("张三0");
        nameList.add("张三4");
        return userRepository.findByNameIn(nameList);
    }

    @Override
    public List<User> findByNameLike() {
        return userRepository.findByNameLike("张三");
    }


}

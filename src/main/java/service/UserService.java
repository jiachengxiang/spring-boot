package service;

import java.util.List;

import model.User;

public interface UserService {

    List<User> findByName(String name);

    User save(User user);

    List<User> saveBatch(List<User> userList);

    List<User> findByIdIn();

    List<User> findByNameIn();

    List<User> findByNameLike();
}

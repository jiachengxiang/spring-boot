package repository;

import java.util.List;

import model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByName(String name);

    List<User> findByNameIn(List<String> nameList);

    List<User> findByNameLike(String string);
}

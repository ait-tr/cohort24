package spring.repository;

import org.springframework.stereotype.Repository;
import spring.domain.User;

@Repository
public class UserRepository {
    public User findUserByLogin(String login){
        return new User(login, "123456", null);
    }
}

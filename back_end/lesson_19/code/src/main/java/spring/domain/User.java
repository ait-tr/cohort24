package spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class User {
    private String login;
    private String password;
    private String firstName;
    private String lastName;

    public User(String login) {
        this.login = login;
    }
}

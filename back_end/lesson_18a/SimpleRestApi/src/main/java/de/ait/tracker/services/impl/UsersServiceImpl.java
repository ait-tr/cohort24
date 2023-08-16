package de.ait.tracker.services.impl;

import de.ait.tracker.dto.NewUserDto;
import de.ait.tracker.dto.UserDto;
import de.ait.tracker.dto.UsersDto;
import de.ait.tracker.exceptions.RestApiException;
import de.ait.tracker.models.User;
import de.ait.tracker.repositories.UsersRepository;
import de.ait.tracker.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static de.ait.tracker.dto.UserDto.from;
/**
 * 8/11/2023
 * SimpleRestApi
 *
 * @author Marsel Sidikov (AIT TR)
 */
@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public UserDto addUser(NewUserDto newUser) {

        if (usersRepository.existsByEmail(newUser.getEmail())) {
            throw new RestApiException(HttpStatus.BAD_REQUEST, "Email <" + newUser.getEmail() + "> already exists");
        }

        User user = User.builder()
                .email(newUser.getEmail())
                .password(newUser.getPassword())
                .firstName(newUser.getFirstName())
                .lastName(newUser.getLastName())
                .role(User.Role.USER)
                .state(User.State.NOT_CONFIRMED)
                .creationDate(LocalDateTime.now())
                .build();

        usersRepository.save(user);

        return from(user);
    }

    @Override
    public UsersDto getAllUsers() {
        List<User> users = usersRepository.findAll();

        return UsersDto.builder()
                .users(from(users))
                .build();
    }
}

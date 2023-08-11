package de.ait.tracker.services;

import de.ait.tracker.dto.NewUserDto;
import de.ait.tracker.dto.UserDto;
import de.ait.tracker.dto.UsersDto;

public interface UsersService {
    UserDto addUser(NewUserDto newUser);

    UsersDto getAllUsers();
}

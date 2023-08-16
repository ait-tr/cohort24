package de.ait.tracker.dto;

import de.ait.tracker.models.User;
import de.ait.tracker.services.impl.UsersServiceImpl;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 8/11/2023
 * SimpleRestApi
 *
 * @author Marsel Sidikov (AIT TR)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Пользователь из системы")
public class UserDto {

    @Schema(description = "Идентификатор пользователя", example = "1")
    private Long id;

    @Schema(description = "Email-пользователя. Должен быть уникальным", example = "sidikov.m@gmail.com")
    private String email;

    @Schema(description = "Имя пользователя", example = "Marsel")
    private String firstName;

    @Schema(description = "Фамилия пользователя", example = "Sidikov")
    private String lastName;

    public static UserDto from(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    public static List<UserDto> from(List<User> users) {
        return users
                .stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }
}

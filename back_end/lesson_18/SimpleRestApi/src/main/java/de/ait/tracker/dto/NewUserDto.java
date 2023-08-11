package de.ait.tracker.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 8/11/2023
 * SimpleRestApi
 *
 * @author Marsel Sidikov (AIT TR)
 */
@Data
@Schema(description = "Новый пользователь")
public class NewUserDto {
    @Schema(description = "Email-пользователя. Должен быть уникальным", example = "sidikov.m@gmail.com")
    private String email;
    @Schema(description = "Пароль пользователя.", example = "qwerty007")
    private String password;
    @Schema(description = "Имя пользователя", example = "Marsel")
    private String firstName;
    @Schema(description = "Фамилия пользователя", example = "Sidikov")
    private String lastName;
}

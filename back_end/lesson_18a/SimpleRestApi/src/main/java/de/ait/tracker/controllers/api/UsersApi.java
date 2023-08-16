package de.ait.tracker.controllers.api;

import de.ait.tracker.dto.ErrorDto;
import de.ait.tracker.dto.NewUserDto;
import de.ait.tracker.dto.UserDto;
import de.ait.tracker.dto.UsersDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/users")
@Tags(value = {
        @Tag(name = "Users")
})
public interface UsersApi {

    @Operation(summary = "Создание пользователя", description = "Доступно только администратору")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Добавленный пользователь",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))
                    }),
            @ApiResponse(responseCode = "400", description = "Email уже есть в системе",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
                    })
    })
    @PostMapping
    ResponseEntity<UserDto> addUser(@RequestBody NewUserDto newUser);

    @Operation(summary = "Получение пользователей", description = "Доступно только всем")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Пользователи",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = UsersDto.class))
                    })
    })
    @GetMapping
    ResponseEntity<UsersDto> getAllUsers();
}

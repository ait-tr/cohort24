package de.ait.tracker.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 8/11/2023
 * SimpleRestApi
 *
 * @author Marsel Sidikov (AIT TR)
 */
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class UsersApiIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addUserReturnCreatedUser() throws Exception {

        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "  \"email\": \"test@mail.com\",\n" +
                        "  \"password\": \"password\",\n" +
                        "  \"firstName\": \"UserFirstName\",\n" +
                        "  \"lastName\": \"UserLastName\"\n" +
                        "}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.email", is("test@mail.com")))
                .andExpect(jsonPath("$.firstName", is("UserFirstName")))
                .andExpect(jsonPath("$.lastName", is("UserLastName")));
    }
}

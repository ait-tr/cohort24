package com.phonebook.restassuredTests;

import com.phonebook.dto.ContactDto;
import com.phonebook.dto.MessageDto;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteContactByIdTests extends TestBase {

    String id;

    @BeforeMethod
    public void preCondition() {

        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan+1@gm.com")
                .phone("12345678901")
                .address("Berlin")
                .description("goalkeeper").build();

        String message1 = given()
                .header("Authorization", TOKEN)
                .body(contactDto)
                .contentType(ContentType.JSON)
                .when()
                .post("contacts")
                .then()
                .extract().path("message");

        String[] all = message1.split(": ");

        id = all[1];
    }

    @Test
    public void deleteContactByIDTest() {

        given()
                .header("Authorization", TOKEN)
                .when()
                .delete("contacts/" + id)
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",equalTo("Contact was deleted!"));
    }
}

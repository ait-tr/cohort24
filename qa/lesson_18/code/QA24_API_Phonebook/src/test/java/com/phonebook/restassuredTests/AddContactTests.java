package com.phonebook.restassuredTests;

import com.phonebook.dto.ContactDto;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddContactTests extends TestBase{

    @Test
    public void addNewContactSuccessTest() {
        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan@gm.com")
                .phone("1234567890")
                .address("Berlin")
                .description("goalkeeper").build();

        String message = given()
                .header("Authorization", TOKEN)
                .body(contactDto)
                .contentType(ContentType.JSON)
                .when()
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().path("message");

        System.out.println(message);

        //Contact was added! ID: af363640-a48a-402a-bbf5-621cbab4f9f0
    }
}

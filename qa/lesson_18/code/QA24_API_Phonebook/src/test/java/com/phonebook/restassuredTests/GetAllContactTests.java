package com.phonebook.restassuredTests;

import com.phonebook.dto.ContactDto;
import com.phonebook.dto.GetAllContactDto;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllContactTests extends TestBase{

    @Test
    public void getAllContactSuccessTest() {
        GetAllContactDto contactsDto = given()
                .header("Authorization", TOKEN)
                .when()
                .get("contacts")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(GetAllContactDto.class);
        List<ContactDto> list = contactsDto.getContacts();

        for (ContactDto contact: list) {
            System.out.println(contact.getId());
            System.out.println(contact.getEmail());
            System.out.println("Size of list - " + list.size());
        }
    }
}

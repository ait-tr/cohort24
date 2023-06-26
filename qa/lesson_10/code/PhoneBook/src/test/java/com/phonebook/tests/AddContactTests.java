package com.phonebook.tests;

import com.phonebook.fw.DataProviders;
import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("kr@gmail.com")
                .setPassword("Kr1234567$"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        //click on ADD link
        app.getContact().clickOnAddLink();
        //  int i = (int) (System.currentTimeMillis() / 1000)%3600;
        //fill in all fields
        app.getContact().fillAddContactForm(new Contact()
                .setName("Karl")
                .setLastname("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Koblenz")
                .setDesc("goalkeeper"));
        //click on save button
        app.getContact().clickOnSaveButton();
        //assert contact is added
        Assert.assertTrue(app.getContact().isContactCreated("Karl"));
    }

    @Test(dataProvider = "addContact",dataProviderClass = DataProviders.class)
    public void addContactPositiveFromDataProviderTest(String name, String lastname, String phone,
                                                       String email, String address, String description) {

        app.getContact().clickOnAddLink();

        app.getContact().fillAddContactForm(new Contact()
                .setName(name)
                .setLastname(lastname)
                .setPhone(phone)
                .setEmail(email)
                .setAddress(address)
                .setDesc(description));

        app.getContact().clickOnSaveButton();

        Assert.assertTrue(app.getContact().isContactCreated(name));
    }

    @Test(dataProvider = "addContactFromCsvFile",dataProviderClass = DataProviders.class)
    public void addContactPositiveFromCsvFileTest(Contact contact) {

        app.getContact().clickOnAddLink();

        app.getContact().fillAddContactForm(contact);

        app.getContact().clickOnSaveButton();
    }

    @AfterMethod
    public void postCondition() {
        app.getContact().removeContact();
    }

}

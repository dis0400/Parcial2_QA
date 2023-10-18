package filaA;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import webUI.pages.todoly.LoginSection;
import webUI.pages.todoly.MainPage;
import webUI.pages.todoly.MenuSection;
import webUI.session.Session;

import java.util.Random;
public class Ejercicio3 {

    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    static Random rand = new Random();

    static String nameUser;
    static String nameProject;

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }

    @BeforeEach
    public void open() {
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }

    @Test
    public void createUserLogInCreateProject() throws InterruptedException {

        mainPage.signupButton.click();

        nameUser="chis"+rand.nextInt(255)+rand.nextInt(255)+"@prueba.com";
        signUpSection.fullName.setText("Alexia MArin");
        signUpSection.email.setText(nameUser);
        signUpSection.passwordSignUp.setText("12345");
        signUpSection.checkboxTerms.click();
        signUpSection.signUpButton.click();

        menuSection.logoutButton.click();

        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(nameUser);
        loginSection.passwordTextBox.setText("12345");
        loginSection.loginButton.click();

}

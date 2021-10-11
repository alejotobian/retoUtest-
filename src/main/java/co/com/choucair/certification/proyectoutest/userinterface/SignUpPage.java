package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class SignUpPage extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("FIRST NAME")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("LAST NAME")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("EMAIL")
            .located(By.id("email"));
    public static final Target INPUT_SELECTDATEBIRTH = Target.the("EMAIL")
            .located(By.name("birthMonth"));




    //public static final Target BUTTON_NEXT = Target.the("Next page").located(By.className("btn btn-blue"));

}

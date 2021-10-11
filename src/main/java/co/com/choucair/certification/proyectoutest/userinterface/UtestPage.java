package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")

public class UtestPage extends PageObject {

    public static final Target BUTTON_LOGIN = Target.the(
            "SignUp for Utest").located(By.className("unauthenticated-nav-bar__sign-up"));

}

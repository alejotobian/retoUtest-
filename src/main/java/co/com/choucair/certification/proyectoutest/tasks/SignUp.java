package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.userinterface.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUp implements Task{

    public static SignUp OnThePage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actorBtn) {
        actorBtn.attemptsTo(Enter.theValue("Yessika").into(SignUpPage.INPUT_FIRSTNAME),
              Enter.theValue("Andrea").into(SignUpPage.INPUT_LASTNAME),
                Enter.theValue("ejemploYessika@ejemplo.com").into(SignUpPage.INPUT_EMAIL));
    }
}

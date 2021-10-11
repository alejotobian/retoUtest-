package co.com.choucair.certification.proyectoutest.stepdefinitions;

import co.com.choucair.certification.proyectoutest.tasks.OpenUp;
import co.com.choucair.certification.proyectoutest.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;

public class UtestPageStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Yessika wants join in utest$")
    public void thanYessikaWantsJoinInUtest() throws Exception{
        OnStage.theActorCalled("actor").wasAbleTo(OpenUp.thePage());
    }

    @When("^she do click in jointoday$")
    public void sheDoClickInJointoday() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.OnThePage());
    }

    @Then("^she can singup in the page utest$")
    public void sheCanSingupInThePageUtest() {
    }

}

package co.com.banistmo.prueba.task;

import co.com.banistmo.prueba.userinterface.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    Page page;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    };
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));

    }
}

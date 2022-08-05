package co.com.banistmo.prueba.task;

import co.com.banistmo.prueba.userinterface.LibrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CartTask implements Task {
    public static CartTask Click(){
        return Tasks.instrumented(CartTask.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LibrosPage.BUTTON_ADDMASTERING),
                Click.on(LibrosPage.BUTTON_ADDRUBYCART),
                WaitUntil.the(LibrosPage.BUTTON_ADDMASTERING, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),

                Click.on(LibrosPage.BUTTON_ADDMASTERING),
                Click.on(LibrosPage.BUTTON_CART)

        );
    }
}

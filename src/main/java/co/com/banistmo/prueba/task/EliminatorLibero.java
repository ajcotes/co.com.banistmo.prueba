package co.com.banistmo.prueba.task;

import co.com.banistmo.prueba.userinterface.EliminarLibroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.opencv.imgproc.CLAHE;

import java.security.Key;

public class EliminatorLibero implements Task {
    public static EliminatorLibero Eliminar(){
        return Tasks.instrumented(EliminatorLibero.class);
    };
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("0").into(EliminarLibroPage.E_LIBRO),
                Click.on(EliminarLibroPage.BUTTON_UPDATE)

               ) ;

    }
}

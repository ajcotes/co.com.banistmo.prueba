package co.com.banistmo.prueba.questions;

import co.com.banistmo.prueba.userinterface.LibrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;

public class Answers implements Question<Boolean> {
    private String question;

    public Answers(String question) {
        this.question = question;
    }

    public static Answers toThe(String question){
        return new Answers(question);
    }




    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        int pregunta;
       pregunta = Integer.valueOf(String.valueOf(question));
        int PrecioTotal= Integer.valueOf(String.valueOf(LibrosPage.PRICE_TOTAL));
        if (PrecioTotal< pregunta){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}


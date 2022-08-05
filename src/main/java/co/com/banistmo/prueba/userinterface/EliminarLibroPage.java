package co.com.banistmo.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarLibroPage extends PageObject {
    public static final Target E_LIBRO = Target.the("ELIMINAR LIBRO")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input"));
    public static final Target BUTTON_UPDATE= Target.the("ELIMINAR LIBRO")
            .located(By.xpath("  /html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[3]/td/input[1]"));


}

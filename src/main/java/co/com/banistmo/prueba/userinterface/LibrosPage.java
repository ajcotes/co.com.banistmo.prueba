package co.com.banistmo.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LibrosPage extends PageObject {
    public static final Target BUTTON_ADDRUBYCART = Target.the("ADD RUBY AL CARRITO")
            .located(By.cssSelector("[data-product_id='160']"));
    public static final Target BUTTON_ADDMASTERING = Target.the("ADD MASTERING")
            .located(By.cssSelector("[data-product_id='165']"));
    public static final Target BUTTON_CART = Target.the("BUTTON CARRITO")
            .located(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a"));
    public static final Target PRICE_TOTAL = Target.the("PRECIO TOTAL")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span"));


}

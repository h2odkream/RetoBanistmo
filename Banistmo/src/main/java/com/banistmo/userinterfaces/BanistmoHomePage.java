package com.banistmo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class BanistmoHomePage extends PageObject {
    public static final Target SERVICES_AND_PRODUCTS = Target.the("Services and products")
            .located(By.xpath("//a[@href=\"#productosYserviciosPersonas\"]"));
    public static final Target BANIKIDS = Target.the("Banikids")
            .located(By.xpath("(//a[@href=\"/wps/portal/banistmo/personas/productos-y-servicios/banikids/\"])[2]"));
    public static final Target CHARGES_AND_FARES = Target.the("charges and fares")
            .located(By.xpath("//a[@href=\"#tab4\"]"));
    public static final Target DOWNLOAD_PDF = Target.the("Download Deposit Account Rates PDF")
            .located(By.xpath("(//img[@src=\"/wps/wcm/connect/b5812573-aa98-42f4-8ee1-f2a4bd15e467/pdf-icon.png?MOD=AJPERES&CACHEID=ROOTWORKSPACE-b5812573-aa98-42f4-8ee1-f2a4bd15e467-m1cIl8g\"])[1]"));

}

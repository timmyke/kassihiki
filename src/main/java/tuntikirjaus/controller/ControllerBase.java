/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tuntikirjaus.controller;

/**
 *
 * @author timmy
 */
public abstract class ControllerBase {
    
    /**
     * Palautttaa polun näkymään. Olettaa, että näkymä sijaitsee 
     * kontrollerin luokan nimen mukaisessa kansiossa.
     * Esim. Jos metodia kutsutaan TestController -luokasta,
     * on näkymän löydyttävä polusta TestController/sivu.jsp.
     * @param page JSP-sivu
     * @return kontrolleri/sivu.jsp
     */
    public final String View(String page) {
        String path = this.getClass().getName();
        path = path.substring(path.lastIndexOf('.') + 1);
        return path + "/" + page;
    }
    
    /**
     * Polku näkymään.
     * @param page jsp-sivun nimi.
     * @param controller Kontrollerin nimi.
     * @return 
     */
    public final String View(String page, String controller) {
        if (controller != null)
            return controller + "/" + page;
        return page;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontroler;

import forme.KlijentskaForma;
import java.util.List;
import model.User;

/**
 *
 * @author vldmrk
 */
public class Kontroler {

    private static Kontroler instance;
    private KlijentskaForma kf;

    private Kontroler() {
    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }

        return instance;
    }

    public void azurirajTabelu(List<User> useri) {
        kf.azurirajTabelu(useri);
    }

    public void setKf(KlijentskaForma kf) {
        this.kf = kf;
    }

}

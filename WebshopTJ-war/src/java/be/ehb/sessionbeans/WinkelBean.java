/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.ehb.sessionbeans;

import be.ehb.entities.ProductTJ;
import be.ehb.winkelmandje.WinkelMandjeSource;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @authors : Van Hoecke Manith
 *
 */
@Named("WMBean")
@RequestScoped
public class WinkelBean implements Serializable {

    @EJB
    private WinkelMandjeSource winkelMandjeSource;

    public WinkelBean() {
    }

    public WinkelMandjeSource getWinkelMandjeSource() {
        return winkelMandjeSource;
    }

    public ArrayList<ProductTJ> getData() {
        return winkelMandjeSource.getWinkelLijst();
    }

    public String addProductTJ(int id) {
        winkelMandjeSource.addProductTJ(id);
        return "winkelmandje.xhtml";
    }

    public String removeProductTJ(int id) {
        winkelMandjeSource.removeProductTJ(id);
        return "winkelmandje.xhtml";
    }

    public String nToevoegen(int i) {
        if (i == 1 || i == 0) {
            i += 1;
        }
        return "winkelmandje.xhtml";
    }

    public String nVerwijderen(int i) {
        if (i > 0) {
            i -= 1;
        }

        return "winkelmandje.xhtml";
    }

}

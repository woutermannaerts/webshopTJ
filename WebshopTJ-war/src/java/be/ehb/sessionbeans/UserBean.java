/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.sessionbeans;

import be.ehb.controllers.UserDAO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author mobapp02
 */
@Named("UBean")
@RequestScoped
public class UserBean implements Serializable {

    @EJB
    private UserDAO uDAO;

    public UserBean() {
    }

    public UserDAO getsDAO() {
        return uDAO;
    }

    public String saveAndGoHome(int id, String naam, String adres, int telefoonnummer, String email, int creditcard) {
        if (uDAO.createUser(id, naam, adres, telefoonnummer, email, creditcard)) {
            return "inlog.xhtml";
        } else {
            return "inlog.xhtml";
        }
    }

    public String goNewUser() {
        return "winkelmandje.xhtml";
    }

}

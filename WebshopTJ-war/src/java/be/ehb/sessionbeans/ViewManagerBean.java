/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.sessionbeans;

import be.ehb.controllers.ProductDAO;
import be.ehb.entities.ProductTJ;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author mobapp02
 */
@RequestScoped
@Named("VMBean")
public class ViewManagerBean implements Serializable {

    @EJB
    private ProductDAO sDAO;
    
    String gekozen;

    public String getGekozen() {
        return gekozen;
    }

    public void setGekozen(String gekozen) {
        this.gekozen = gekozen;
    }

    public ViewManagerBean() {
        gekozen = "all";
    }

    public ProductDAO getsDAO() {
        return sDAO;
    }
    
    public List<ProductTJ> toonCategorie(String categorie){
        if(categorie.equals("all"))
        return sDAO.findAllProducts();
        else
        return sDAO.toonCategorie(categorie);
    }
    
    public String toonPagina(String gekozen){
    
        if(gekozen == null)gekozen = "all";
        
        this.gekozen = gekozen;
        
        return "index";
    }

}

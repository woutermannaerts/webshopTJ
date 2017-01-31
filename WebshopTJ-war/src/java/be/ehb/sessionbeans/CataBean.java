/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.sessionbeans;

import be.ehb.dao.ProductDAO;
import be.ehb.entities.ProductTJ;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mobapp02
 */


@Named("VMBean")
@SessionScoped
public class CataBean implements Serializable {

    @EJB
    private ProductDAO sDAO;

    public CataBean() {
    }

    public ProductDAO getsDAO() {
        return sDAO;
    }
    
    public List<ProductTJ> showProducts()
    {
        return sDAO.findAllProducts();
    }
    
    
}

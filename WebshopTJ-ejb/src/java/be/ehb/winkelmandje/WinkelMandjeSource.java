/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.ehb.winkelmandje;

import be.ehb.entities.ProductTJ;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.validator.Validator;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @authors : Van Hoecke Manith
 *            
 */

@Stateful
public class WinkelMandjeSource {

    @PersistenceContext(unitName = "WebshopTJ-ejbPU")
    private EntityManager em;

    private ArrayList<ProductTJ> winkelLijst;
    private static final Logger LOG = Logger.getLogger(WinkelMandjeSource.class.getName());

    
    
    public WinkelMandjeSource() {
        winkelLijst = new ArrayList<>();
    }

    public ArrayList<ProductTJ> getWinkelLijst() {
        return winkelLijst;
    }
    
    public void removeProductTJ(int siD){
        ProductTJ productTJToBeRemoved = em.getReference(ProductTJ.class, siD);
        em.remove(productTJToBeRemoved);
    }
    
    public void addProductTJ(int siD){
        ProductTJ productTJToBeAdded = em.find(ProductTJ.class, siD);
       
        LOG.log(Level.SEVERE, productTJToBeAdded.toString());
        
        winkelLijst.add(productTJToBeAdded);
    }
    
    
}

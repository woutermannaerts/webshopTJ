/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.dao;

import be.ehb.entities.ProductTJ;
import java.util.List;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author mobapp02
 */

@Stateless
public class ProductDAO {

    @PersistenceContext(unitName = "WebshopTJ-ejbPU")
    private EntityManager em;

    public ProductDAO() {
    }

    public List<ProductTJ> findAllProducts() {
        TypedQuery<ProductTJ> tq = em.createNamedQuery("ProductTJ.findAll", ProductTJ.class);

        List<ProductTJ> resultaten = tq.getResultList();

        return resultaten;
    }
    
    
}

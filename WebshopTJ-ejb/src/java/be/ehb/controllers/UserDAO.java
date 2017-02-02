/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.controllers;

import be.ehb.entities.Users;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 *
 * @author mobapp02
 */

@Stateful
public class UserDAO {
    
    @PersistenceContext(unitName = "WebshopTJ-ejbPU")
    private EntityManager em;
    
    @Resource
    Validator validator;
    
    private static final Logger LOG = Logger.getLogger(UserDAO.class.getName());
    
    private int lastSelectedID;

    public UserDAO() {
    }
    
    public boolean createUser(int id, String naam, String adres, int telefoonnummer, String email, int creditcard)
    {
        Users s = new Users(id, naam, adres, telefoonnummer, email, creditcard);
        em.persist(s);

        Set<ConstraintViolation<Users>> violations = validator.validate(s);

        if (violations.isEmpty()) {

            em.persist(s);

            em.flush();
            return true;
        }

        for (ConstraintViolation<Users> violation : violations) {
            LOG.log(Level.WARNING, violation.getMessage());
        }
        return false;
    }


    
    
     
    
}

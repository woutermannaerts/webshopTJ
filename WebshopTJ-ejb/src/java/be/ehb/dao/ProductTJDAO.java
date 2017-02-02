/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.ehb.dao;

import be.ehb.entities.ProductTJ;
import java.util.List;

/**
 *
 * @authors : Van Hoecke Manith
 *            
 */
public class ProductTJDAO {
    public interface ProductDAO{
        public List<ProductTJ> getAllProductTJ();
        public ProductTJ getProductTJ(int i);
        public void updateProductTJ(ProductTJ productTJ);
        public void deleteProductTJ(ProductTJ productTJ);
    }
}

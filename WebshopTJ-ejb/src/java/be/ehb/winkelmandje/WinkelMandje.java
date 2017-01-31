/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.winkelmandje;

import be.ehb.entities.ProductTJ;
import java.util.ArrayList;

/**
 *
 * @author mobapp02
 */
public class WinkelMandje {
    
    private ArrayList<ProductTJ> winkelmandje;

    public WinkelMandje(ArrayList<ProductTJ> winkelmandje) {
        this.winkelmandje = winkelmandje;
    }

    public ArrayList<ProductTJ> getWinkelmandje() {
        return winkelmandje;
    }

    public ProductTJ voegProductToe(ProductTJ p){
        return p;
    }
    
    public ProductTJ verwijderProduct(ProductTJ p){
        return p;
    }
    
}

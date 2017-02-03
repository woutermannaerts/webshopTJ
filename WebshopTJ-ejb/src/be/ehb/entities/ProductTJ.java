/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mobapp03
 */
@Entity
@Table(name = "productTJ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductTJ.findAll", query = "SELECT p FROM ProductTJ p")
    ,
    @NamedQuery(name = "ProductTJ.findById", query = "SELECT p FROM ProductTJ p WHERE p.id = :id")
    ,
    @NamedQuery(name = "ProductTJ.findByPrijs", query = "SELECT p FROM ProductTJ p WHERE p.prijs = :prijs")
    ,
    @NamedQuery(name = "ProductTJ.findByCategorie", query = "Select p FROM ProductTJ p WHERE p.categorie = :categorie")})
public class ProductTJ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "naam")
    private String naam;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "categorie")
    private String categorie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prijs")
    private double prijs;

    public ProductTJ() {
    }

    public ProductTJ(Integer id) {
        this.id = id;
    }

    public ProductTJ(Integer id, String naam, String categorie, double prijs) {
        this.id = id;
        this.naam = naam;
        this.categorie = categorie;
        this.prijs = prijs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTJ)) {
            return false;
        }
        ProductTJ other = (ProductTJ) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "be.ehb.entities.ProductTJ[ id=" + id + " ]";
    }

    public void incrementQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
